; 1.2
(/ (+ 5 4 (- 2 (- 3 (+ 6 (/ 4 5)))))
   (* 3 (* (- 6 2) (- 7 2))))

; 1.3
(define (square a) (* a a))
(define (cube a) (* a a a))

(define (sum-biggest a b c)
  (define (sum-of-squares a b) (+ (square a) (square b)))

  (cond ((and (>= a c) (>= b c)) (sum-of-squares a b))
        ((and (>= b a) (>= c a)) (sum-of-squares b c))
        ((and (>= c b) (>= a b)) (sum-of-squares c a))))

(sum-biggest 1 2 3)

; 1.8
(define (third-root num)
  (define (good-enough? num y)
    (< (abs (- num (cube y)))
       0.0001))
  (define (calculate-next num y)
    (/ (+ (* 2.0 y)
          (/ num (square y)))
       3.0))
  (define (third-root-iter num y)
    ; (display num) (newline)
    (if (good-enough? num y)
      y
      (third-root-iter num (calculate-next num y))))

  (third-root-iter num 1.0))

(third-root 9)
