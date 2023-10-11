package interviewPrep;

public class SumOfAllDigits {

	public static int digitsSum(int num) {
		int sum = 0;
		while (num != 0) {
			sum = sum + num % 10;
			num = num / 10;
		}

		return sum;
	}

	public static void main(String[] args) {
		int number = 342;
		System.out.println(digitsSum(number));
		int number1 = 1004;
		System.out.println(digitsSum(number1));

	}

}
