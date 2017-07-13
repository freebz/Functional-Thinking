// 예제 6-18 리팩토링으로 간단해진 분류기

public class ClassifierBeta extends FactorsBeta {

    public ClassifierBeta(int number) {
	super(number);
    }

    public int sum() {
	Iterator it = getFactors().iterator();
	int sum = 0;
	while (it.hasNext())
	    sum += (Integer) it.next();
	return sum;
    }

    public boolean isPerfect() {
	return sum() - number == number;
    }

    public boolean isAbundant() {
	return sum() - number > number;
    }

    public boolean isDeficient() {
	return sum() - number < number;
    }
}
