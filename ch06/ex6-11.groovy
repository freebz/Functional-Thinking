// 예제 6-11 플라이웨이트를 메모아이즈하기

def computerOf = {type ->
    def of = [MacBookPro6_2: new Laptop(), SunTower: new Desktop()]
    return of[type]
}

def computerOfType = computerOf.memoize()
