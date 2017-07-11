// 예제 4-9 스칼라에서의 메모이제이션 구현

def memoize[A, B](f: A => B) = new (A => B) {
  val cache = scala.collection.mutable.Map[A, B]()
  def apply(x: A): B = cache.getOrElseUpdate(x, f(x))
}

def nameHash = memoize(hash)
