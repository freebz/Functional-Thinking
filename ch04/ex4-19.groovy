// 예제 4-19 게으른 목록 작동해보기

def lazylist = PLazyList.nil().cons(4).cons(3).cons(2).cons(1)
println(lazylist.takeAll())
println(lazylist.foldAll(0, {i, j -> i + j}))
lazylist = PLazyList.nil().cons(1).cons(2).cons(4).cons(8)
println(lazylist.take(2))
