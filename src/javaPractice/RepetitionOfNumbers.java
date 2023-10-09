package javaPractice;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

public class RepetitionOfNumbers {

	public static void main(String[] args) {
		int[] a = { 4, 5, 5, 5, 4, 6, 6, 9, 4 };
        //Using Map
		Map<Integer, Integer> elementsMap = new LinkedHashMap<Integer, Integer>();
		for (int i = 0; i < a.length; i++) {
			if (!elementsMap.containsKey(a[i])) {
				elementsMap.put(a[i], 1);
			} else {
				elementsMap.put(a[i], elementsMap.get(a[i]) + 1);
			}
		}
		System.out.println(elementsMap.toString());
		for (Map.Entry<Integer, Integer> map : elementsMap.entrySet()) {
			if (map.getValue() == 1) {
				System.out.println("Unique element in the array is " + map.getKey());
			}
		}
       //Using ArrayList
		ArrayList<Integer> al = new ArrayList<Integer>();
		for (int i = 0; i < a.length; i++) {
			int k = 0;
			if (!al.contains(a[i])) {
				al.add(a[i]);
				k++;
				for (int j = i + 1; j < a.length; j++) {
					if (a[i] == a[j]) {
						k++;
					}
				}
				System.out.println(a[i] + " is repeated : " + k);
				if(k==1) {
					System.out.println("unique number is "+a[i]);
				}
			}

		}
//		System.out.println(al.toString());
	}

}
