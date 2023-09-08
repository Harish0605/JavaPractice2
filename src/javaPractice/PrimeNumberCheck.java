package javaPractice;

import java.util.Scanner;

public class PrimeNumberCheck {
	
	public static boolean primeCheck(int n) {
		boolean result=false;
		for (int i=2;i<n/2;i++) {
			if(n%i==0) {				
				 result=false;
				 System.out.print("not prime"+n);
				break;
				}
			else
				result=true;
			System.out.print("prime"+n);
		}
	return result;	
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number");
		int num = scan.nextInt();
		primeCheck(num);
		
				}

}
