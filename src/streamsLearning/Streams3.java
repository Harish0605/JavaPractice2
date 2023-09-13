package streamsLearning;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Streams3 {

	public static void main(String[] args) {
		// Merge two lists and sort them
		String[] arr = { "man", "Don", "women" };
		List<String> names = Arrays.asList(arr);

		List<String> names1 = new ArrayList<String>();
		names1.add("Abhijeet");
		names1.add("Don");
		names1.add("Alekhya");
		names1.add("Adam");
		names1.add("Ram");
        //merging two different lists
		Stream<String> newStream = Stream.concat(names.stream(), names1.stream());
		newStream.sorted().forEach(s -> System.out.println(s));
		
		//if the sorted list has Adam then give me boolean value like true or false
		Stream<String> latestStream = Stream.concat(names.stream(), names1.stream());
		boolean flag = latestStream.sorted().anyMatch(s -> s.equalsIgnoreCase("Adam"));
		if(flag) {
			System.out.println("found");
		}else {
			System.out.println("Not found");
		}
	}

}
