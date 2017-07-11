// 예제 3-17 그루비의 덧셈 함수와 증가 함수

def adder = { x, y -> x + y }
def incrementer = adder.curry(1)

println "increment 7: ${incrementer(7)}"  // 8
