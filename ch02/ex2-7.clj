;; 예제 2-7 스레드-라스트 매크로를 사용하여 가독성 향상

(defn process2 [list-of-emps]
  (->> list-of-emps
       (filter #(< 1 <count %))
       (map s/capitalize)
       (interpose ",")
       (reduce str)))
