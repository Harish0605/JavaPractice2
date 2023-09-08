package javaPractice;

public class ArraySort {
	
	public static void sortArray(int[] arr) {
		int temp=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
			if(arr[i]>arr[j]) {
				temp=arr[j];
				arr[j]=arr[i];
				arr[i]=temp;
			}
			}
			System.out.print(arr[i]+",");
		}
		
	}
	public static void sortDescend(int arr[]) {
		int temp=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
			if(arr[i]<arr[j]) {
				temp=arr[j];
				arr[j]=arr[i];
				arr[i]=temp;
			}
			}
			System.out.print(arr[i]+",");
		}
	}

	public static void main(String[] args) {
		int[] array = {4,2,7,8,100,1};
		sortArray(array);
		System.out.println("********************");
		sortDescend(array);

	}

}
