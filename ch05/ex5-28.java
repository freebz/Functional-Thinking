// 예제 5-28 게으른 예외 처리

public static P1<Either<Exception, Integer> divideLazily(final int x, final int y) {
    return new P1<Either<Exception, Integer>>() {
	public Either<Exception, Integer> _1() {
	    try {
		return Either.right(x / y);
	    } catch (Exception e) {
		return Either.left(e);
	    }
	}
    };
}
