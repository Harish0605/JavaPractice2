package javaPractice;
import java.util.*;
public class JumpGame {

	 
	public static boolean canWin(int leap, int[] game) {
		 boolean status= false;;
	   a: for(int i=0;i<game.length;i++) {
		   try {
			   if(game[i+1]==0) {
		        	status = true;
		        		
		        	}
		        	else if(game[i+leap]==0) {
		        		i=i+leap;
		        		status = true;
		        		
		        	}
		        	else {
		        		
		        		status = false;
		        		break a;        		
		        		
		        	}
		        }
		   catch(ArrayIndexOutOfBoundsException e) {
			   return status;
			   
		   }
		   }
	        	
		 
		 
		 return status;
	    }

	    public static void main(String[] args) {
	        Scanner scan = new Scanner(System.in);
	        int q = scan.nextInt();
	        while (q-- > 0) {
	            int n = scan.nextInt();
	            int leap = scan.nextInt();
	            
	            int[] game = new int[n];
	            for (int i = 0; i < n; i++) {
	                game[i] = scan.nextInt();
	            }

	           System.out.println( (canWin(leap, game)) ? "YES" : "NO" );
	         
	        }
	        scan.close();
	    }

}
