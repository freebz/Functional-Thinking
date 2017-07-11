// 예제 2-17 그루비로 최적화한 factors

static def factors(number) {
    def factors = (1..round(sqrt(number)+1)).findAll({number % it == 0})
    (factors + factors.collect {number / it}).unique()
}
