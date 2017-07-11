// 예제 3-20 재귀를 사용한 목록 순회

def recurseList(listOfNums) {
    if (listOfNums.size == 0) return;
    println "${listOfNums.head()}"
    recurseList(listOfNums.tail())
}
println "\nRecurse List"
recurseList(numbers)
