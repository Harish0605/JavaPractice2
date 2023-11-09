package interviewPrep;

import java.util.LinkedHashMap;
import java.util.Map;

/*
 * Write a program to print a count of individual digits in an Integer array
 * using Map : [1,0,0,1,3,5], like here 1 ->2 times, 0->2 times, etc.
 * 
 * Array -> [1,0,0,1,3,5] Output: 1->2 , 0->2, 3->1, 5->1
 */

public class CountIndividualDigits {

	public static void main(String[] args) {
		int[] arr = { 1, 0, 0, 1, 3, 5 };
		Map<Integer, Integer> elementCountMap = new LinkedHashMap<Integer, Integer>();
		for (int i = 0; i < arr.length; i++) {
			elementCountMap.put(arr[i], elementCountMap.getOrDefault(arr[i], 0) + 1);
		}
		System.out.println(elementCountMap.toString());

	}

}
