// 예제 6-13 함수 팩토리로 사용되는 커링

def adder = { x, y -> x + y }

def incrementer = adder.curry(1)

println "increment 7: ${incrementer(7)}"
