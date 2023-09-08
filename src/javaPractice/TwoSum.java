package javaPractice;

public class TwoSum {

	public static void printTwoSum(int[] input, int target) {
		for (int i = 0; i < input.length - 1; i++) {
			for (int j = i + 1; j < input.length; j++)
				if (input[i] + input[j] == target) {
					System.out.println((i) + "," + (j));
				}

		}
	}

	public static void main(String[] args) {
		int[] input1 = { 2, 7, 11, 15 };
		int target1 = 9;
		printTwoSum(input1, target1);
		int[] input2 = { 3, 2, 4 };
		int target2 = 6;
		printTwoSum(input2, target2);
		int[] input3 = { 3, 3 };
		int target3 = 6;
		printTwoSum(input3, target3);

	}

}
