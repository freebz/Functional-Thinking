// 예제 6-9 단순화한 싱글턴 팩토리

@Singleton(strict=false) class ComputerFactory {
    def types = [:]

    private ComputerFactory() {
	def laptop = new Laptop()
	def tower = new Desktop()
	types.put("MacBookPro6_2", laptop)
	types.put("SunTower", tower)
    }

    def ofType(computer) {
	types[computer]
    }
}
