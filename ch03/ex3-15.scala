// 예제 3-15 answerUnits 다르게 정의하기

def pAnswerUnits: PartialFunction[Int, Int] =
{ case d: Int if d != 0 => 42 / d }

assert(pAnswerUnits(42) == 1)
//pAnswerUnits(0)
//scala.MatchError: 0 (of class java.Integer)
