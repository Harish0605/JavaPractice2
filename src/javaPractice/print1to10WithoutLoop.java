package javaPractice;

import java.util.Scanner;

public class print1to10WithoutLoop {
	//recursion: method calling inside method
	
	public static void printLoop(int n) {
		if(n<=10) {// checks if input number is less than 10
		System.out.println(n);
		printLoop(n+1);//calling same method by incrementing entered value
		}
		}	
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the value");
		int num = scan.nextInt();
		printLoop(num);		
	}

}
