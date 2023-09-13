package streamsLearning;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Streams4 {

	public static void main(String[] args) {
		// Stream collect method to collect the results and store it in a new list
		List<String> li = Stream.of("Azbhijeet", "Don", "Alekhya", "Adam", "Rama").filter(s -> s.startsWith("A"))
				.sorted().map(s -> s.toUpperCase()).collect(Collectors.toList());
		System.out.println(li.get(0));

		// you can also use limit method to get the first value
		Stream.of("Azbhijeet", "Don", "Alekhya", "Adam", "Rama").filter(s -> s.startsWith("A")).sorted()
				.map(s -> s.toUpperCase()).limit(1).forEach(s -> System.out.println(s));

		List<Integer> values = Arrays.asList(3, 2, 2, 7, 5, 1, 9, 7);
		// print unique numbers from this Arrays
		// sort the Array and give me the third index -- 1,2,3,5,7,9
		values.stream().distinct().forEach(k -> System.out.println(k));
		System.out.println("****************");
		List<Integer> newList = values.stream().distinct().sorted().collect(Collectors.toList());
		System.out.println(newList.get(2)); // 3

	}

}
