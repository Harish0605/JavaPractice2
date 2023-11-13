package streamsLearning;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsPractice {

	public static void main(String[] args) {
		// count the number of names starting with Alphabet A
		ArrayList<String> names = new ArrayList<String>();
		names.add("Abhijeet");
		names.add("Don");
		names.add("Adam");
		names.add("Alekhya");
		names.add("Ram");

		List<String> nameswithA = names.stream().filter(s -> s.startsWith("A")).collect(Collectors.toList());
		nameswithA.forEach(s -> System.out.println(s)); // print All Names
		System.out.println("count is : " + nameswithA.size());

		// print all names where length > 3
		names.stream().filter(s -> s.length() > 3).forEach(s -> System.out.println(s));
		// limit the output to 1
		names.stream().filter(s -> s.length() > 3).limit(1).forEach(s -> System.out.println(s));

		// print names ends with last letter a with uppercase
		Stream.of("Harish", "Monesh", "Sneha", "Raj", "Ajay").filter(s -> s.endsWith("a")).map(s -> s.toUpperCase())
				.forEach(s -> System.out.println(s));

		// print names which have first letter as a with Lowercase and sorted
		Stream.of("anand", "alekhya", "ajay", "Ansari", "Bhagya").filter(s -> s.startsWith("a"))
				.map(s -> s.toLowerCase()).sorted().forEach(s -> System.out.println(s));
				
		//Concatenate two streams and print 
		Stream<String> newStream = Stream.concat(names.stream(), nameswithA.stream());
		//newStream.forEach(s -> System.out.println(s));
		
		boolean flag = newStream.anyMatch(s -> s.equalsIgnoreCase("Adam"));
		System.out.println(flag);

	}

}
