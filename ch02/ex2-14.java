// 예제 2-14 자바 8에서의 필터 작업

public static IntStream factorsOf(int number) {
    return range(1, number + 1)
	.filter(potential -> number % potential == 0);
}
