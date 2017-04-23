(ns kamituel.ngm-toc.ui.utils)


(defn bounding-client-rect
  [element]
  (let [rect (.getBoundingClientRect element)]
    (into {} (for [k ["width" "height" "top" "right" "bottom" "left"]]
               [(keyword k) (aget rect k)]))))

(defn element-invisible-above?
  "Returns true if element is not fully visible within a parent element, and it's above the fold
  (parent element is scrolled down and that has hidden element)."
  [parent element]
  (< (:top (bounding-client-rect element))
     (:top (bounding-client-rect parent))))

(defn element-invisible-below?
  "Returns true if element is not fully visible within a parent and it's below the fold."
  [parent element]
  (> (:bottom (bounding-client-rect element))
     (:bottom (bounding-client-rect parent))))

(defn scroll-element-into-view
  "Scrolls an element into so it's visible within a parent."
  [parent element]
  (cond
    ;; Result list is so short it can't even fit a single list item.
    ;; In this case, just scroll to the top to fit as much as we possibly
    ;; can (bottom will be clipped).
    (> (:height (bounding-client-rect element))
       (:height (bounding-client-rect parent)))
    (.scrollIntoView element true)

    ;; Element is not fully visible (is above the fold).
    ;; Scroll so it appears on the top.
    (element-invisible-above? parent element)
    (.scrollIntoView element true)

    ;; Element is not fully visuble (is below the fold).
    ;; Scroll so it appears on the bottom.
    (element-invisible-below? parent element)
    (.scrollIntoView element false)

    ;; Else: element is visible. Do nothing.
    ))
