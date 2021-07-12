package day1.Basics;

public class LearnForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    // why looping stamnt?
	// To print numbers from 6 to 10
	// Repeat the same task multiple times 
		System.out.println("6");
		System.out.println("7");
		System.out.println("8");
		System.out.println("9");
		System.out.println("10");
	
		// intialization condition iterator
		for (int i = 1; i <= 10; i++) {
			// i=6, check if 6<=10 --> True,(Execute the code) i++ --> i=i+1,i=7
			// i=7, check if 7<=10 --> True,(Execute the code) i++ --> i=i+1,i=8
			// i=8, check if 8<=10 --> True,(Execute the code) i++ --> i=i+1,i=9 
			// i=9, check if 9<=10 --> True,(Execute the code) i++ --> i=i+1,i=10
			// i=10, check if 10<=10 --> True,(Execute the code)i++ -->i=i+1,i=11
			// i=11, check if 11<=10 --> False,(Terminates the loop)
			System.out.println(i);
			
		}
		
		
		
	}

}
