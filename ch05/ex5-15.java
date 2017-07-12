// 예제 5-15 Map으로 성광과 실패를 테스트하기

@Test
public void maps_success() {
    Map<String, Object> result = RomanNumberalParser.divide(4, 2);
    assertEquals(2.0, (Double) result.get("answer"), 0.1);
}

@Test
public void maps_failure() {
    Map<String, Object> result = RomanNumeralParser.divide(4, 0);
    assertEquals("div by zero", ((Exception) result.get("exception")).getMessage());
}
