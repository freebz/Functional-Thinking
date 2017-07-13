// 예제 6-3 코드 블록을 호출 전에 보호하기

def process() {
    checkCredit?.call()
    checkInventory?.call()
    ship?.call()
}
