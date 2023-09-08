package interviewPrep;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortListOfStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] inputList = { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul",
				"aug", "Sep", "Oct", "nov", "Dec" };
		List<String> output = new ArrayList<>();
		for(String k:inputList) {
			output.add(k);
		}
		Collections.sort(output);
		System.out.println(output);

	}

}
