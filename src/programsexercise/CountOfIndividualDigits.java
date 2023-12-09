package programsexercise;

import java.util.HashMap;
import java.util.LinkedHashMap;

/*
 * Write a program to print a count of individual digits in an Integer array using Map : [1,0,0,1,3,5]
 *  like here 1 ->2 times, 0->2 times, etc.

    Array -> [1,0,0,1,3,5]
    Output: 1->2 , 0->2, 3->1, 5->1
 */

public class CountOfIndividualDigits {

	public static void countUsingMap(int[] inputArray) {
		HashMap<Integer, Integer> countMap = new LinkedHashMap<>();
		for (int i : inputArray) {
			countMap.put(i, countMap.getOrDefault(i, 0)+1);
		}
		System.out.println(countMap.toString());

	}

	public static void main(String[] args) {
		int[] arr = { 1, 0, 0, 1, 3, 5 };
		countUsingMap(arr);
	}

}
