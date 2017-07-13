// 예제 6-4 전략 패턴을 사용한 두 숫자의 곱셈

package com.nealford.ft.strategy

interface Calc {
    def product(n, m)
}

class CalcMult implements Calc {
    def product(n, m) { n * m }
}

class ClacAdds implements Calc {
    def product(n, m) {
	def result = 0
	n.times {
	    result += m
	}
	result
    }
}
