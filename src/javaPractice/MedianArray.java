package javaPractice;

public class MedianArray {
	
	public static void medianSortArray(int[] a) {
		int len = a.length;
		if(len%2!=0) {			
			System.out.println(a[a.length/2]);
		}else {
			int k = a.length/2+(a.length/2-1);
			System.out.println(k);
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int[] a = {1,2,3,4};
       int[] b = {1,2,3,4,5};
       medianSortArray(a);
       medianSortArray(b);
		
	}

}
