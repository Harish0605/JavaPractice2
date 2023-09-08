package javaPractice;

public class CountWords {
	
	public static int Count(String s) {
		if(s.length()!=1) {
			String[] words = s.split(" ");
			  int count=0;
			  count=words.length;
			  return count;
					
		}else {
			return 1;
		}		
		
	}

	public static void main(String[] args) {
		String s = "Enter the String:";
		System.out.println(Count(s));

	}

}
