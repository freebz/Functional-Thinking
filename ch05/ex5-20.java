// 예제 5-20 로마숫자 파싱하기

public static Either<Exception, Integer> parseNumber(String s) {
    if (! s.matches("[IVXLXCDM]+"))
	return Either.left(new Exception("Invalid Roman numeral"));
    else
	return Either.right(new RomanNumeral(s).toInt());
}
