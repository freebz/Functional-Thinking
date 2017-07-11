// 예제 3-24 회사 프로세스의 자바 8 버전

public String cleanNames(List<String> names) {
    if (names == null) return "";
    return names
	.stream()
	.map(e -> capitalize(e))
	.filter(n -> n.length() > 1)
	.collect(Collectors.joining(","));
}
