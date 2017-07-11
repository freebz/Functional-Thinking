;; 예제 2-18 모든 연산을 몇 번의 할당으로 캡슐화한 클로저의 (classify) 함수

(ns number_classifier.core)

(defn classify [num]
  (let [factors (->> (range 1 (inc num))
                     (filter #(zero? (rem num %))))
        sum (reduce + factors)
        aliquot-sum (- sum num)]

    (cond
      (= aliquot-sum num) :perfect
      (> aliquot-sum num) :abundant
      (< aliquot-sum num) :deficient)))
