(ns kamituel.ngm-toc.subs
  ""
  (:require [clojure.string :as str]
            [re-frame.core :as rf]
            [clairvoyant.core :refer-macros [trace-forms]]
            [re-frame-tracer.core :refer [tracer]]
            [kamituel.ngm-toc.model :as model]
            [kamituel.ngm-toc.utils.geo :as geo]))

(def distance-memoized geo/distance)

(rf/reg-sub
 :filtered-articles
 (fn sub-filtered-articles [db]
   (let [{:keys [ngm-issues query include-articles-with-no-coordinates]} db
         query (str/lower-case query)]
     (->> (model/ngm-issues->articles ngm-issues)
          (filter #(model/article-matches? % query))
          (filter #(model/has-required-coordinates? % include-articles-with-no-coordinates))))))

(rf/reg-sub
 :article-count
 :<- [:filtered-articles]
 (fn sub-article-count [filtered-articles]
   (count filtered-articles)))

(rf/reg-sub
 :max-result-count
 (fn sub-max-result-count [db]
   (:max-result-count db)))

(rf/reg-sub
 :too-many-articles
 :<- [:article-count]
 :<- [:max-result-count]
 (fn sub-too-many-articles [[article-count max-result-count]]
   (> article-count max-result-count)))

(rf/reg-sub
 :peeked-article
 (fn sub-peeked-article [db _]
   (let [peek (:peek db)]
     (when (= :article (:type peek))
       (:data peek)))))

(rf/reg-sub
 :peeked-point
 (fn sub-peeked-point [db _]
   (let [peek (:peek db)]
     (when (= :point (:type peek))
       (:data peek)))))

(rf/reg-sub
 :peeked-point-vicinity
 :<- [:filtered-articles]
 :<- [:peeked-point]
 (fn sub-peeked-point-vicinity [[filtered-articles peeked-point] _]
   (when peeked-point
     (let [add-distance-to-peeked-point
           (fn [article]
             (let [coords (->> (:places article)
                               (filter :coords) ; Not every place has a coord.
                               (map :coords))
                   distance (->> coords
                                 (map (partial distance-memoized peeked-point))
                                 sort
                                 first)]
               (assoc article :distance-to-peeked-point distance)))]
       (->> filtered-articles
            (filter model/has-coords?) ; filtered-articles might include articles without coords.
            ;; TODO: not do this dance, just have a smarter fn in sort-by.
            (map add-distance-to-peeked-point)
            (sort-by :distance-to-peeked-point)
            (take 3)

            (reduce (fn [xs article]
                      (let [prev-article (last xs)
                            prev-idx (get (meta prev-article) :idx -1)
                            idx (if (= (:distance-to-peeked-point prev-article)
                                       (:distance-to-peeked-point article))
                                  prev-idx
                                  (inc prev-idx))]
                        (conj xs (with-meta article {:idx idx}))))
                    [])
            (map #(dissoc % :distance-to-peeked-point)))))))

(rf/reg-sub
 :map-points
 :<- [:filtered-articles]
 (fn sub-map-points [filtered-articles _]
   (let [articles-with-coords (filter model/has-coords? filtered-articles)]
     (mapcat (fn [article]
               (map (fn [place]
                      {:coords (:coords place) :article article})
                    (filter #(some? (:coords %)) (:places article))))
             articles-with-coords))))

(rf/reg-sub
 :include-articles-with-no-coordinates
 (fn sub-include-articles-with-no-coordinates [db _]
   (:include-articles-with-no-coordinates db)))

(rf/reg-sub
 :show-map
 (fn sub-show-map [db _]
   (:show-map db)))
