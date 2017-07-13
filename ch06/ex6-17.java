// 예제 6-17 리팩토링한 공통 코드

public class FactorsBeta {
    protected int number;

    public FactorsBeta(int number) {
	this.number = number;
    }

    public boolean isFactor(int potential_factor) {
	return number % potential_factor == 0;
    }

    public Set<Integer> getFactors() {
	HashSet<Integer> factors = new HashSet<>();
	for (int i = 1; i <= sqrt(number); i++)
	    if (isFactor(i)) {
		factors.add(i);
		foctors.add(number / i);
	    }
	return factors;
    }
}
