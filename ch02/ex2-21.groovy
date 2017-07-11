// 예제 2-21 그루비 버전의 reduce() 함수(inject())

static def sumFactors(number) {
    factors(number).inject(0, {i, j -> i + j})
}
