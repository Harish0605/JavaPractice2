package interviewPrep;

public class MoveAllZeroesLeft {

	public static void main(String[] args) {
		int[] arr = { 0,1,0,3,12 };
		for (int i = 0; i < arr.length; i++) {
		    if (arr[i] == 0) {
		        for (int j = i + 1; j < arr.length; j++) {
		            if (arr[j] != 0) {
		                int temp = arr[j];
		                arr[j] = arr[i];
		                arr[i] = temp;
		                break; // Move one zero at a time
		            }
		        }
		    }
		    System.out.println(arr[i]);
		}

//		for(int k=0;k<arr.length;k++) {
//			System.out.println(arr[k]);
//		}

	}

}
