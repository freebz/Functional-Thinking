// 예제 5-2 스칼라의 XML용 문법적 설탕

import scala.xml._
import java.net._
import scala.io.Source

val theUrl = "https://query.yahooapis.com/v1/public/yql?q=select+*+from+weather.forecast+where+woeid=12770744&format=xml"

val xmlString = Source.fromURL(new URL(theUrl)).mkString
val xml = XML.loadString(xmlString)
val city = xml \\ "location" \\ "@city"
val state = xml \\ "location" \\ "@region"
val temperature = xml \\ "codition" \\ "@temp"

println(city + ", " + state + " " + temperature)
