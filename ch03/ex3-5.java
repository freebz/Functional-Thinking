// 예제 3-5 자바로 구현한 makeCounter()

package com.nealford.ft;

import java.util.List;
import java.util.ArrayList;

class Counter {
    public int varField;

    Counter(int var) {
	varField = var;
    }

    public static Counter makeCounter() {
	return new Counter(0);
    }

    public int excute() {
	return ++varField;
    }
}
