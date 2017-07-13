// 예제 6-10 표준 종류 테스트하기

@Test
public void comp_factory() {
    def bob = new AssignedComputer(
	CompFactory.instance.ofType("MacBookPro6_2"), "Bob")
    def steve = new AssignedComputer(
	CompFactory.instance.ofType("MacBookPro6_2"), "Steve")
    assertTrue(bob.computerType == steve.computerType)
}
