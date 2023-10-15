package javaPractice;

import java.util.LinkedHashMap;
import java.util.Map;

public class CharOccurence {
	public static String charCountOccurance(String s) {
		String op = "";
		int count = 1;
		for (int i = 0; i < s.length() - 1; i++) {
			if (s.charAt(i) == s.charAt(i + 1)) { // if adjacent chars are equal
				count++;
			} else if (s.charAt(i) != s.charAt(i + 1)) { // if adjacent chars are not equal
				op = op + s.charAt(i) + count;
				count = 1;
			}
		}
		op = op + s.charAt(s.length() - 1) + count; // get the last char and outstanding count
		return op + " : without using Map";
	}

	public static String charCountMap(String s) {
		 String op = "";
		Map<Character, Integer> map = new LinkedHashMap<>();
		for (int i = 0; i < s.length(); i++) {
			if (!map.containsKey(s.charAt(i))) {
				map.put(s.charAt(i), 1);
			}
			else {
				map.put(s.charAt(i),map.get(s.charAt(i))+1);
			}
		}
		op = op + map.toString();
		return op + " : using Map";

	}

	public static void main(String[] args) {
		String s = "aabbc";
		System.out.println(charCountOccurance(s));
		System.out.println(charCountMap(s));
		String s1 = "abbcccd";
		System.out.println(charCountOccurance(s1));
		System.out.println(charCountMap(s1));
		String s2 = "aabcccdd";
		System.out.println(charCountOccurance(s2));
		System.out.println(charCountMap(s2));

	}

}
