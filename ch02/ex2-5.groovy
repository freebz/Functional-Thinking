// 예제 2-5 그루비로 처리하기

package com.nealford.ft.trans

class TheCompanyProcess {

    public static String cleanUpNames(listOfNames) {
	listOfNames
	    .findAll { it.length() > 1 }
	    .collect { it.capitalize() }
	    .join ','
    }
}
