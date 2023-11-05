package interviewPrep;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PlaceElementsOnOccurence {
	public static void arrangeElements(int[] arr) {
		Map<Integer, Integer> valueMap = new HashMap<>();

		// Count the occurrences of each element
		for (int i = 0; i < arr.length; i++) {
			valueMap.put(arr[i], valueMap.getOrDefault(arr[i], 0) + 1);
		}

		List<Map.Entry<Integer, Integer>> entryList = new ArrayList<>(valueMap.entrySet());

		// Sort the entries by count in descending order
		entryList.sort((e1, e2) -> e2.getValue().compareTo(e1.getValue()));

		// Print the elements based on their counts
		for (Map.Entry<Integer, Integer> entry : entryList) {
			int element = entry.getKey();
			int count = entry.getValue();

			for (int i = 0; i < count; i++) {
				System.out.println(element);
			}
		}
	}

	public static void main(String[] args) {
		int[] arr = { 3, 7, 6, 1, 1, 7, 7, 1, 6, 1 }; // {1,1,1,1,7,7,7,6,6,3}
		arrangeElements(arr);

	}

}
