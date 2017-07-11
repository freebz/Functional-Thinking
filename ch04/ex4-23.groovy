// 예제 4-23 그루비의 게으른 필드

class Person {
    @Lazy pets = ['Cat', 'Dog', 'Bird']
}

def p = new Person()
assert !(p.dump().contains('Cat'))

assert p.pets.size() == 3
assert p.dump().contains('Cat')
