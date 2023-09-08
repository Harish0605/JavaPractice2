package interviewPrep;

public class ReverseANumber {
	public static int reverseNumber(int input) {
		int output =0;
		while(input!=0) {
			int rem = input%10;
			output = output*10+rem;
			input = input/10;
		}
		return output;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input = 245;
		
		System.out.println(reverseNumber(input));

	}

}
