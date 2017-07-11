// 예제 3-6 그루비에서의 커링

def product = { x, y -> x * y }

def quadrate = product.curry(4)
def octate = product.curry(8)

println "4x4: ${quadrate.call(4)}"
println "8x5: ${octate(5)}"
