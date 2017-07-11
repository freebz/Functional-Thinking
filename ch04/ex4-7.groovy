// 예제 4-7 메모아이즈된 해시 함수 테스트

class NameHashTest extends GroovyTestCase {
    void testHash() {
	assertEquals("ubzre", NameHash.hash.call("homer")) }

}
