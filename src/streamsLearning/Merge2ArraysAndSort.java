package streamsLearning;

import java.util.ArrayList;
import java.util.List;

public class Merge2ArraysAndSort {

	public static void main(String[] args) {
		int[] arr1 = { 10, 5, 15 };
		int[] arr2 = { 20, 3, 2 };

		List<Integer> list1 = new ArrayList<Integer>();
		for (int k : arr1) {
			list1.add(k);
		}
		for (int m : arr2) {
			list1.add(m);
		}

		list1.stream().sorted().forEach(s -> System.out.println(s));

	}

}
