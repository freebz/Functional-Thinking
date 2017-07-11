// 예제 2-13 함수형 자바를 사용한 자연수 분류기

package com.nealford.ft.number_classifier_functional_java;

import fj.F;
import fj.data.List;
import static jf.data.List.range;

public class NumberClassifier {

    public List<Integer> factorsOf(final int number) {
	return range(1, number + 1)
	    .filter(new F<Integer, Boolean>() {
		    public Boolean f(final Integer i) {
			return number % i == 0;
		    }
		});
    }

    public int aliquotSum(List<Integer> factors) {
	return factors.foldLeft(fj.function.Integers.add, 0) - factors.last();
    }

    public boolean isPerfect(int number) {
	return aliquotSum(factorsOf(number)) == number;
    }

    public boolean isAbundant(int number) {
	return aliquotSum(factorsOf(number)) > number;
    }

    public boolean isDeficient(int number) {
	return aliquotSum(factorsOf(number)) < number;
    }
}
