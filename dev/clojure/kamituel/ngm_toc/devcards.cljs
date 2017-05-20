(ns kamituel.ngm-toc.devcards
  (:require-macros [devcards.core :as dc])
  (:require [kamituel.ngm-toc.data.ngm :as ngm]
            [kamituel.ngm-toc.ui.panel :as panel]
            [kamituel.ngm-toc.ui.react-compat :as rc]))

(def panel
  (dc/reagent (fn [data] [rc/mui-theme-provider [panel/sidebar @data]])))

(dc/defcard empty
  panel
  {:article-count 0})

(dc/defcard too-many-articles
  panel
  {:articles []
   :article-count 500
   :too-many-articles true})

(dc/defcard filled
  panel
  {:articles (:articles (first ngm/ngm))
   :article-count 6})

(dc/defcard article-peeked-on-list
  panel
  {:articles (:articles (first ngm/ngm))
   :article-count 6
   :peeked-article {:source :map
                    :article (second (:articles (first ngm/ngm)))}})

(dc/defcard point-peeked-on-map
  panel
  {:articles (:articles (first ngm/ngm))
   :article-count 6
   :peeked-point [1 2]
   :peeked-point-vicinity (let [articles (:articles (first ngm/ngm))]
                            [(with-meta (nth articles 1) {:idx 0})
                             (with-meta (nth articles 3) {:idx 0})
                             (with-meta (nth articles 5) {:idx 1})])})
