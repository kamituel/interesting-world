(ns kamituel.ngm-toc.events
  (:require [re-frame.core :as rf]
            [clairvoyant.core :refer-macros [trace-forms]]
            [re-frame-tracer.core :refer [tracer]]
            [kamituel.ngm-toc.utils.spec :as spec-util]
            [kamituel.ngm-toc.db :as db]))


(def check-spec-interceptor (rf/after (partial spec-util/check-and-throw :kamituel.ngm-toc.db/db)))

(def interceptors [check-spec-interceptor
                   (when ^boolean js/goog.DEBUG rf/debug)])

(rf/reg-event-db
 :initialize
 (fn ev-initialize [_ _]
   db/default-db))

(rf/reg-event-db
 :google-maps-api-ready
 interceptors
 (fn ev-google-maps-api-ready [db _]
   (assoc db :show-map true)))

(rf/reg-event-db
 :query-update
 interceptors
 (fn ev-query-update [db [_ query]]
   (assoc db :query query)))

(rf/reg-event-db
 :peek
 interceptors
 (fn ev-peek [db [_ peek-type data]]
   (if-not (:confirmed (:peek db))
     (assoc db :peek {:type peek-type :data data :confirmed false})
     db)))

(rf/reg-event-db
 :peek-confirm
 interceptors
 (fn ev-peek-confirm [db [_ peek-type data]]
   (assoc db :peek {:type peek-type :data data :confirmed true})))

(rf/reg-event-db
 :peek-cancel
 interceptors
 (fn ev-peek-cancel [db _]
   (if-not (:confirmed (:peek db))
     (assoc db :peek {:type nil :data nil :confirmed false})
     db)))

(rf/reg-event-db
 :peek-unconfirm-and-cancel
 interceptors
 (fn ev-peek-unconfirm-and-cancel [db _]
   (assoc db :peek {:type nil :data nil :confirmed false})))

(rf/reg-event-db
 :include-articles-with-no-coordinates
 interceptors
 (fn include-articles-with-no-coordinates [db [_ include]]
   (assoc db :include-articles-with-no-coordinates include)))
