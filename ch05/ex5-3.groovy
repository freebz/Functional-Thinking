// 예제 5-3 그루비의 개선된 switch 문

package com.nealford.tf.polydispatch

class LetterGrade {
    def gradeFromScore(score) {
	switch (score) {
	    case 90..100 : return "A"
	    case 80..<90 : return "B"
	    case 70..<80 : return "C"
	    case 60..<70 : return "D"
	    case 0..<60 : return "F"
	    case ~"[ABCDFabcdf]" : return score.toUpperCase()
	    default: throw new IllegalArgumentException("Invalid score: ${score}")
	}
    }
}
