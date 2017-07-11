// 예제 2-15 그루비에서의 필터 작업(그루비에서는 필터를 findAll()이라고 부른다)

static def factors(number) {
    (1..number).findAll {number % it == 0}
}
