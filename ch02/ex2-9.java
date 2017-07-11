// 예제 2-9 자바 8에서의 분산 처리

public String cleanNamesP(List<String> names) {
    if (names == null) return "";
    return names
	.parallelStream()
	.filter(name -> name.length() > 1)
	.map(name -> capitalize(name))
	.collect(Collectors.joining(","));
}
