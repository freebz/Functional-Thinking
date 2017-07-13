// 예제 6-1 템플릿 메서드의 '표준' 구현

package com.nealford.ft.template

abstract class Customer {
    def plan

    def Customer() {
	plan = []
    }

    def abstract checkCredit()
    def abstract checkInventory()
    def abstract ship()

    def process() {
	checkCredit()
	checkInventory()
	ship()
    }
}
