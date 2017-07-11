// 예제 4-3 전부 다 캐시하기

class ClassifierCached {
    private sumCache = [:], factorCache = [:]

    def sumOfFactors(number) {
	if (! sumCache.containsKey(number))
	sumCache[number] = factorsOf(number).sum()
	sumCache[number]
    }

    def isFactor(number, potential) {
	number % potential == 0;
    }

    def factorsOf(number) {
	if (! factorCache.containsKey(number))
	factorCache[number] = (1..number).findAll {isFactor(number, it)}
	factorCache[number]
    }

    def isPerfect(number) {
	sumOfFactors(number) == 2 * number
    }

    def isAbundant(number) {
	sumOfFactors(number) > 2 * number
    }

    def isDeficient(number) {
	sumOfFactors(number) < 2 * number
    }
}
