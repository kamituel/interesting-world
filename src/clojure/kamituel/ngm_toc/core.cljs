(ns kamituel.ngm-toc.core
  ""
  (:require [clojure.string :as str]
            [cljsjs.react]
            [cljsjs.react.dom]
            [reagent.core :as r]
            [re-frame.core :as rf]
            [kamituel.ngm-toc.db :as db]
            [kamituel.ngm-toc.model :as model]
            [kamituel.ngm-toc.ui :as ui]))

;;  TODO: do not print in prod.
(enable-console-print!)

(rf/reg-event-db
 :initialize
 (fn [_ _]
   {;; Database.
    :ngm-issues db/ngm
    ;; Article that user is interested in because he/she pointed it either on a results list,
    ;; or on a map.
    :peeked-article {:source nil :article nil}
    ;; Current search query.
    :query ""
    ;; True if articles with no coordinates should be included in search results.
    :include-articles-with-no-coordinates false
    ;; Map can be shown only after Google Maps API is loaded.
    :show-map false}))

(aset js/window "initMap" (fn [] (rf/dispatch [:google-maps-api-ready])))

(rf/reg-event-db
 :google-maps-api-ready
 (fn [db _]
   (prn "Showing a map")
   (assoc db :show-map true)))

(rf/reg-event-db
 :query-update
 (fn [db [_ query]]
   (assoc db :query query)))

(rf/reg-event-db
 :peek-article
 (fn [db [_ peek-source article]]
   (prn "Peek an article" peek-source (:title article))
   (-> db
       (assoc-in [:peeked-article :source] peek-source)
       (assoc-in [:peeked-article :article] article))))

(rf/reg-event-db
 :include-articles-with-no-coordinates
 (fn [db [_ include]]
   (assoc db :include-articles-with-no-coordinates include)))

(rf/reg-sub
 :filtered-articles
 (fn [db _]
   (let [{:keys [ngm-issues query peeked-article include-articles-with-no-coordinates]} db
         query (str/lower-case query)]
     (->> (model/ngm-issues->articles ngm-issues)
          (filter #(model/article-matches? % query))
          (filter #(model/has-required-coordinates? % include-articles-with-no-coordinates))))))

(rf/reg-sub
 :peeked-article
 (fn [db _]
   (:peeked-article db)))

(rf/reg-sub
 :map-points
 :<- [:filtered-articles]
 (fn [filtered-articles _]
   (let [articles-with-coords (filter model/has-coords? filtered-articles)]
     (mapcat (fn [article]
               (map (fn [place]
                      {:coords (:coords place) :article article})
                    (filter #(some? (:coords %)) (:places article))))
             articles-with-coords))))

(rf/reg-sub
 :include-articles-with-no-coordinates
 (fn [db _]
   (:include-articles-with-no-coordinates db)))

(rf/reg-sub
 :show-map
 (fn [db _]
   (:show-map db)))

(defn run
  []
  (rf/dispatch-sync [:initialize])
  (r/render [ui/ui {:articles (rf/subscribe [:filtered-articles])
                    :peeked-article (rf/subscribe [:peeked-article])
                    :points (rf/subscribe [:map-points])
                    :include-articles-with-no-coordinates (rf/subscribe [:include-articles-with-no-coordinates])
                    :show-map (rf/subscribe [:show-map])}]
            (js/document.getElementById "app")))

(run)
