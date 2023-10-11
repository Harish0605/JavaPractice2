package interviewPrep;

public class MedianOfArray {
	/*
	 * Median Of Array depends on length of sorted Array If length is odd then
	 * middle number is Median If length is even then average of two middle numbers
	 */
	public static double medianArray(int[] arr) {
		double median = 0;
		if (arr.length % 2 != 0) {
			median = arr[arr.length / 2];
		} else {
			int sum = (arr[arr.length / 2]) + (arr[arr.length / 2 - 1]);
			median = sum / 2.0;

		}

		return median;
	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 };
		int[] arr1 = { 1, 2, 3, 4 };
		System.out.println("Median of Array is : " + medianArray(arr));
		System.out.println("Median of Array is : " + medianArray(arr1));

	}

}
