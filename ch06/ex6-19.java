// 예제 6-19 리팩토링으로 간단해진 소수 찾기

public class PrimeBeta extends FactorsBeta {

    public PrimeBeta(int number) {
	super(number);
    }

    public boolean isPrime() {
	Set<Integer> primeSet = new HashSet<Integer>() {{
		add(1); add(number); }};
	return getFactors().equals(primeSet);
    }
}
