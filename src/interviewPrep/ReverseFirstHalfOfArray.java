package interviewPrep;

public class ReverseFirstHalfOfArray {

	public static void main(String[] args) {
		int[] arr = { 10, 2, 5, 4, 6, 9, 5, 3 };
		int half = arr.length / 2;

		for (int i = 0; i < half / 2; i++) { // the iteration should be only 2 as we are swapping 2 elements for 1 iteration
			int temp = arr[i];
			arr[i] = arr[half - 1 - i];
			arr[half - 1 - i] = temp;
		}

		for (int j = 0; j < arr.length; j++) {
			System.out.println(arr[j]);
		}

	}

}
