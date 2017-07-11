// 예제 3-12 match 없이 case 사용하기

val cities = Map("Atlanta" -> "GA", "New York" -> "New York",
  "Chicago" -> "IL", "San Francsico" -> "CA", "Dallas" -> "TX")

cities map { case (k, v) => println(k + " -> " + v) }
