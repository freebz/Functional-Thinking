;; 예제 2-6 클로저로 처리하기

(ns trans.core
  (:require [clojure.string :as s]))

(defn process [list-of-emps]
  (reduce str (interpose ","
                         (map s/capitalize (filter #(< 1 (count %)) list-of-emps)))))
