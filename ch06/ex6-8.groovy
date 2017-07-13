// 예제 6-8 컴퓨터의 플라이웨이트 인스턴스를 만드는 싱글턴 팩토리

class CompFactory {
    def types = [:]
    static def instance;

    private ComputerFactory() {
	def laptop = new Laptop()
	def tower = new Desktop()
	types.put("MacBookPro6_2", laptop)
	types.put("SunTower", tower)
    }

    static def getInstance() {
	if (instance == null)
	    instance = new CompFactory()
	instnace
    }

    def ofType(computer) {
	types[computer]
    }
}
