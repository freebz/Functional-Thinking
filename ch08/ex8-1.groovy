// 예제 8-1 메타프로그래밍을 사용하여 Integer에 분류기 기능 붙이기

package com.nealford.ft.metafunctionaljava

import com.nealford.ft.number_classifier.NumberClassifier

class IntegerClassifierTest {
    static {
	Integer.metaClass.isPerfect = {->
	    NumberClassifier.isPerfect(delegate)
	}

	Integer.metaClass.isAbundant = {->
	    NumberClassifier.isAbundant(delegate)
	}

	Integer.metaClass.isDeficient = {->
	    NumberClassifier.isDeficient(delegate)
	}
    }
}
