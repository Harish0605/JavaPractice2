package interviewPrep;

public class MergeTwoArrays {

	public static int[] mergeArrays(int[] arr1, int[] arr2) {
		int[] arr3 = new int[arr1.length + arr2.length];
//		Arrays.sort(arr1);
//		Arrays.sort(arr2);
		int k = 0;
		for (int i = 0; i < arr1.length; i++) {
			arr3[k] = arr1[i];
			k++;
		}
		for (int j = 0; j < arr2.length; j++) {
			arr3[k] = arr2[j];
			k++;
		}
		return arr3;
	}

	public static void main(String[] args) {
		int arr1[] = { 1, 5, 2, 4 };
		int arr2[] = { 5, 3, 8, 7, 9 };
		int[] arr3 =mergeArrays(arr1,arr2);
		for (int m = 0; m < arr3.length; m++) {
			System.out.println(arr3[m]);
		}

	}

}
