(ns kamituel.ngm-toc.devcards
  (:require-macros [devcards.core :as dc])
  (:require [kamituel.ngm-toc.data.ngm :as ngm]
            [kamituel.ngm-toc.react-compat :as rc]
            [kamituel.ngm-toc.ui.panel :as panel]))

(def panel
  (dc/reagent (fn [data] [rc/mui-theme-provider [panel/sidebar @data]])))

(dc/defcard empty
  panel)

(dc/defcard filled
  panel
  {:articles (:articles (first ngm/ngm))})

(dc/defcard article-peeked-on-list
  panel
  {:articles (:articles (first ngm/ngm))
   :peeked-article {:source :map
                    :article (second (:articles (first ngm/ngm)))}})

(dc/defcard point-peeked-on-map
  panel
  {:articles (:articles (first ngm/ngm))
   :peeked-point [1 2]
   :peeked-point-vicinity (let [articles (:articles (first ngm/ngm))]
                            [(with-meta (nth articles 1) {:idx 0})
                             (with-meta (nth articles 3) {:idx 0})
                             (with-meta (nth articles 5) {:idx 1})])})
