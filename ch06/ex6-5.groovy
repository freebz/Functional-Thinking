// 예제 6-5 곱 전략 테스트하기

class StragegyTest {
    def listOfStrategies = [new CalcMult(), new CalcAdds()]

    @Test
    public void product_verifier() {
	listOfStrategies.each { s ->
	    assertEquals(10, s.product(5, 2))
	}
    }
}
