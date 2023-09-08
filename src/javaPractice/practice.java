package javaPractice;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;
public class practice {
	
	public static void main(String []argh)
	{
		 Scanner s = new Scanner(System.in);
	        int t = s.nextInt();
	        String [] pair_left = new String[t];
	        String [] pair_right = new String[t];
	        
	        for (int i = 0; i < t; i++) {
	            pair_left[i] = s.next();
	            pair_right[i] = s.next();
	        }
	        
		Set<String> hset = new LinkedHashSet<String>();
		int count =0;
		for(int i=0;i<t;i++) {
			
			String s1 = "";
			s1=s1+pair_left[i]+" "+pair_right[i];
			
			if(hset.add(s1)) {
				count++;
				System.out.println(count);
			}else {
				System.out.println(count);
			}
			
		}
		
		
}	
	
}
