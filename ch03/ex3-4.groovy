// 예제 3-4 그루비에서 클로저의 작동 원리

def Closure makeCounter() {
    def local_variable = 0
    return { return local_variable += 1 }
}

c1 = makeCounter()
c1()
c1()
c1()

c2 = makeCounter()

println "C1 = ${c1()}, C2 = ${c2()}"
// C1 = 4, C2 = 1
