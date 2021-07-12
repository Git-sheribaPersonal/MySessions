package day1.Basics;

public class PrintReverseString {

	public static void main(String[] args) {
		String str = "Every cloud has a silver lining";
		char[] ch = str.toCharArray();
		
		for (int i = ch.length-1; i >=0 ; i--) {
			System.out.println(ch[i]);
		}

	}

}
