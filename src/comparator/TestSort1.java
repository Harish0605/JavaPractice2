package comparator;

import java.util.TreeSet;

public class TestSort1 extends Student {

	public static void main(String[] args) {
		
		//TreeSet<Integer> tset = new TreeSet<Integer>(); //Output will be natural sorting Order as we dint explicitly mention anything
		TreeSet<Integer> tset = new TreeSet<Integer>(new Student());// Output will be based on customised order which is reversed Order
		tset.add(10);
		tset.add(0);
		tset.add(15);
		tset.add(5);
		tset.add(20);
		System.out.println(tset.toString());
		
		
		
		
	
	}
}


