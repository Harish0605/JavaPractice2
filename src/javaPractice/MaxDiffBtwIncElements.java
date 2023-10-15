package javaPractice;

public class MaxDiffBtwIncElements {

	public static int maxDiff(int[] nums) {
		int maxDiff = -1;
		for (int i = 0; i < nums.length; i++) {
			int diff = 0;
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] < nums[j]) {
					diff = nums[j] - nums[i];
					if (diff > maxDiff) {
						maxDiff = diff;
					}
				}

			}
		}

		return maxDiff;
	}

	public static void main(String[] args) {
		int[] nums = { 7, 1, 5, 4 };
		System.out.println(maxDiff(nums));
		int[] nums1 = { 9, 4, 3, 2 };
		System.out.println(maxDiff(nums1));
		int[] nums2 = { 1, 5, 2, 10 };
		System.out.println(maxDiff(nums2));
		int[] nums3 = { 2, 3, 10, 6, 4, 8, 1 };
		System.out.println(maxDiff(nums3));
		int[] arr = { 7, 9, 5, 6, 3, 2 };
		System.out.println(maxDiff(arr));
		int[] nums4 = { 23, 67, 1, 6, 97, 21, 7 };
		System.out.println(maxDiff(nums4));

	}

}
