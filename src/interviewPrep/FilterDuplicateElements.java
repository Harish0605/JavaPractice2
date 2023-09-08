package interviewPrep;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class FilterDuplicateElements {
	public static List<Integer> Filter(int[] arr) {
		List<Integer> li = new ArrayList<>();
		Map<Integer, Integer> m = new LinkedHashMap<>();
		for (int k : arr) {
			if (!m.containsKey(k)) {
				m.put(k, 1);
			} else {
				m.put(k, m.get(k) + 1);
			}
		}
		for (Map.Entry<Integer, Integer> map : m.entrySet()) {
			if (map.getValue() >= 1) {
				li.add(map.getKey());
			}
		}

		return li;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 3, 1, 4, 2, 3, 5 }; // 1,3
		int[] arr1 = { 4, 1, 5, 1, 3, 8, 4, 5, 6, 7, 1, 8 }; // 4,1,5,8
		System.out.println(Filter(arr).toString());
		System.out.println(Filter(arr1).toString());
	}

}
