package javaPractice;

import java.util.LinkedHashMap;
import java.util.Map;

public class PalindromePrint {

	public static void countRepeatedPalindrome(String input) {
		String[] words = input.split(" ");
		Map<String, Integer> wordMap = new LinkedHashMap<String, Integer>();
		for (String word : words) {
			String reverse = new StringBuffer(word).reverse().toString();
			if (reverse.equals(word)) {
				if (!wordMap.containsKey(word)) {
					wordMap.put(word, 1);
				} else {
					wordMap.put(word, wordMap.get(word) + 1);
				}
			}
		}
		for (Map.Entry<String, Integer> map : wordMap.entrySet()) {
			System.out.println(map.getKey() + " is repeated " + map.getValue() + " times");

		}
	}

	public static void main(String[] args) {
		String input = "Hello world level madam level rider";
		String input1 = "dad is my dad not your Dad";
		countRepeatedPalindrome(input);
		countRepeatedPalindrome(input1);

	}

}
