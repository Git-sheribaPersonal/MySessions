package day1.Basics;

public class LearnString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "Happy SeHleniumH Learning";
		String number = "1";

		System.out.println("Name:" + name);

		// To find the length of the string
		int length = name.length();
		System.out.println("Length of the string:" + length);

		// zero based index concept
		// get me the character at 20
		// input --> position; output --> character
		char charAt = name.charAt(12);
		System.out.println("charAt at 20 position:" + charAt);

		// get me the position of the character
		// input --> character; output --> position
		int indexOf = name.indexOf('S');
		System.out.println(" Index of the character:" + indexOf);
		// Index of the character:-1 for a character which is not at
		// all present in the given string
		// looks for the first occurence of the character

		// I need the last occurence of the character
		int lastIndexOf = name.lastIndexOf('S');
		System.out.println("Last occurence of the character: " + lastIndexOf);

		// Convert String to a character array
		char[] charArray = name.toCharArray();
		for (int i = 0; i < charArray.length; i++) {
			System.out.println("charArray[" +i+ "]:"+ charArray[i]);
		}
		
		// To remove the spaces from front and back of the string
		String trim = name.trim();
		System.out.println("trimmed output:" + name.trim());
		
		// 
		// Concatenate a string
		// split(delimiter) 
		String[] split = name.split(" ");
		System.out.println(" Splited String as words");
		for (int i = 0; i < split.length; i++) {
			System.out.println("split[" +i+ "]:"+ split[i]);
			if(split[i].startsWith("H")) {
				System.out.println(" starst with :" + split[i]);
			}
		}
		
		System.out.println(" Splited String as words based on -");
		String name1 = "Happy-SeleniumS-Learning";
		String[] split1 = name1.split("-");
		for (int i = 0; i < split1.length; i++) {
			System.out.println("split1[" +i+ "]:"+ split1[i]);
		}
		
		// Replace one character with another character
		
		System.out.println(name.replace('S', 'd'));
		
		// String is immutable
		System.out.println(name);
		
		// convert to lower case
		System.out.println("Lower cased string: " + name.toLowerCase());
		System.out.println("Lower cased string: " + name.toUpperCase());
		
		
		// replaces all the characters in the string
		String replace = name.replace('H', 'h');
		System.out.println("Repalced String:" + replace);
		
			
		String str = "a12334   tyz78x";
		
		// replace all non integers 
		// regular expression - RegEx
		// d - digits
		String str2 = str.replaceAll("[\\d]", "");
		System.out.println(str2);
		
		// D- non-digits
		String str3 = str.replaceAll("[\\D]", "");
		System.out.println(str3);
		
		String str4 = "a12334   tyz78x";
		boolean equals = str.equals(str3);
		if(equals) {
			System.out.println("Strings are equal");
		}
		else
			System.out.println("Strings are not equal");

		if(str.equals(str4)) {
			System.out.println("Strings are equal");
		}
		else
			System.out.println("Strings are not equal");
			

	}

}
