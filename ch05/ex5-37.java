// 예제 5-37 트리에서 값의 존재 확인하기

static public boolean inTree(Tree t, int value) {
    for (Empty e : t.toEither().left())
	return false;
    for (Either<Leaf, Node> ln: t.toEither().right()) {
	for (Leaf leaf : ln.left())
	    return value == leaf.n;
	for (Node node : ln.right())
	    return inTree(node.left, value) | inTree(node.right, value);
    }
    return false;
}
