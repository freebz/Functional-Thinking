;; 예제 5-7 클로저로 색 구조를 정의하기

(defstruct color :red :green :blue)

(defn red [v]
  (struct color v 0 0))

(defn green [v]
  (struct color 0 v 0))

(defn blue [v]
  (struct color 0 0 v))
