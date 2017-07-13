// 예제 7-2 술어의 수동 생성

Predicate<String> p = (name) -> name.startsWith("Mr");
List<String> l = List.of("Mr Rogers", "Ms Robinson", "Mr Ed");
l.stream().filter(p).forEach(i -> System.out.println(i));
