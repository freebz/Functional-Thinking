// 예제 8-4 완전수 스트림에 사용되는 두가지 메서드 매핑

static {
    Stream.metaClass.asList = { delegate.toCollection().asList() }
//    Stream.metaClass.static.cons =
//	{ head, Closure c -> delegate.cons(head, ['_1':c] as fj.P1)}
    Stream.metaClass.static.cons =
	{ head, closure -> delegate.cons(head, closure as fj.P1) }
}
