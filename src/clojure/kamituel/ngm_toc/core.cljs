(ns kamituel.ngm-toc.core
  ""
  (:require [clojure.string :as str]
            [cljsjs.react]
            [cljsjs.react.dom]
            [reagent.core :as r]
            [re-frame.core :as rf]
            [kamituel.ngm-toc.db :as db]
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
    :include-articles-with-no-coordinates false}))

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


(defn ngm-issues->articles
  "Converts a database of NGM issues into a flat collection where each item represents a single
  article."
  [ngm-issues]
  (mapcat (fn [ngm-issue]
            (map (fn [article]
                   (merge article (select-keys ngm-issue [:year :month :vol])))
                 (:articles ngm-issue)))
          ngm-issues))

(defn article-matches?
  "Returns true if an article matches a search query."
  [article query]
  (or (str/includes? (str/lower-case (:title article)) query)
      (str/includes? (str/lower-case (:description article)) query)
      (str/includes? (str/lower-case (str/join " " (:country article))) query)
      (str/includes? (str/lower-case (str/join " " (:city article))) query)
      (str/includes? (str/lower-case (str/join " " (:region article))) query)))

(defn has-required-coordinates?
  "Returns true if an article has coordinates, or if coordinates aren't required for an article."
  [article include-articles-with-no-coordinates]
  (if include-articles-with-no-coordinates
    true
    (some? (:coords article))))

(rf/reg-sub
 :filtered-articles
 (fn [db _]
   (let [{:keys [ngm-issues query peeked-article include-articles-with-no-coordinates]} db
         query (str/lower-case query)]
     (->> (ngm-issues->articles ngm-issues)
          (filter #(article-matches? % query))
          (filter #(has-required-coordinates? % include-articles-with-no-coordinates))))))

(rf/reg-sub
 :peeked-article
 (fn [db _]
   (:peeked-article db)))

(rf/reg-sub
 :map-points
 :<- [:filtered-articles]
 (fn [filtered-articles _]
   (let [articles-with-coords (filter :coords filtered-articles)]
     (mapcat (fn [article]
               (map (fn [coord]
                      {:coord coord :article article}) (:coords article)))
             articles-with-coords))))

(rf/reg-sub
 :include-articles-with-no-coordinates
 (fn [db _]
   (:include-articles-with-no-coordinates db)))

(defn run
  []
  (rf/dispatch-sync [:initialize])
  (r/render [ui/ui {:articles (rf/subscribe [:filtered-articles])
                    :peeked-article (rf/subscribe [:peeked-article])
                    :points (rf/subscribe [:map-points])
                    :include-articles-with-no-coordinates (rf/subscribe [:include-articles-with-no-coordinates])}]
            (js/document.getElementById "app")))

(run)
