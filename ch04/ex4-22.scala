// 예제 4-22 스칼라를 사용한 회문 찾기

def isPalindrome(x: String) = x == x.reverse
def findPalindrome (s: Seq[String]) = s find isPalindrome

findPalindrome(words take 1000000)


findPalindrome(words.view take 1000000)
