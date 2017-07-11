// 예제 2-3 스칼라의 함수형 처리

val employees = List("neal", "s", "stu", "j", "rich", "bob", "aiden", "j", "ethan", "liam", "mason", "noah", "lucas", "jacob", "jayden", "jack")

val result = employees
  .filter(_.length() > 1)
  .map(_.capitalize)
  .reduce(_ + "," + _)
