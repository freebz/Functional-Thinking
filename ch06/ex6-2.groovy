// 예제 6-2 일급 함수를 사용한 템플릿 메서드

class CustomerBlocks {
    def plan, checkCredit, checkInventory, ship

    def CustomerBlocks() {
	plan = []
    }

    def process() {
	checkCredit()
	checkInventory()
	ship()
    }
}
