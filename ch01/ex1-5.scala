// 예제 1-5 firstIndexOfAny()의 스칼라 버전

def firstIndexOfAny(input : String, searchChars : Seq[Char]) : Option[Int] = {
  def indexedInput = (0 until input.length).zip(input)
  val result = for (pair <- indexedInput;
    char <- searchChars;
    if (char == pair._2)) yield (pair._1)
  if (result.isEmpty)
    None
  else
    Some(result.head)
}
