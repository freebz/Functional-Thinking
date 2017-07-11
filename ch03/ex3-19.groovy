// 예제 3-19 색인(명시적이지 않을 수 있음)을 사용한 목록 순회

def numbers = [6, 28, 4, 9, 12, 4, 8, 8, 11, 45, 99, 2]

def iterateList(listOfNums) {
    listOfNums.each { n ->
	println "${n}"
    }
}
println "Iterate List"
iterateList(numbers)
