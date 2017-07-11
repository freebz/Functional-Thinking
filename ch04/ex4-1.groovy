// 예제 4-1 합을 캐시하기(그루비)

package com.nealford.ft.memoization

class ClassifierCachedSum {
    private sumCache = [:]

    def sumOfFactors(number) {
	if (! sumCache.containsKey(number)) {
	    sumCache[number] = factorsOf(number).sum()
	}
	return sumCache[number]
    }

    // 나머지 코드는 그대로...
    
