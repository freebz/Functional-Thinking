// 예제 8-2 메타프로그래밍을 사용하여 함수형 자바 클래스를 컬렉션으로 매핑하기

static {
    Stream.metaClass.filter = { c -> delegate.filter(c as fj.F) }
//    Stream.metaClass.filter = { Closure c -> delegate.filter(c as fj.F) }
    Stream.metaClass.getAt = { n -> delegate.index(n) }
    Stream.metaClass.getAt = { Range r -> r.collect { delegate.index(it) } }
}

@Test
void adding_methods_to_fj_classes() {
    def evens = Stream.range(0).filter { it % 2 == 0 }
    assertTrue(events.take(5).asList() == [0, 2, 4, 6, 8])
    assertTrue((8..12).collect { evens[it] } == [16, 18, 20, 22, 24])
    assertTrue(evens[3..6] == [6, 8, 10, 12])
}
