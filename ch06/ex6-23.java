// 예제 6-23 리팩토링한 자연수 분류기

public class FClassifier {

    public static int sumOfFactors(int number) {
	Iterator<Integer> it = Factors.of(number).iterator();
	int sum = 0;
	while (it.hasNext())
	    sum += it.next();
	return sum;
    }

    public static boolean isPerfact(int number) {
	return sumOfFactors(number) - number == number;
    }

    public static boolean isAbundant(int number) {
	return sumOfFactors(number) - number > number;
    }

    public static boolean isDeficient(int number) {
	return sumOfFactors(number) - number < number;
    }
}
