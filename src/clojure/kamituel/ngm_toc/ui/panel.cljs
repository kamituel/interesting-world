(ns kamituel.ngm-toc.ui.panel
  ""
  (:require [clojure.string :as str]
            [re-frame.core :refer [dispatch]]
            [reagent.core :as r]
            [kamituel.ngm-toc.react-compat :as rc]
            [kamituel.ngm-toc.ui.utils :as ui-utils]))


(defn list-of-articles
  [articles peeked-article]
  (for [{:keys [title description vol month year country city region] :as article} articles]
    [rc/list-item {:onMouseEnter #(dispatch [:peek-article :result-list article])
                   :onClick #(dispatch [:peek-article :result-list article])
                   :onMouseLeave #(dispatch [:peek-article nil nil])
                   :className (when (= article (:article peeked-article)) "highlighted")
                   :innerDivStyle (when (and (:article peeked-article)
                                             (not= article (:article peeked-article))
                                             (= :map (:source peeked-article)))
                                    {:opacity 0.1})}
     [:h2 title]
     [:div.description description]
     [:div.issue "Numer: " vol " (" month "/" year ")"]
     ;; TODO: Wiki links for cities and regions too.
     (when country (into [:div.location "Kraj: "] (mapcat (fn [country-name]
                                                  [[:a {:target "_blank"
                                                       :href (str "https://pl.wikipedia.org/wiki/Special:Search/" country-name)} country-name] ", "]) country)))
     (when city [:div.location "Miasto: " (or (str/join ", " city) "-")])
     (when region [:div.location "Region: " (or (str/join ", " region) "-")])]))

(defn sidebar-view
  "Includes a search box and a list of articles (that matched a search query)."
  []
  (let [this (r/current-component)
        {:keys [articles peeked-article include-articles-with-no-coordinates]} (r/props this)]
    [rc/paper {:id "sidebar"}
      [:div#search-box
       [:div
       [rc/font-icon {:className "material-icons"} "search"]
       [rc/text-field {:className "search-input"
                       :hintText "Japonia, jaskinia, puszcza ..."
                       :floatingLabelText "Co Cię interesuje?"
                       :fullWidth true
                       :onChange (fn [_evt value] (dispatch [:query-update value]))}]]
       [:div.search-tools
         [rc/checkbox {:label "Tylko z lokalizacją"
                       :defaultChecked (not include-articles-with-no-coordinates)
                       :onCheck (fn [_evt toggled]
                                  (dispatch [:include-articles-with-no-coordinates (not toggled)]))
                       :iconStyle {:height "18px"
                                   :marginRight "4px"}
                       :labelStyle {:fontSize "12px"
                                    :lineHeight "20px"}
                       :style {:marginLeft "34px"}}]
         [:div.result-count "Znaleziono: " (count articles) " artykuł(ów)"]]]
     (into [rc/list- {:className "result-list"}]
           (list-of-articles articles peeked-article))]))

(defn component-did-update
  [this]
  (let [props (r/props this)
        result-list (.querySelector (r/dom-node this) ".result-list")
        highlighted (.querySelector (r/dom-node this) ".highlighted")]

    (when highlighted
      (let [highlighted-list-item (aget highlighted "parentElement")]
        (ui-utils/scroll-element-into-view result-list highlighted-list-item)))))

(def sidebar
  (r/create-class {:reagent-render sidebar-view
                   :component-did-update component-did-update}))
