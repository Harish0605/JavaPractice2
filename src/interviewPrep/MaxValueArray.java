package interviewPrep;

public class MaxValueArray {
	public static void findMaxValue(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					int temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;

				}
			}
		}
		System.out.println(arr[arr.length - 1] + " " + arr[arr.length - 2]);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 30, 10, 20, 50, 40 };
		// get max 2 values from the array = 50,40
		
		findMaxValue(arr);
	}

}
