// 예제 8-3 그루비의 as 연산자를 통해 맵으로 인터페이스 구현하기

h = [hasNext: { h.i > 0 }, next: {h.i--}]
h.i = 10
def pseudoIterator = h as Iterator

while (pseudoIterator.hasNext())
print pseudoIterator.next() + (pseudoIterator.hasNext() ? ", " : "\n")
// 10, 9, 8, 7, 6, 5, 4, 3, 2, 1
