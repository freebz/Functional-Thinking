// 예제 6-6 보일러플레이트 코드를 제거한 지수 계산 테스트

@Test
public void exp_verifier() {
    def listOfExp = [
	{i, j -> Math.pow(i, j)},
	{i, j ->
	    def result = i
	    (j-1).times { result *= i }
	    result
	}]

    listOfExp.each { e ->
	assertEquals(32, e(2, 5))
	assertEquals(100, e(10, 2))
	assertEquals(1000, e(10, 3))
    }
}
