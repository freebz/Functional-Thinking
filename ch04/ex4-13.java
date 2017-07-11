// 예제 4-13 토털리 레이지 자바 프레임워크를 사용한 자연수 분류기

package com.nealford.ft.number_classifier_totally_lazy;

import com.googlecode.totallylazy.Predicate;
import com.googlecode.totallylazy.Sequence;

import static com.googlecode.totallylazy.Predicates.is;
import static com.googlecode.totallylazy.numbers.Numbers.*;
import static com.googlecode.totallylazy.predicates.WherePredicate.where;

public class NumberClassifier {
    public static Predicate isFactor(Number n) {
	return where(remainder(n), is(zero));
    }

    public static Sequence getFactors(final Number n) {
	return range(1, n).filter(isFactor(n));
    }

    public static Sequence factors(final Number n) {
	return getFactors(n).memorise();
    }

    public static Number aliquotSum(Number n) {
	return subtract(factors(n).reduce(sum), n);
    }

    public static boolean isPerfect(Number n) {
	return equalTo(n, aliquotSum(n));
    }

    public static boolean isAbundant(Number n) {
	return greaterThan(aliquotSum(n), n);
    }

    public static boolean isDeficient(Number n) {
	return lessThan(aliquotSum(n), n);
    }
}
