(ns sicp.ch2)

(defn make-point [x, y]
  {:x x :y y})

(defn x-point [map]
  (get map :x))

(defn y-point [map]
  (get map :y))

(defn make-segment [p1, p2]
  {:start p1 :end p2})

(defn start-segment [segment]
  (get segment :start))

(defn end-segment [segment]
  (get segment :end))

(defn middle-segment [segment]
  (let [x (/ (+ (get-in segment [:end :x])
                (get-in segment [:start :x])) 2)
        y (/ (+ (get-in segment [:end :y])
                (get-in segment [:start :y])) 2)]
    (make-point x y)))
