package day1.Basics;

import java.util.Iterator;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// factorial of 4
		// 1*2*3*4
		// (1*2)  *3*4
		// (2*3)  *4
        // fact = fact *i
		
		int fact =1;
		for (int i = 1; i <= 4; i++) {
			fact = fact*i;
		}
		System.out.println("Factorial of 4:" +  fact);
		
	}

}
