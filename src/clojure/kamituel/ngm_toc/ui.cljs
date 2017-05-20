(ns kamituel.ngm-toc.ui
  ""
  (:require [clojure.string :as str]
            [cljsjs.react]
            [cljsjs.react.dom]
            [reagent.core :as r]
            [re-frame.core :refer [dispatch]]
            [kamituel.ngm-toc.ui.map :as map]
            [kamituel.ngm-toc.ui.panel :as panel]
            [kamituel.ngm-toc.ui.react-compat :as rc]))


(defn ui
  [{:keys [show-map articles points peeked-article peeked-point peeked-point-vicinity
           include-articles-with-no-coordinates article-count too-many-articles]}]
  (let [args {:articles @articles
              :points @points
              :peeked-article @peeked-article
              :peeked-point @peeked-point
              :peeked-point-vicinity @peeked-point-vicinity
              :include-articles-with-no-coordinates @include-articles-with-no-coordinates
              :article-count @article-count
              :too-many-articles @too-many-articles}]
    [rc/mui-theme-provider
     [:div
      (when @show-map [map/google-map args])
      [panel/sidebar args]]]))
