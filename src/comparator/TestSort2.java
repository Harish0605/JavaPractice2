package comparator;

import java.util.ArrayList;
import java.util.Collections;

public class TestSort2 {


	public static void main(String[] args) {
		ArrayList<Ranking> al=new ArrayList<Ranking>();  
		al.add(new Ranking(101,"Vijay",23));  
		al.add(new Ranking(106,"Ajay",27));  
		al.add(new Ranking(105,"Jai",21));
		Collections.sort(al, new RankComparator());
		for(Ranking rt :al) {
			System.out.println(rt.rollno+","+rt.name+","+rt.age);
			
		}
		
		
	}

}
