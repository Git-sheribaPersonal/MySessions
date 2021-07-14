package day1.Basics;
// terminate the loop/conditional statement

// Problem Statement: 
// stop the execution when you see 5

public class LearnBreak {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(" start of for loop");

		for (int j = 0; j < 5; j++) {

			for (int i = 0; i <= 10; i++) {
				if (i == 5) {
					// terminate the loop
					break;
				}
				System.out.println(" Value of i :" + i);
			}
			
			System.out.println(" In the first for loop");

		}

		System.out.println(" End of for loop");
	}

}
