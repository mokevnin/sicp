(ns sicp.ch2)

(defn last-pair [l]
  (let [[x & more] l]
    (if (empty? more)
      x
      (last-pair more))))

(last-pair [23 72 149 34 22])

(defn reverse-list [coll]
  (reduce conj () coll))

(reverse-list [23 72 149 34])
