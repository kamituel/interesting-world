(ns kamituel.ngm-toc.core
  ""
  (:require [clojure.string :as str]
            [cljsjs.react]
            [cljsjs.react.dom]
            [reagent.core :as r]
            [re-frame.core :as rf]
            [clairvoyant.core :refer-macros [trace-forms]]
            [re-frame-tracer.core :refer [tracer]]
            [kamituel.ngm-toc.events]
            [kamituel.ngm-toc.subs]
            [kamituel.ngm-toc.ui :as ui]))

;(trace-forms {:tracer (tracer :color "green")})

(defn run
  []
  (rf/dispatch-sync [:initialize])
  (r/render [ui/ui {:articles (rf/subscribe [:filtered-articles])
                    :peeked-article (rf/subscribe [:peeked-article])
                    :peeked-point (rf/subscribe [:peeked-point])
                    :peeked-point-vicinity (rf/subscribe [:peeked-point-vicinity])
                    :points (rf/subscribe [:map-points])
                    :include-articles-with-no-coordinates (rf/subscribe [:include-articles-with-no-coordinates])
                    :show-map (rf/subscribe [:show-map])
                    :article-count (rf/subscribe [:article-count])
                    :too-many-articles (rf/subscribe [:too-many-articles])}]
            (js/document.getElementById "app")))

(run)
