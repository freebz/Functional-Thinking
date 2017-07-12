// 예제 5-14 Map을 사용하여 다중 리턴 값을 처리하기

public static Map<String, Object> divide(int x, int y) {
    Map<String, Object> result = new HashMap<String, Object>();
    if (y == 0)
	result.put("exception", new Exception("div by zero"));
    else
	result.put("answer", (double) x / y);
    return result;
}
