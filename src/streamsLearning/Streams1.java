package streamsLearning;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

//Count the number of names starting with alphabet A in list
public class Streams1 {

	public static void getNamesWithoutStreams(List<String> names) {
		int count = 0;
		for (String name : names) {
			if (name.startsWith("A")) {
				count++;
				System.out.println(name);
			}
		}
//		for(String name: names) {
//		String ch = name.substring(0,1);
//		if(ch.equals("A")) {
//			count++;
//			System.out.println(name);
//		}
//	}
		System.out.println("Names present with Alphabet A are " + count);

	}

	public static void withStreams(List<String> li) {
		// If there is no terminal op then there is no life for intermediate op
		// Terminal op will execute only if inter op(filter) returns true
		// we can create stream
		// how to use filter in Streams API
		long c = li.stream().filter(s -> s.startsWith("A")).count();
		System.out.println(c);

		// we can also declare elements in stream
		long d = Stream.of("Abhijeet", "Don", "Alekhya", "Adam", "Ram").filter(s -> s.startsWith("A")).count();
		System.out.println(d);

		// we can also write in loop
		long k = Stream.of("Abhijeet", "Don", "Alekhya", "Adam", "Ram").filter(s -> {

			return s.startsWith("A");
		}).count();
		System.out.println(k);
	}
	
	public static void printNamesWithStreams(List<String> li) {
		//li.stream().forEach(s -> System.out.println(s)); //get all names
		//li.stream().filter(s -> s.length()>4).forEach(s -> System.out.println(s)); // get names where length is > 4
		li.stream().filter(s -> s.length()>4).limit(1).forEach(s -> System.out.println(s)); //get first String
	}

	public static void main(String[] args) {
		List<String> names = new ArrayList<String>();
		names.add("Abhijeet");
		names.add("Don");
		names.add("Alekhya");
		names.add("Adam");
		names.add("Ram");
		getNamesWithoutStreams(names);
		withStreams(names);
		printNamesWithStreams(names);
	}

}
