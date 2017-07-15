(ns kamituel.ngm-toc.ui.panel
  ""
  (:require [clojure.string :as str]
            [re-frame.core :refer [dispatch]]
            [clairvoyant.core :refer-macros [trace-forms]]
            [re-frame-tracer.core :refer [tracer]]
            [reagent.core :as r]
            [kamituel.ngm-toc.ui.colors :refer [colors]]
            [kamituel.ngm-toc.ui.react-compat :as rc]
            [kamituel.ngm-toc.ui.utils :as ui-utils]
            [kamituel.ngm-toc.utils.debounce :refer [debounce]]))


;(trace-forms {:tracer (tracer :color "blue")}

(defn place
  "Given a place spec, returns a [:span] with a human readable description of that place. Each
  element of the description, like a country or a city, is a clickable link to the corresponding
  Wikipedia article (with no guarantee such article will be found, though)."
  [{:keys [country city region]}]
  (let [wiki-link (fn [thing]
                    [:a {:target "_blank"
                         :href (str "https://pl.wikipedia.org/wiki/Special:Search/" thing)} thing])
        a-country (wiki-link country)
        a-city (wiki-link city)
        a-region (wiki-link region)]
    (cond
      (and country (not city) (not region))
      [:span a-country]

      (and country city (not region))
      [:span a-city " (" a-country ")"]

      (and country city region)
      [:span a-city " (" a-region ", " a-country ")"]

      (and country (not city) region)
      [:span a-region " (" a-country ")"]

      (and (not country) city (not region))
      [:span a-city]

      (and (not country) city region)
      [:span a-city " (" a-region ")"]

      (and (not country) (not city) region)
      [:span a-region]

      :else
      [:span])))

(defn article-list
  [articles]
  (into [rc/list- {:className "result-list"}]
    articles))

(defn article-item
  [{:keys [title description vol month year places]}]
  [[:div.description description]
   [:div.issue "Numer: " vol " (" month "/" year ")"]
   (into [:div.location] (interpose ", " (map place places)))])

(defn plain-list-of-articles
  [articles peeked-article]
  (for [article articles]
    (into [rc/list-item {:onMouseEnter #(dispatch [:peek :article article])
                         :onClick #(dispatch [:peek-confirm :article article])
                         :onMouseLeave #(dispatch [:peek-cancel nil nil])
                         :className (when (= article (:article peeked-article)) "highlighted")
                         :innerDivStyle (when (and (:article peeked-article)
                                                   (not= article (:article peeked-article))
                                                   (= :map (:source peeked-article)))
                                          {:opacity 0.1})}
           [:h2 (:title article)]]
          (article-item article))))

(defn distance-oriented-list-of-articles
  [articles]
  (for [article articles
        :let [idx (:idx (meta article))]]
    (into [rc/list-item
           [:h2 [rc/avatar {:backgroundColor (get colors idx)}] (:title article)]]
          (article-item article))))

(defn sidebar-view
  "Includes a search box and a list of articles (that matched a search query)."
  [& args]
  (let [this (r/current-component)
        {:keys [articles peeked-article peeked-point peeked-point-vicinity
                include-articles-with-no-coordinates article-count too-many-articles]} (r/props this)]
    [rc/paper {:id "sidebar"}
      [:div#search-box
       [:div
       [rc/font-icon {:className "material-icons"} "search"]
       [rc/text-field {:className "search-input"
                       :hintText "Japonia, jaskinia, puszcza ..."
                       :floatingLabelText "Co Cię interesuje?"
                       :fullWidth true
                       :onChange (fn [_evt value] (debounce 0 [:query-update value]))}]]
       [:div.search-tools
         [rc/checkbox {:label "Tylko z lokalizacją"
                       :defaultChecked (not include-articles-with-no-coordinates)
                       :onCheck (fn [_evt toggled]
                                  (dispatch [:include-articles-with-no-coordinates (not toggled)]))
                       :iconStyle {:height "18px"
                                   :marginRight "2px"}
                       :labelStyle {:fontSize "12px"
                                    :lineHeight "20px"}
                       :style {:marginLeft "34px"}}]
        (when-not too-many-articles
          [:div.result-count "Znaleziono: " article-count " artykuł(ów)"])]]
     (cond
       peeked-point
       (article-list (distance-oriented-list-of-articles peeked-point-vicinity))

       too-many-articles
       nil

       (not (empty? articles))
       (article-list (plain-list-of-articles articles peeked-article))

       :else
       [:div.no-results-found
        [rc/font-icon {:className "material-icons"} "mood_bad"]
        "Brak pasujących artykułów ..."])]))

(def sidebar
  (r/create-class {:reagent-render sidebar-view}))

;)
