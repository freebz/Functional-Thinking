// 예제 5-30 Option 사용법

public static Option<Double> divide(double x, double y) {
    if (y == 0)
	return Option.none();
    return Option.some(x / y);
}
