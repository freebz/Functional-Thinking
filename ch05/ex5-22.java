// 예제 5-22 함수형 자바를 사용하여 게으른 파서 생성하기

public static P1<Either<Exception, Integer>> parseNumberLazy(final String s) {
    if (! s.matches("[IVXLXCDM]+"))
	return new P1<Either<Exception, Integer>>() {
	    public Either<Exception, Integer> _1() {
		return Either.left(new Exception("Invalid Roman numeral"));
	    }
	};
    else
	return new P1<Either<Exception, Integer>>() {
	    public Either<Exception, Integer> _1() {
		return Either.right(new RomanNumeral(s).toInt());
	    }
        };
}
