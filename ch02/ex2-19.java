// 예제 2-19 함수형 자바의 foldLeft() 메서드

public int aliquotSum(List<Integer> factors) {
    return factors.foldLeft(fj.function.Integers.add, 0) - factors.last();
}
