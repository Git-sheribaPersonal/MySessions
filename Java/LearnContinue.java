package day1.Basics;

public class LearnContinue {
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(" start of for loop");

		for (int i = 0; i <= 10; i++) {
			if (i == 5) {
				// skips the execution based on the condition
				continue;
			}
			System.out.println(" Value of i :" + i);
		}

		System.out.println(" In the first for loop");

	}

}
