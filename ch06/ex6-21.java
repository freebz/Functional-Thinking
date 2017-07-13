// 예제 6-21 함수형 소수 찾기

package com.nealford.ft.composition;

public class FPrime {

    public static boolean isPrime(int number) {
	Set<Integer> factors = Factors.of(number);
	return number > 1 &&
	    factors.size() == 2 &&
	    factors.contains(1) &&
	    factors.contains(number);
    }
}
