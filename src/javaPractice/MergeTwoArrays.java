package javaPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeTwoArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[]= {1,5,2,4};
		int arr2[]= {5,3,8,7,9};
		Arrays.sort(arr1);
		Arrays.sort(arr2);
       List<Integer> li1 = new ArrayList<Integer>();
       List<Integer> li2 = new ArrayList<Integer>();
       for(int k:arr1) {
    	   li1.add(k);
       }
       for(int m:arr2) {
    	   li2.add(m);
       }
       li1.addAll(li2);
       
       Object[] arr3=li1.toArray();
       for(Object l:arr3) {
    	   System.out.print(l);
       }
	}

}
