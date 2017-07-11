// 예제 3-21 그루비에서의 명령형 필터

def filter(list, predicate) {
    def new_list = []
    list.each {
	if (predicate(it)) {
	    new_list << it
	}
    }
    return new_list
}

modBy2 = { n -> n % 2 == 0 }

l = filter(1..20, modBy2)
println l
