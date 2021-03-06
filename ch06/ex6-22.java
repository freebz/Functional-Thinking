// 예제 6-22 함수형으로 리팩토링한 Factors 클래스

public class Factors {
    static public boolean isFactor(int number, int potential_factor) {
	return number % potential_factor == 0;
    }

    static public Set<Integer> of(int number) {
	HashSet<Integer> factors = new HashSet<>();
	for (int i = 1; i <= sqrt(number); i++)
	    if (isFactor(number, i)) {
		factors.add(i);
		factors.add(number / i);
	    }
	return factors;
    }
}
