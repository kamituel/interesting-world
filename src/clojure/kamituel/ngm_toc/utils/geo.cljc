(ns kamituel.ngm-toc.utils.geo)

(defn sin
  [x]
  #?(:cljs (js/Math.sin x)
     :clj 0))

(defn cos
  [x]
  #?(:cljs (js/Math.cos x)
     :clj 0))

(defn atan2
  [y x]
  #?(:cljs (js/Math.atan2 y x)
     :clj 0))

(defn sqrt
  [x]
  #?(:cljs (js/Math.sqrt x)
     :clj 0))

(defn ->radians
  [n]
  (/ (* n #?(:cljs js/Math.PI :clj 0))
     180))

(defn distance
  ""
  [p1 p2]
  (let [R 6371E3 ; Earth radius
        [lat-1 lon-1] p1
        [lat-2 lon-2] p2
        phi-1 (->radians lat-1)
        phi-2 (->radians lat-2)
        delta-phi (->radians (- lat-2 lat-1))
        delta-lambda (->radians (- lon-2 lon-1))
        a (+ (* (sin (/ delta-phi 2)) (sin (/ delta-phi 2)))
             (* (cos phi-1) (cos phi-2)
                (sin (/ delta-lambda 2)) (sin (/ delta-lambda 2))))
        c (* 2 (atan2 (sqrt a) (sqrt (- 1 a))))]
    (* R c)))
