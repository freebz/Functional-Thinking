// 예제 4-17 게으르게 초기화된 완전수의 목록

def perfectNumbers(n) {
    prepend(n, { perfectNumbers(nextPerfectNumberAfter(n)) }) };

@Test
public void infinite_perfect_number_sequence() {
    def perfectNumbers = perfectNumbers(nextPerfectNumberAfter(1))
    assertEquals([6, 28, 496], perfectNumbers.getHead(3))
}
