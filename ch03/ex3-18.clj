;; 예제 3-18 부분 적용을 사용하여 인수 값을 묵시적으로 제공하기

(defn db-connect [data-source query params]
  ...)

(def dbc (partial db-connect "db/some-data-source"))

(dbc "select * from %1" "cust")
