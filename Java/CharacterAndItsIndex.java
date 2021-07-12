package day1.Basics;

public class CharacterAndItsIndex {
	/*
	 * 
	 * Step 1. Initialse a string using literals String str =
	 * "Every cloud has a silver lining";
	 * 
	 * Step 2: Print only if the character is 'i' Convert to char array Read each
	 * character in the char array - for loop for(){ if(chArr[i] =='i') print
	 * chArr[i]
	 * 
	 * }
	 * 
	 * Step 3: Print the index of these characters
	 */
	public static void main(String[] args) {
		String str = "Every cloud has a silver lining";
		int count =0;
		char[] ch = str.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] == 'i') {
				System.out.println(ch[i]);
				System.out.println("Index :" + i);
				count = count+1;
			
			}
			
		}
		System.out.println("count:" + count);
	}
}
