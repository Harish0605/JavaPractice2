package javaPractice;

import java.util.Scanner;

public class UnifyInterview {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = scan.nextInt();
		int prime=2;
		int count=0;
			while(count<num) {
				if(primeNumberCheck(prime)) {
					System.out.println(prime);
						count++;
					
					}	
				prime++;
			
		}

	}
	public static boolean primeNumberCheck(int n) {
		boolean result=false ;
		for(int i=2;i<=n/2;i++) {
			if(n%i==0) {
				
				result=false;
				break;
			}
			else {
				
				result=true;
			}
		}
		return result;
	}

}
