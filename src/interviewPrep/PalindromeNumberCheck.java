package interviewPrep;

public class PalindromeNumberCheck {
	public static boolean palindromeNumber(int input) {		
		int temp=input;
		int output =0;
		while(input!=0) {
			int rem = input%10;
			output = output*10+rem;
			input = input/10;
		}
		if(temp==output) {
			return true;
		}else {
			return false;
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input = 121;
		if(palindromeNumber(input)==true) {
			System.out.println("Palindrome");	
		}else {
			System.out.println("Not a Palindrome");
		}		

	}

	

}
