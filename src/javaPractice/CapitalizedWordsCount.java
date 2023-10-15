package javaPractice;

public class CapitalizedWordsCount {
	
	public static int capitalCount(String s) {
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			if(s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') {
				count++;
			}
//			if(Character.isUpperCase(s.charAt(i))) {
//				count++;
//			}
		}
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Rahul Shetty Academy isMy Best Friends";
		String s1 = "RahulShettyAcademy";
		System.out.println(capitalCount(s));
		System.out.println(capitalCount(s1));
		
	}

}
