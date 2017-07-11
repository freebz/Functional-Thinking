// 예제 3-16 스칼라의 증가 함수

def inc: PartialFunction[Any, Int] =
{ case i: Int => i + 1 }

assert(inc(41) == 42)
//inc("FOrty-one")
//scala.MatchError: Forty-one (of class java.lang.String)

assert(inc.isDefinedAt(41))
assert(! inc.isDefinedAt("Forty-one"))

assert(List(42) == (List(41, "cat") collect inc))
