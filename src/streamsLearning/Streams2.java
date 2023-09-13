package streamsLearning;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Streams2 {

	public static void main(String[] args) {
		// print the count of names that ends with "a"
		long d = Stream.of("Abhijeet", "Don", "Alekhya", "Adam", "Rama").filter(s -> s.endsWith("a")).count();
		System.out.println(d);
		// print names that ends with "a" with Uppercase
		Stream.of("Abhijeet", "Don", "Alekhya", "Adam", "Rama").filter(s -> s.endsWith("a")).map(s -> s.toUpperCase())
				.forEach(s -> System.out.println(s));
		System.out.println("***************");
		// print names which have first letter "a" with Uppercase and sorted
		Stream.of("Azbhijeet", "Don", "Alekhya", "Adam", "Rama").filter(s -> s.startsWith("A")).sorted()
				.map(s -> s.toUpperCase()).forEach(s -> System.out.println(s));

		// we can apply Stream on Array by converting it to List
		String[] arr = { "Azbhijeet", "Don", "Alekhya", "Adam", "Rama" };
		List<String> li = Arrays.asList(arr);
		li.stream().filter(s -> s.startsWith("A")).sorted().map(s -> s.toUpperCase())
				.forEach(s -> System.out.println(s));
		
	}

}
