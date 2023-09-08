package javaPractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//Take a HashMap and store it based on the repetition of values
//Take the values and add it in the List
//Now Sort the list and reverse the list to see the most repeated or great number based on the decreasing order
//Now based on these values, print their keys from the hashmap
//You should stop printing the keys by reducing the values to get the repeated values
//Store them in another list based on the expected output and print

public class SortMostRepeatedValues {
	public static List<Integer> mostRepeatedValues(int[] arr) {
		List<Integer> output = new ArrayList<>();

		Map<Integer, Integer> map = new HashMap<>();
		for (int k : arr) {
			if (!map.containsKey(k)) {
				map.put(k, 1);
			} else {
				map.put(k, map.get(k) + 1);
			}
		}

		List<Integer> li = new ArrayList<>();
		for (Map.Entry<Integer, Integer> m : map.entrySet()) {
			li.add(m.getValue());
		}
		Collections.sort(li,Collections.reverseOrder());
		

		for (int j : li) {
			for (Map.Entry<Integer, Integer> m : map.entrySet()) {
				if (j == m.getValue()) {
					while (j != 0) {
						output.add(m.getKey());
						j--;
					}
				}
			}
		}
		return output;
	}

	public static void main(String[] args) {
		int[] arr = { 3, 7, 6, 1, 1, 7, 7, 1, 6, 1 };
		int[] arr2 = { 2, 1, 4, 1, 3, 4, 5, 1, 1, 3, 4, 4, 4, 3, 4 };
		System.out.println(mostRepeatedValues(arr));
		System.out.println(mostRepeatedValues(arr2));

	}

}
