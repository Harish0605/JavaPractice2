package streamsLearning;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class Streams10Programs {

	public static void main(String[] args) {
		List<String> strList = Arrays.asList("abc", "", "bcd", "", "defg", "jk");

		// Counting Empty String
		long count1 = strList.stream().filter(s -> s.isEmpty()).count();
		System.out.println(count1); // 2

		// Count String whose length is more than three
		long count2 = strList.stream().filter(s -> s.length() > 3).count();
		System.out.println(count2); // 1
		
		//Count number of String which starts with "a"
        long count3 = strList.stream().filter(s -> s.startsWith("a")).count();
        System.out.println(count3); // 1
        
        //Remove all empty Strings from list
        List<String> filtered = strList.stream().filter(s -> s.length()>1).collect(Collectors.toList());
        filtered.stream().forEach(s -> System.out.println(s));
        
        //Create a List with String more than 2 characters
       List<String> li = strList.stream().filter(s -> s.length()>2).collect(Collectors.toList());
       li.stream().forEach(s -> System.out.println(s));
       
       //Convert String to uppercase and Join them with coma
       List<String> G7 = Arrays.asList("USA", "Japan", "France", "Germany", "Italy", "U.K.","Canada");
       String G7Countries = G7.stream().map(s -> s.toUpperCase()).collect(Collectors.joining(","));
       System.out.println(G7Countries);
       
       //Create a List of the square of all distinct numbers
       List<Integer> numbers = Arrays.asList(9, 10, 3, 4, 7, 3, 4);
      List<Integer> distinct= numbers.stream().distinct().map(k -> k*k).collect(Collectors.toList());
      distinct.stream().forEach(m -> System.out.println(m));
      
      //Get count, min, max, sum, and the average for numbers
      List<Integer> primes = Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29);
     IntSummaryStatistics stats = primes.stream().mapToInt((x) -> x).summaryStatistics();
     System.out.println(stats.getAverage());
     System.out.println(stats.getCount());
     System.out.println(stats.getMax());
     System.out.println(stats.getMin());
     System.out.println(stats.getSum());
     




     

        

	}

}
