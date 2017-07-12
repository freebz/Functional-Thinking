// 예제 5-36 패턴 매칭과 유사한 구문으로 트리의 깊이 알아내기

static public int depth(Tree t) {
    for (Empty e : t.toEither().left())
	return 0;
    for (Either<Leaf, Node> ln: t.toEither().right()) {
	for (Leaf leaf : ln.left())
	    return 1;
	for (Node node : ln.right())
	    return 1 + max(depth(node.left), depth(node.right));
    }
    throw new RuntimeException("Inexhaustible pattern match on tree");
}
