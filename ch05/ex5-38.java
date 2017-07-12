// 예제 5-38 트리의 검색 가능성 테스트

@Test
public void more-elaborate_searchp_test() {
    Tree t = new Node(new Node(new Node(new Node(
						 new Node(new Leaf(4), new Empty()),
						 new Leaf(12)), new Leaf(55)),
			       new Empty()), new Leaf(4));
    assertTrue(inTree(t, 55));
    assertTrue(inTree(t, 4));
    assertTrue(inTree(t, 12));
    assertFalse(inTree(t, 42));
}
