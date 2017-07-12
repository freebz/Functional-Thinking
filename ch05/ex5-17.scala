// 예제 5-17 스칼라 Either와 패턴 매칭

getContent(new URL("http://nealford.com")) match {
  case Left(msg) => println(msg)
  case Right(source) => source.getLines.foreach(println)
}
