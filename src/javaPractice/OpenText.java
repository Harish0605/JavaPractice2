package javaPractice;

public class OpenText {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "InterviewAtOpentext";
		String temp = "";
		temp = temp + s.charAt(0);

		for (int i = 1; i < s.length(); i++) {
			if (Character.isLowerCase(s.charAt(i))) {
				temp = temp + s.charAt(i);
			} else {
				temp = temp + " " + s.charAt(i);
			}
		}

		System.out.println(temp);

	}

}
