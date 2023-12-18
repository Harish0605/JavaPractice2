package programsexercise;

public class AccentureInterview {

	public static void stringApproach(String s) {
		String s1 = "";
		String s2 = "";
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) > '0' && s.charAt(i) < '9') {
				s1 = s1 + s.charAt(i);
			} else {
				s2 = s2 + s.charAt(i);
			}
		}
		System.out.println(s2 + s1);
	}

	public static void losingOrder(String s) {
		char[] ch = s.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			for (int j = i + 1; j < ch.length; j++) {
				if (Integer.parseInt("" + ch[i]) > Integer.parseInt("" + ch[j]) && Integer.parseInt("" + ch[j]) == 0) {
					char temp = ch[j];
					ch[j] = ch[i];
					ch[i] = temp;
				}
			}
			System.out.print(ch[i]);
		}
		System.out.println();
	}
	
	public static void usingStringBuilder(String s) {
		StringBuilder result = new StringBuilder();
		// First, append all zeroes to the result string
		for (int i = 0; i < s.length(); i++) {
		    if (s.charAt(i) == '0') {
		        result.append('0');
		    }
		}
		// Then, append all non-zero digits to the result string
		for (int i = 0; i < s.length(); i++) {
		    if (s.charAt(i) != '0') {
		        result.append(s.charAt(i));
		    }
		}
		System.out.println(result.toString());
	}

	public static void main(String[] args) {
		String s = "32400121200";
		stringApproach(s); // 00003241212
		losingOrder(s); // 00002121243
		usingStringBuilder(s); // 00003241212
	}

}
