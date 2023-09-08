package javaPractice;

public class ReverseWordWithoutOrder {

	public static void main(String[] args) {
		String str = "my name is harish";
		String[] rev = str.split(" ");// splitting the string into array using space
		for (int i=0;i<rev.length;i++) {			
		       String word = rev[i];//taking each word from array
		    for (int j=word.length()-1;j>=0;j--) {//reversing it 
		    	System.out.print(word.charAt(j));
		    }System.out.println();
	}
	}

}
