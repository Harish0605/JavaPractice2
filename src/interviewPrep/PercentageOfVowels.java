package interviewPrep;

public class PercentageOfVowels {

	public static void calculatePercent(String[] words) {
		String vowels = "AEIOUaeiou";
		for (String word : words) {
			int count = 0;
			for (int i = 0; i < word.length(); i++) {
				if (vowels.contains("" + word.charAt(i))) {
					count++;
				}
			}
			double percent = (double) count / word.length() * 100;
			System.out.println(word + " percentage is " + percent);
		}
	}

	public static void main(String[] args) {
		String[] words = { "Google", "OpenAI", "Hello World", "AEIOUaeiou", "The quick brown fox" };
		calculatePercent(words);
	}

}
