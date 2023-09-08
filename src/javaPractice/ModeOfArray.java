package javaPractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class ModeOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {7,7,7,7,6, 1, 2, 3, 3, 4, 5, 6, 6, 6 };
		List<Integer> li = new ArrayList<>();
		Map<Integer, Integer> m = new LinkedHashMap<Integer, Integer>();
		for (int i = 0; i < a.length; i++) {
			if (!m.containsKey(a[i])) {
				m.put(a[i], 1);
			} else {
				int value = m.get(a[i]);
				m.put(a[i], value + 1);
			}
		}

		System.out.println(m.toString());

		for (Map.Entry<Integer, Integer> map : m.entrySet()) {

			li.add(map.getValue());
		}
		Collections.sort(li);
        int output = li.get(li.size() - 1);
		for (Map.Entry<Integer, Integer> map : m.entrySet()) {
             if(output==map.getValue()) {
            	System.out.println(map.getKey());
             }
		}

	}

}
