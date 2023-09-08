package javaPractice;
import java.util.*;

public class ArrayListQuery {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int lines = scan.nextInt();
		ArrayList<ArrayList<Integer>> Big = new ArrayList<ArrayList<Integer>>();
		ArrayList<ArrayList<Integer>> queries = new ArrayList<ArrayList<Integer>>();
		for(int i=0;i<lines;i++) {
			int m = scan.nextInt();
			ArrayList<Integer> small = new ArrayList<Integer>();
			for(int j=0;j<m;j++) {
				small.add(scan.nextInt());
			}			
			Big.add(small);		
		}
		
		int q = scan.nextInt();
		for(int k=0;k<q;k++) {
			ArrayList<Integer> p = new ArrayList<Integer>();
			for(int l=0;l<2;l++) {
			p.add(scan.nextInt());
			}
			queries.add(p);
		}
		System.out.println(Big);
		System.out.println(queries);
		for(int l=0;l<q;l++) {
			int x= queries.get(l).get(0);
			int y= queries.get(l).get(1);
			try {
				System.out.println(Big.get(x-1).get(y-1));
				
			}
			catch(IndexOutOfBoundsException e){
				System.out.println("ERROR!");
				
			}
		}
		
		
		
		
		
		
}
}
