// 예제 2-8 스칼라에서의 병렬처리

val parallelResult = employees
  .par
  .filter(_.length() > 1)
  .map(_.capitalize)
  .reduce(_ + "," + _)
