package javaPractice;

public class StringToInteger {

	public static void main(String[] args) {
		String[] arr = {"14","27","36","63"};
		for(int i=0;i<arr.length;i++) {
			int num = Integer.parseInt(arr[i]);
			if(num%2==0) {
				System.out.println(num);
			}
		}

	}

}
