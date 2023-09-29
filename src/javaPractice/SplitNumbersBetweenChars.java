package javaPractice;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SplitNumbersBetweenChars {

	public static List<String> regexSplit(String s) {
		List<String> li = new ArrayList<String>();
		Pattern p = Pattern.compile("[0-9]+");
		Matcher m = p.matcher(s);
		while (m.find()) {
			li.add(m.group());
		}
		for (int i = 0; i < s.length(); i++) {
			if (!Character.isDigit(s.charAt(i))) {
				li.add(s.charAt(i) + "");
			}
		}
		return li;
	}

	public static String[] splitString(String input) {
		StringBuffer integers = new StringBuffer();
		StringBuffer alphabets = new StringBuffer();

		for (int i = 0; i < input.length(); i++) {
			char currentChar = input.charAt(i);
			if (Character.isDigit(currentChar)) {
				StringBuffer number = new StringBuffer();
				number.append(currentChar);

				while (i + 1 < input.length() && Character.isDigit(input.charAt(i + 1))) {
					i++;
					number.append(input.charAt(i));
				}

				integers.append(number.toString()).append(" ");
			} else if (Character.isLetter(currentChar)) {
				alphabets.append(currentChar).append(" ");
			}
		}

		// Convert StringBuffer to String
		String integerResult = integers.toString().trim();
		String alphabetResult = alphabets.toString().trim();

		// Return the results as an array of strings
		return new String[] { alphabetResult, integerResult };
	}

	public static void main(String[] args) {

		String input = "a23b123c4567d1e"; // Example input
		String str = "";
		for (int i = 0; i < input.length(); i++) {
			if (input.charAt(i) >= 'a' && input.charAt(i) <= 'z') {
				System.out.println("Integers are "+str);
				str = "";
				System.out.println("Alphabets are : "+input.charAt(i));
			} else {
				str = str + input.charAt(i);
			}
		}
		System.out.println("output is "+str);

		// Split the input into alphabets and integers
		String[] results = splitString(input);

		// Print the results
		System.out.println("Alphabets: " + results[0]);
		System.out.println("Integers: " + results[1]);

		System.out.println(regexSplit(input));

	}
}
