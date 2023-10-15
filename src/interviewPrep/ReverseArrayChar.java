package interviewPrep;

public class ReverseArrayChar {

	public static void reverseArrayChars(char[] s) {

		// swap depends on length of Array
		int swap = s.length / 2;
		for (int k = 0; k < swap; k++) {
			char temp = s[k];
			s[k] = s[s.length - 1 - k];
			s[s.length - 1 - k] = temp;
		}
		// Printing the Array characters
		for (int i = 0; i < s.length; i++) {
			System.out.println(s[i]);
		}
		System.out.println("Reverse completed");
	}

	public static void main(String[] args) {
		char[] s = { 'a', 'b', 'c', 'd', 'e' };
		reverseArrayChars(s);
		char[] s1 = { 'a', 'b', 'c', 'd', 'e', 'f', 'g' };
		reverseArrayChars(s1);
		char[] s2 = { 'a', 'b', 'c', 'd' };
		reverseArrayChars(s2);

	}

}
