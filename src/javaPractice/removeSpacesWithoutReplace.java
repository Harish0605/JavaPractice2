package javaPractice;

public class removeSpacesWithoutReplace {

	public static void main(String[] args) {
		// Remove spaces from string without using replace()
		
		String str = "My name is Harish and I am an Analyst";
//		String[] arr = str.split(" ");
//		for(int i=0;i<arr.length;i++) {
//			System.out.print(arr[i]);
//		}
		
		for(int i=0;i<str.length();i++) {
		if(str.charAt(i)!=' ') {
			System.out.print(str.charAt(i));
		}
		}
	}

}
