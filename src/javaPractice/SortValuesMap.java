package javaPractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

//sort the values of HashMap
//Store all the values into List by Iterating over the hashMap
//Now sort the list 		
//Once the list is sorted now Iterate the list and the values of map and store the corresponding key/value in a sorted map
//LinkedHashMap is needed as insertion order is important here

public class SortValuesMap {

	public static String sortMapValues(HashMap<Integer, String> map) {
		List<String> li = new ArrayList<>();
		for (Map.Entry<Integer, String> hm : map.entrySet()) {
			li.add(hm.getValue());
		}
		Collections.sort(li);
		Map<Integer, String> sorted = new LinkedHashMap<Integer, String>();
		for (String s : li) {
			for (Map.Entry<Integer, String> hm : map.entrySet()) {
				if (s == hm.getValue()) {
					sorted.put(hm.getKey(), hm.getValue());
				}
			}
		}

		return sorted.toString();

	}

	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(6, "Tushar");
		map.put(12, "Ashu");
		map.put(5, "Zoya");
		map.put(78, "Yash");
		map.put(10, "Praveen");
		map.put(67, "Boby");
		map.put(1, "Ritesh");
		System.out.println(map.toString());
		System.out.println(sortMapValues(map));

	}

}
