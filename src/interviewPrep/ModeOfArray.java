package interviewPrep;

public class ModeOfArray {

	public static void modeGeneral(int arr[]) {
		int maxNumber = -1;
		int maxAppearance = -1;
		for (int i = 0; i < arr.length; i++) {
			int freq = 0;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					freq++;
				}
			}
			if (freq > maxAppearance) {
				maxNumber = arr[i];
				maxAppearance = freq;
			}
		}
		System.out.println("Mode of Array is " + maxNumber);
	}

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 3, 4, 5, 4, 4, 4 };
		modeGeneral(arr);

	}

}
