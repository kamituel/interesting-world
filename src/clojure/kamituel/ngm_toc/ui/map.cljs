(ns kamituel.ngm-toc.ui.map
  ""
  (:require [clojure.set :as sett]
            [re-frame.core :refer [dispatch]]
            [kamituel.ngm-toc.model :as model]
            [kamituel.ngm-toc.ui.utils :as ui-utils]
            [kamituel.ngm-toc.utils.debounce :refer [debounce]]
            [reagent.core :as r]))

(defn coordinates-pixel-offset
  [map lat-lng offset]
  (assert map "map")
  (let [scale (js/Math.pow 2 (.getZoom map))
        projection (.getProjection map)
        _ (assert projection "projection")
        lat-lng-obj (new (aget js/window "google" "maps" "LatLng") (:lat lat-lng) (:lng lat-lng))
        _ (.log js/console lat-lng (.lat lat-lng-obj) (.lng lat-lng-obj))
        world-coordinate-center (.fromLatLngToPoint projection lat-lng-obj)
        pixel-offset (js/google.maps.Point. (/ (:x offset) scale)
                                            (/ (:y offset) scale))
        world-coordinate-new-center (js/google.maps.Point. (- (aget world-coordinate-center "x") (aget pixel-offset "x"))
                                                           (- (aget world-coordinate-center "y") (aget pixel-offset "y")))
        new-center (.fromPointToLatLng projection world-coordinate-new-center)]
    new-center))

(defn adjusted-center
  [map-container map lat-lng]
  (let [{:keys [width]} (ui-utils/bounding-client-rect map-container)]
    ;; Shift map by around 1/4th of the screen width should be enough to account for sidebar panel
    ;; width.
    (coordinates-pixel-offset map lat-lng {:x (/ width 4) :y 0})))

(def map-style
  "Adapted from: https://snazzymaps.com/style/151/ultra-light-with-labels"
  [{:featureType "water" :elementType "geometry" :stylers [{:color "#D3DEEA"} {:lightness 17}]}
   {:featureType "landscape" :elementType "geometry" :stylers [{:color "#f5f5f5"} {:lightness 20}]}
   {:featureType "road.highway" :elementType "geometry.fill" :stylers [{:color "#ffffff"} {:lightness 17}]}
   {:featureType "road.highway" :elementType "geometry.stroke" :stylers [{:color "#ffffff"} {:lightness 29} {:weight 0.2}]}
   {:featureType "road.arterial" :elementType "geometry" :stylers [{:color "#ffffff"} {:lightness 18}]}
   {:featureType "road.local" :elementType "geometry" :stylers [{:color "#ffffff"} {:lightness 16}]}
   {:featureType "poi" :elementType "geometry" :stylers [{:color "#f5f5f5"} {:lightness 21}]}
   {:featureType "poi.park" :elementType "geometry" :stylers [{:color "#dedede"} {:lightness 21}]}
   {:elementType "labels.text.stroke" :stylers [{:visibility "on"} {:color "#ffffff"} {:lightness 16}]}
   {:elementType "labels.text.fill" :stylers [{:saturation 36} {:color "#333333"} {:lightness 40}]}
   {:elementType "labels.icon" :stylers [{:visibility "off"}]}
   {:featureType "transit" :elementType "geometry" :stylers [{:color "#f2f2f2"} {:lightness 19}]}
   {:featureType "administrative" :elementType "geometry.fill" :stylers [{:color "#fefefe"} {:lightness 20}]}
   {:featureType "administrative" :elementType "geometry.stroke" :stylers [{:color "#dddddd"} {:lightness 17} {:weight 1.2}]}])

(defn default-map-options
  "It has to be a function to force it to evaluate only once Google Maps API is loaded."
  []
  {:zoom 3
   ;; Siedlce.
   ;; TODO: base initial center on browser's location?
   :center {:lat 52.15 :lng 22.266667}
   :background-color "#FFCE00" ; NGM color
   :fullscreenControl false
   :mapTypeControl true
   :mapTypeControlOptions {:position (aget js/google.maps.ControlPosition "RIGHT_TOP")}
   :minZoom 3
   :panControl false
   :rotateControl false
   :scaleControl true
   :streetViewControl false
   :styles map-style})

(defn marker-icon
  [mode]
  {:path "M-20,0a20,20 0 1,0 40,0a20,20 0 1,0 -40,0"
   :fillColor (if (= :peeked mode) "#FF0000" "#FFCE00") ; Red or NGM color.
   :fillOpacity (if (= :not-peeked mode) 0.3 1)
   :strokeWeight 10
   :strokeOpacity 0 ; Larger stroke makes it easy to point an icon on a map.
   :scale (if (= :peeked mode) 0.3 0.15)})

(defn google-map-view
  []
  (let [this (r/current-component)
        {:keys [a b c]} (r/props this)]
    [:div#map]))

(defn create-marker
  [g-map point]
  (let [{:keys [coords article]} point
        spec {:position {:lat (first coords)
                         :lng (second coords)}
              :map g-map}
        marker (js/google.maps.Marker. (clj->js spec))]
    (doto marker
          ;; Delay (debounce) effect of those actions in order to avoid rapid flickering when
          ;; cursor moves over a map.
          (.addListener "mouseover" #(debounce 100 [:peek-article :map (:article point)]))
          (.addListener "mouseout" #(debounce 100 [:peek-article nil nil]))
          (.addListener "click" #(dispatch [:peek-article :map (:article point)])))))

(defn set-marker-icon
  "Marker icon can be either fully visible (in a normal state), almost transparent (when other
  marker is peeked at) or red (when this marker is being looked at).
    - point - point with a :marker meta."
  [point peeked-article]
  (let [icon-type (cond
                    ;; This point is selected.
                    (= (:article point) (:article peeked-article))
                    :peeked

                    ;; Some point(s) is selected, but not this one.
                    (and (some? (:article peeked-article))
                         (model/has-coords? (:article peeked-article)))
                    :not-peeked

                    :else
                    :regular)]
    (.setIcon (:marker (meta point)) (clj->js (marker-icon icon-type)))))

(defn map-update-markers
  ""
  [this]
  (let [{:keys [points peeked-article]} (r/props this)
        {:keys [g-map points-on-a-map]} (r/state this)
        new-points (set points)
        ;; Points that are present in props, but are not yet reprsented as markers on a map.
        ;; Those should be added to the map now.
        points-not-present-yet (sett/difference new-points points-on-a-map)
        ;; Markers that are present on a map, but are not represented as points in props anymore.
        ;; Those should be removed from the map now.
        points-not-present-anymore (sett/difference points-on-a-map new-points)

        added-points (set (doall (map (fn [point]
                                        ;; Put marker in meta so that we can store all that in a set.
                                        (with-meta point {:marker (create-marker g-map point)}))
                                      points-not-present-yet)))

        removed-points (set (doall (map (fn [point]
                                           (let [{:keys [marker]} (meta point)]
                                             (assert marker "marker")
                                             (.setMap marker nil)))
                                        points-not-present-anymore)))
        new-point-set (sett/union (sett/difference points-on-a-map points-not-present-anymore)
                                  added-points)]
    (run! #(set-marker-icon % peeked-article) new-point-set)
    (r/set-state this {:points-on-a-map new-point-set})
    ;; Sanity checks.
    (prn "Number of points-on-a-map" (count (:points-on-a-map (r/state this))))
    (assert (= (count new-points) (count new-point-set)))
    (assert (every? #(some? (:marker (meta %))) new-point-set))))

(defn map-update-center
  "Sets map center to the first coordinate of the currently peeked article. Center point is adjusted
  to accomodate panel on the left."
  [this]
  (let [map-container (.querySelector js/document "#map")
        {:keys [peeked-article]} (r/props this)
        {:keys [g-map]} (r/state this)]
    (when (and (= :result-list (:source peeked-article))
               (model/has-coords? (:article peeked-article)))
      (let [new-center {:lat (first (first (model/coords (:article peeked-article))))
                        :lng (second (first (model/coords (:article peeked-article))))}]
        (.panTo g-map (clj->js (adjusted-center map-container g-map new-center)))))))

(defn map-init
  "Map can be initialized only after component did mount, so that div#map is already available."
  [this]
  (let [map-container (.querySelector js/document "#map")
        _ (assert map-container "map-container")
        opts (default-map-options)
        g-map (js/google.maps.Map. map-container (clj->js opts))]
    ;; Projection isn't available right away, and we need it to calculate where the adjusted map
    ;; center should be.
    (.addListener g-map "projection_changed"
                  #(.setCenter g-map (adjusted-center map-container g-map (:center opts))))
    (r/set-state this {:g-map g-map})
    (map-update-markers this)))

(def google-map
  (r/create-class {:reagent-render google-map-view
                   :get-initial-state (fn []
                                        {:g-map nil
                                         :points-on-a-map #{}})
                   :component-did-mount map-init
                   :component-did-update (fn [this]
                                           (map-update-markers this)
                                           (map-update-center this))}))
