// 예제 2-20 사용자가 지정한 조건을 사용한 foldLeft()

package com.nealford.ft.number_classifier-functional_java;

import fj.F2;
import fj.data.List;

public class NumberStuff {
    static public int addOnlyOddNumbersIn(List<Integer> numbers) {
	return numbers.foldLeft(new F2<Integer, Integer, Integer>() {
		public Integer f(Integer i1, Integer i2) {
		    return (!(i2 % 2 == 0)) ? i1 + i2 : i1;
		}
	    }, 0);
    }
}
