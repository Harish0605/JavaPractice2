package javaPractice;

public class ReverseFirstHalfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {10,2,5,4,6,9,5,3};
		int len= a.length;
		for(int i=0;i<len/4;i++) {
			 int temp = a[len/2-1-i];
			 a[len/2-1-i]= a[i];
			 a[i]=temp;
		}
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}

	}

}
