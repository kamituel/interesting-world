(ns kamituel.ngm-toc.utils.log)

(defn trace
  [& args]
  #_(let [arguments (concat args ["color: #aaa"])]
    #?(:cljs (apply js/console.log (clj->js arguments))
       :clj (apply prn args))))
