// 예제 8-5 함수형 자바와 그루비를 사용하여 만든 완전수 무한 스트림


def perfectNumbers(num) {
    cons(nextPerfectNumberAfter(num),
	{perfectNumbers(nextPerfectNumberAfter(num))})
}

@Test
void infinite_stream_of_perfect_nums_using_functional_java() {
    assertEquals([6, 28, 496], perfectNumbers(1).take(3).asList())
}
