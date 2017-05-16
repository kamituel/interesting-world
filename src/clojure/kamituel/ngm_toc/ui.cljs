(ns kamituel.ngm-toc.ui
  ""
  (:require [clojure.string :as str]
            [cljsjs.react]
            [cljsjs.react.dom]
            [reagent.core :as r]
            [re-frame.core :refer [dispatch]]
            [kamituel.ngm-toc.react-compat :as rc]
            [kamituel.ngm-toc.ui.map :as map]
            [kamituel.ngm-toc.ui.panel :as panel]))


(defn ui
  [{:keys [show-map articles points peeked-article peeked-point peeked-point-vicinity
           include-articles-with-no-coordinates]}]
  (let [args {:articles @articles
              :points @points
              :peeked-article @peeked-article
              :peeked-point @peeked-point
              :peeked-point-vicinity @peeked-point-vicinity
              :include-articles-with-no-coordinates @include-articles-with-no-coordinates}]
    [rc/mui-theme-provider
     [:div
      (when @show-map [map/google-map args])
      [panel/sidebar args]]]))
