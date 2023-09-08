package javaPractice;

import java.util.Scanner;

public class reverseStringwithoutBuiltInFunctions {
	
	public static void reverseString(String s) {
		for (int i=s.length()-1;i>=0;i--) {//printing in reverse Order
			System.out.print(s.charAt(i));
		}
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the word that you want to reverse");
		String reverse = scan.nextLine();
		reverseString(reverse);		

	}

}
