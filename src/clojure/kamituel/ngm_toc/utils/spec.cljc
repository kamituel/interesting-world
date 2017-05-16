(ns kamituel.ngm-toc.utils.spec
  (:require #?(:cljs [cljs.spec :as s]
               :clj [clojure.spec :as s])))


(defn check-and-throw
  "Throw an exception if db doesn't match the spec. Adapted from:
  https://github.com/Day8/re-frame/blob/master/examples/todomvc/src/todomvc/events.cljs#L12"
  [a-spec db]
  (when-not (s/valid? a-spec db)
    (throw (ex-info (str "DB not conforming to spec: " (s/explain-str a-spec db)) {}))))
