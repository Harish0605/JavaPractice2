package streamsLearning;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsByDurga {

	public static void main(String[] args) {
		List<Integer> li = new ArrayList<Integer>();
		li.add(0);
		li.add(5);
		li.add(10);
		li.add(15);
		li.add(20);
		li.add(25);
		//print only even numbers from the list
		li.stream().filter(n -> (n%2==0)).forEach(n -> System.out.println(n));
		
		//add 7 to all the numbers and print the list
		List<Integer>list2=li.stream().map(k -> (k+7)).collect(Collectors.toList());
		list2.stream().forEach(k -> System.out.println(k));
		
		//number of failed students
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(70);
		al.add(45);
		al.add(10);
		al.add(65);
		al.add(20);
		al.add(25);
		long count = al.stream().filter(k -> k>35).count();
		System.out.println(count);
		
		//sort the students list
		al.stream().sorted().forEach(s -> System.out.println(s));
		
		//sort in descending order -- use Comparator in sorted method
		List<Integer> descSorted=al.stream().sorted((i1,i2) -> (i1<i2)?1:(i1>i2)?-1:0).collect(Collectors.toList());
		descSorted.stream().forEach(s -> System.out.println(s));
		
		//get the min value
		System.out.println(al.stream().min((i1,i2) -> i1.compareTo(i2)).get());
		
		//get the max value
		System.out.println(al.stream().min((i1,i2) -> i2.compareTo(i1)).get());
		
		
	}

}
