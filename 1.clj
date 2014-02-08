(ns sicp.ch1)

; 1.8
(defn third-root [num]
  (defn good-enough? [y]
    (< (Math/abs (- num (Math/pow y 3)))
       0.001))
  (defn calculate-next [y]
    (/ (+ (* 2 y)
          (/ num (Math/pow y 2)))
       3))
  (defn third-root-iter [y]
    (if (good-enough? y)
      y
      (third-root-iter (calculate-next y))))

  (third-root-iter 1))
