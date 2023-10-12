package interviewPrep;

public class LeaderInArray {

	public static void arrayLeaders(int[] arr) {

		for (int i = 0; i < arr.length; i++) {
			boolean flag = false;

			for (int j = i + 1; j < arr.length; j++) {

				if (arr[i] > arr[j]) {

					flag = true;

				} else {

					flag = false;

					break;
				}
			}
			if (flag == true || i == arr.length - 1) {

				System.out.println(arr[i]);
			}
		}
		System.out.println("************");

	}
	
	//second approach
	public static void arrayOfLeaders(int[] arr) {
	    int n = arr.length;
	    int leader = arr[n - 1];
	    System.out.println(leader); // The rightmost element is always a leader

	    for (int i = n - 2; i >= 0; i--) {
	        if (arr[i] > leader) {
	            leader = arr[i];
	            System.out.println(leader);
	        }
	    }
	    System.out.println("************");
	}

	public static void main(String[] args) {
		// An element is leader if it is greater than all the elements to its right side
		int[] arr1 = { 1, 2, 4, 3, 8, 6, 7, 1 };
		arrayLeaders(arr1);		
		int[] arr2 = { 5, 3, 20, 15, 10 };
		arrayLeaders(arr2);
		int[] arr3 = { 10, 15, 8, 12, 2 };
		arrayLeaders(arr3);
		int[] arr4 = { 6, 7, 8, 4, 3, 1 };
		arrayLeaders(arr4);
		int[] arr5 = { 1, 2, 3, 4, 5 };
		arrayLeaders(arr5);

	}

}
