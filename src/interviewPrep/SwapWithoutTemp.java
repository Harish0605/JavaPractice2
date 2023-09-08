package interviewPrep;

public class SwapWithoutTemp {
	
	public static void swapNumbers(int x,int y) {
		x=x+y;
		y=x-y;
		x=x-y;
		System.out.println(x+" "+y);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 61;
		int y = 23;
		swapNumbers(x,y);
		

	}

}
