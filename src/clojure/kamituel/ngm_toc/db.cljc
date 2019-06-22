(ns kamituel.ngm-toc.db
  (:require #?(:clj [clojure.spec.alpha :as s]
               :cljs [cljs.spec.alpha :as s])
            [kamituel.ngm-toc.data.ngm :as ngm]))

(s/def ::coords (s/coll-of number? :kind vector? :count 2))

(s/def :ngm-article/title string?)
(s/def :ngm-article/description string?)
(s/def :ngm-article/tags (s/coll-of string?))
(s/def :ngm-article/country string?)
(s/def :ngm-article/region string?)
(s/def :ngm-article/city string?)
(s/def :ngm-article/place (s/keys :opt-un [:ngm-article/country :ngm-article/region
                                           :ngm-article/city ::coords :ngm-article/tags]))
(s/def :ngm-article/places (s/coll-of :ngm-article/place :kind vector? :min-count 1 :distinct true))
(s/def ::ngm-article (s/keys :req-un [:ngm-article/title :ngm-article/description]
                             :opt-un [:ngm-article/places :ngm-article/tags]))
(s/def :ngm-issue/year number?)
(s/def :ngm-issue/month number?)
(s/def :ngm-issue/vol number?)
(s/def :ngm-issue/articles (s/coll-of ::ngm-article :min-count 1))
(s/def ::ngm-issue (s/keys :req-un [:ngm-issue/year :ngm-issue/month
                                    :ngm-issue/articles]
                           :opt-un [:ngm-issue/vol]))
(s/def ::ngm-issues (s/coll-of ::ngm-issue :min-count 1))

;; Current search query.
(s/def ::query string?)

;; User can 'peek' by either hovering over a list of articles, or my hovering over a specific
;; place on a map. :type will be :article or :point, respectively.
;; Peek might be:
;;    {:type :point :data [23.112 54.1031] :confirmed ...}
;;    {:type :article :data ...article... :confirmed ...}
;; It might also be nil in case no article is being peeked at the moment.
;; If a peek is confirmed,it will keep being selected when cursor moves out from that point on
;; a map, or from the article on a list.
(s/def ::type (s/nilable #{:article :point}))
(s/def ::data (s/nilable (s/or :a ::ngm-article :c ::coords)))
(s/def ::confirmed boolean?)
(s/def ::peek (s/keys :req-un [::type ::data ::confirmed]))

;; If true, articles without coordinates should appear on the list and on the map.
(s/def ::include-articles-with-no-coordinates boolean?)

;; Map API will be loaded asynchronously. This will be used to tell the UI that it can now
;; mount a map component safely.
(s/def ::show-map boolean?)

(s/def ::max-result-count pos?)

(s/def ::db (s/keys :req-un [::ngm-issues ::peek ::query ::include-articles-with-no-coordinates ::show-map]))

(def default-db
  {:ngm-issues ngm/ngm #_(apply concat (repeat 10 ngm/ngm))
   :peek {:type nil :data nil :confirmed false}
   :query ""
   :include-articles-with-no-coordinates false
   :show-map false
   :max-result-count 100})
