package programsexercise;

public class SynechronDec12R1 {

	public static void main(String[] args) {
		/*
		 * 
		 * * * * * * * * * * *
		 */

		// print *
		// length 5
//		
//		for(int i=0;i<5;i++) {
//			for(int j=5;j>=5-i;j--) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//
		String s = "Good morning madam";
		// op = madam
		// Print the palindrome word from the given sentence
		String[] words = s.split(" ");
		// System.out.println(words[2]);

		// outer for loop for iterating through the words
		// inner for loop for iterationg through each wrds and check if its palindrome
		// if input word = reverse of that word

		for (int i = 0; i < words.length; i++) {
			String word = words[i];
			// System.out.println(word);
			String temp = "";
			for (int j = word.length() - 1; j >= 0; j--) {
				temp = temp + word.charAt(j);

			}
			if (word.equals(temp)) {
				System.out.println(temp);
			}
		}
	}

}
