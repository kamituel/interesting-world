(ns kamituel.ngm-toc.model
  ""
  (:require [clojure.string :as str]))

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
      ;; TODO: test hose
      (some #(str/includes? (or % "") query) (map :country (:places article)))
      (some #(str/includes? (or % "") query) (map :city (:places article)))
      (some #(str/includes? (or % "") query) (map :region (:places article)))))

(defn coords
  ""
  [article]
  (->> (:places article)
       (filter #(some? (:coords %)))
       (map :coords)))

(defn has-coords?
  ""
  [article]
  (not (empty? (coords article))))

(defn has-required-coordinates?
  "Returns true if an article has coordinates, or if coordinates aren't required for an article."
  [article include-articles-with-no-coordinates]
  (if include-articles-with-no-coordinates
    true
    ;; TODO: test it.
    (has-coords? article)))
