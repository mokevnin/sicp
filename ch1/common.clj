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

; 1.11a
(defn bobo [num]
  (if (< num 3)
    num
    (+ (bobo (- num 1))
       (bobo (- num 2))
       (bobo (- num 3)))))

; 1.11b
(defn better-bobo [num]
  (defn better-bobo-iter [n p1 p2 p3]
    (if (<= n 3)
      (+ p1 p2 p3)
      (better-bobo-iter (- n 1)
                        (+ p1 p2 p3)
                        p1
                        p2)
    ))

  (better-bobo-iter num 2 1 0))
