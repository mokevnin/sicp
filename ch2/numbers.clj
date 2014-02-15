(ns sicp.ch2)

(defn zero [] (fn [f] (fn [x] x)))
(defn one [] (fn [f] (fn [x] (f x))))

(defn add-1 [n]
  (fn [f] (fn [x] (f ((n f) x)))))

(defn plus [n, m]
  (fn [f] (fn [x] (m add-1 (n f x)))))
