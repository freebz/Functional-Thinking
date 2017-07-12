;; 예제 5-6 클로저 학점 프로그램 테스트

(ns lettergradestest
  (:use coljure.test)
  (:use lettergrades))

(deftest numeric-letter-grades
  (dorun (map #(is (= "A" (letter-grade %))) (range 90 100)))
  (dorun (map #(is (= "B" (letter-grade %))) (range 80 89)))
  (dorun (map #(is (= "C" (letter-grade %))) (range 70 79)))
  (dorun (map #(is (= "D" (letter-grade %))) (range 60 69)))
  (dorun (map #(is (= "F" (letter-grade %))) (range 0 59))))

(deftest string-letter-grades
  (dorun (map #(is (= (.toUpperCase %)
                      (letter-grade %))) ["A" "B" "C" "D" "F" "a" "b" "c" "d" "f"])))

(run-all-tests)
