package javaPractice;

import java.util.Scanner;

public class printIndexesOfDifferentLetters {

	public static void main(String[] args) {
		// Print the indexes of specified letter in string in java
		String str = "abcdefgh";
		char ch ='d';
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)==ch) {
				System.out.println(i);
			}
		}
		

	}

}
