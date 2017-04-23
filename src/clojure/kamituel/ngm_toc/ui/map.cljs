(ns kamituel.ngm-toc.ui.map
  ""
  (:require [re-frame.core :refer [dispatch]]
            [kamituel.ngm-toc.react-compat :as rc]))


(defn map-point
  "A single point on a map."
  [point peeked-article]
  (let [{:keys [article coord]} point]
    [rc/avatar {:size 10
                :className (cond
                             ;; This point is selected.
                             (= article (:article peeked-article))
                             "map-point selected"

                             ;; Some point(s) is selected, but not this one.
                             (some? (:article peeked-article))
                             "map-point dim"

                             :else
                             "map-point")
                :lat (first coord)
                :lng (second coord)} ""]))

(defn google-map
  "Renders a Google Map with all points marked."
  [{:keys [points peeked-article]}]
  [:div#map
   (into [rc/google-map {:defaultCenter {:lat 50 :lng -10}
                         :center (when (and (= :result-list (:source peeked-article))
                                            (:coords (:article peeked-article)))
                                   {:lat (first (first (:coords (:article peeked-article))))
                                    :lng (second (first (:coords (:article peeked-article))))})
                         :defaultZoom 0
                         :onChildMouseEnter (fn [idx _]
                                              (dispatch [:peek-article :map (:article (nth points idx))]))
                         :onChildMouseLeave (fn [_ _]
                                              (dispatch [:peek-article nil nil]))}]
         (for [point points]
           (map-point point peeked-article)))])
