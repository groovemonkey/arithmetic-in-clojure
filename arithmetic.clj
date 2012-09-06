;; hastily written because I thought it was a good idea
;;   ...let's see how much I remember from The Little Schemer

(defn add
  [x y]
	(if (= x 0) y
      (+ 1 ( (- x 1) y))))

;; not quite done, need to think about this
(defn subtract
  [x y]
  (if (= y 0) x
    (- 1 (subtract (- x 1) (- y 1))))) 

(defn multiply
  [x y]
	(if (= x 1) y
      (+ y (multiply (- x 1) y))))

(defn greater-than
  [x y]
  (if (= x 0) y)
  (if (= y 0) x)
  (greater-than (subtract x 1) (subtract y 1)))

(defn less-than
  [x y]
  (if (= x 0) x)
  (if (= y 0) y)
  (less-than (subtract x 1) (subtract y 1)))

(defn divide
  [x y]
  (if (greater-than y x) 0
    (add 1 (divide (subtract x y) y)))) 

(defn to-the-power
  [x y]
  (multiply x (to-the-power x (subtract y 1))))


  (add 3 4)
  (subtract 5 4)
  (multiply 3 5)
  (greater-than 5 4)
  (less-than 7 12)
  (divide 12 4)
  (to-the-power 3 2)
  