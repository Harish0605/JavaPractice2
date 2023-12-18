package programsexercise;

import java.util.LinkedHashMap;
import java.util.Map;

/*
 * 4) Find the longest substrings of these three strings: 
Example 1 - aab
Example 2 - pwwkew
Example 3 - abcbcabcda
 */

//Order matters here so we are taking LinkedHashMap

public class LongestSubStrings {

	public static void longestSubString(String s) {
		String longestSubString = null;
		int longestSubStringLength = 0;
		Map<Character, Integer> lmap = new LinkedHashMap<>();
		char[] arr = s.toCharArray();
		for (int i = 0; i < s.length(); i++) {
			if (!lmap.containsKey(arr[i])) {
				lmap.put(arr[i], i);
			} else {
				i = lmap.get(arr[i]);
				lmap.clear();
			}
		}
		if (lmap.size() > 1) {
			longestSubStringLength = lmap.size();
			longestSubString = lmap.keySet().toString();

		}
		System.out.println("Length of LongestSubString is " + longestSubStringLength);
		System.out.println("LongestSubString is " + longestSubString);
	}

	public static void main(String[] args) {
		String s = "abcbcabcda";
		String s1 = "pwwkew";
		String s2 = "aab";
		longestSubString(s);
		longestSubString(s1);
		longestSubString(s2);

	}

}
