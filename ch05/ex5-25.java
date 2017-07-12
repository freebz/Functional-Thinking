// 예제 5-25 디폴트 값 테스트

@Test
public void parse_defaults_normal() {
    Either<Exception, Integer> result =
	RomanNumeralParser.parseNumberDefaults("XLII");
    assertEquals(42, result.right().intValue());
}
@Test
public void parse_defaults_triggered() {
    Either<Exception, Integer> result =
	RomanNumeralParser.parseNumberDefaults("MM");
    assertEquals(1000, result.right().intValue());
}
