;; 예제 3-9 클로저의 부분 적용

(def subtract-from-hundred (partial - 100))

(subtract-from-hundred 10)       ; (- 100 10)과 동일
; 90

(subtract-from-hundred 10 20)    ; (- 100 10 20)과 동일
; 70
