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
  (define (good-enough? y)
    (< (abs (- num (cube y)))
       0.0001))
  (define (calculate-next y)
    (/ (+ (* 2.0 y)
          (/ num (square y)))
       3.0))
  (define (third-root-iter y)
    ; (display num) (newline)
    (if (good-enough? y)
      y
      (third-root-iter (calculate-next y))))

  (third-root-iter 1.0))

(third-root 27)

; 1.11a
(define (bobo n)
  (if (< n 3)
    n
    (+ (bobo (- n 1))
       (bobo (- n 2))
       (bobo (- n 3)))))

(bobo 15)

; 1.11b
(define (better-bobo n)
  (define (better-bobo-iter n a b result)
    (if (< n 3)
      n
      (better-bobo-iter (- n 1)
                        (+ result a)
                        (+ a b)
                        (+ result a b))))

    (better-bobo-iter n 2 1 0 result)))

(bobo 15)
