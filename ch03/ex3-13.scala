// 예제 3-13 map과 collect의 차이점

List(1, 3, 5, "seven") map { case i: Int => i + 1 }  // 작동하지 않음
                                                     // scala.MatchError: seven (of class java.lang.String)

List(1, 3, 5, "seven") collect { case i: Int => i + 1 }
// 검증
assert(List(2, 4, 6) == (List(1, 3, 5, "seven") collect { case i: Int => i + 1 }))
