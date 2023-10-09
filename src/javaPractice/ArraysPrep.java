package javaPractice;

public class ArraysPrep {

	public static void traverseArray(int[] arr) {
		// Traverse Array
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

	public static boolean linearSearch(int[] arr, int key) {
		boolean status = false;
		// Linear Search
		for (int i = 0; i < arr.length; i++) {
			if (key == arr[i]) {
				System.out.println("Element is " + arr[i] + " and Index is " + i);
				status = true;
				break;
			} else {
//				System.out.println("Element not found");
				status=false;
			}
		}
		return status;
	}

	// we cannot delete the element in the array, instead we can replace the value
	public static void deleteArrayElement(int[] arr, int indexValue) {
		try {
			arr[indexValue] = Integer.MIN_VALUE;
			System.out.println("Value has been deleted from the index: " + indexValue);
			System.out.println(arr[indexValue]);

		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Index value does not exist in array range!!!");
		}
	}

	public static void findMinAndMaxElement(int[] arr) {
//		for (int i = 0; i < arr.length; i++) {
//			for (int j = i + 1; j < arr.length; j++) {
//				if (arr[i] > arr[j]) {
//					int temp = arr[j];
//					arr[j] = arr[i];
//					arr[i] = temp;
//				}
//			}
//		}
//		System.out.println("Smallest Element in the Array is : "+arr[0]);
//		System.out.println("Largest Element in the Array is : "+arr[arr.length-1]);
		int max = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
			}

		}
		System.out.println("Largest Element in the Array is : " + max);
	}


	public static void main(String[] args) {
		// Array Initialization:
		// int sizeOfArray = 10;
		// int[] arr = new int[sizeOfArray]; // By default, values are 0;
		int[] arr = { 7, 11, 6, 55, 98, 45, 16, 96, 46 };
//		int[] arr1 = { 7, 96, 6, 2, 45, 16, 4, 1 };
		traverseArray(arr);
		System.out.println(linearSearch(arr, 6));
//		deleteArrayElement(arr, 16);
//		findMinAndMaxElement(arr1);


	}

}
