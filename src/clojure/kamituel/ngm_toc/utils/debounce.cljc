(ns kamituel.ngm-toc.utils.debounce
  "Debouncer for re-frame's dispatches. Any number of calls to (dispatch) within ttl-ms timeout
  will result in an only one actual dispatch happening - for the particular event."
  #?(:cljs (:require-macros [cljs.core.async.macros :refer [go-loop alt!]]))
  (:require #?(:cljs [cljs.core.async :refer [<! put! chan sliding-buffer timeout close!]]
               :clj [clojure.core.async :refer [<! put! chan sliding-buffer timeout go-loop alt! close!]])
            [re-frame.core :as rf]
            [kamituel.ngm-toc.utils.log :as l]))

(rf/reg-event-db :debounce
 (fn debounce [db [_ ttl-ms payload]]
   (let [event (first payload)
         ch (get-in db [::debounce event])]
     (l/trace "Debounce <%s>. Channel exists? <%s>" event (some? ch))
     (if-not ch
       (let [ch (chan (sliding-buffer 1))]
         (go-loop [p payload]
           (alt!
            (timeout ttl-ms) (do
                               (l/trace "Dispatching " event " with payload " p)
                               (rf/dispatch p)
                               (rf/dispatch [:debounce-clear event]))
            ch ([p-new _]
                (l/trace "Another call happened  for " event ". Not dispatching just yet.")
                (recur p-new))))
         (assoc-in db [::debounce event] ch))
       (do
         (put! ch payload)
         db)))))

(rf/reg-event-db
 :debounce-clear
 (fn debounce-clear [db [_ event]]
   (let [ch (get-in db [::debounce event])]
     (when ch
       (close! ch)
       (update db ::debounce #(dissoc % event))))))

(defn debounce
  [ttl-ms payload]
  (rf/dispatch [:debounce ttl-ms payload]))
