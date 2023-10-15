package interviewPrep;

public class LongestConsecutiveOccurence {
	public static int maxOccurence(int[] arr) {
		int maxcount = 0;
		int count = 0;
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] + 1 == arr[i + 1]) {
				count++;
				if (count > maxcount) {
					maxcount = count;
				}
			}

		}
		return maxcount;
	}

	public static void main(String[] args) {
		int[] arr = { 4, 3, 25, 6, 7, 8, 9, 2, 3, 10 };
		System.out.println(maxOccurence(arr));

	}

}
