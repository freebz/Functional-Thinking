// 예제 5-26 다른 곳에서 던진 예외를 처리하기

public static Either<Exception, Integer> divide(int x, int y) {
    try {
	return Either.right(x / y);
    } catch (Exception e) {
	return Either.left(e);
    }
}
