// 예제 4-5 전부 다 메모아이즈하기

class ClassifierMemoizedSum {
    def static dividesBy = { number, potential ->
	number % potential == 0;
    }
    def static isFactor = dividesBy.memoize()

    def static factorsOf(number) {
	(1..number).findAll { i -> isFactor(number, i) }
    }

    def static sumFactors = { number ->
	factorsOf(number).inject(0, {i, j -> i + j})
    }
    def static sumOfFactors = sumFactors.memoize()

    def static isPerfect(number) {
	sumOfFactors(number) == 2 * number
    }

    def static isAbundant(number) {
	sumOfFactors(number) > 2 * number
    }

    def static isDeficient(number) {
	sumOfFactors(number) < 2 * number
    }
    
}
