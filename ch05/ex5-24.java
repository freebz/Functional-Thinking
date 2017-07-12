// 예제 5-24 적당한 디폴트 리턴 값 제공하기

private static final int MIN = 0;
private static fianl int MAX = 1000;

public static Either<Exception, Integer> parseNumberDefaults(final String s) {
    if (! s.matches("[IVXLXCDM]+"))
	return Either.left(new Exception("Invalid Roman numeral"));
    else {
	int number = new RomanNumeral(s).toInt();
	return Either.right(new RomanNumeral(number >= MAX ? MAX : number).toInt());
    }
}
