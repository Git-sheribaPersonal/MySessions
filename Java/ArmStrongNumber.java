package day1.Basics;

import java.lang.Math;

import org.apache.commons.collections4.bag.SynchronizedSortedBag;

public class ArmStrongNumber {
	// num = 134
	// no of digits : 3
	// 1^3 + 3^3 + 4^3 = 134

	// 1634
	// no of digits : 3
	// 1^4 + 6^4 + 3^4 + 4^4 = 1634

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// number = 134
		// 134 / 10 --> Q = 13, R--> 4, calculate --> 4^3(result)
		// number = Q,
		// 13/10 --> Q = 1, R--> 3, 3^3
		// number = Q, 1/10 --> R--> 0

		// remainder = mod(%) --> divides and gives the remainder
		// quotient = number/10
		// result = remainder^3 + result
		// number = quotient

		/*
		 * (num) 134/10 --> rem --> 4, Quo --> 13 --> res = 4^3 +0 --> num = 13 (num)
		 * 13/10 --> rem --> 3. quo-->1 --> res = 3^3 + (4^3) --> num = 1 (num) 1/10 -->
		 * rem --> 1, quo--> 0 --> res= 1^3 + (3^3 + 4^3) --> num = 0 num = 0
		 */

		int number = 371;
		int quotient, remainder, result = 0;

		 int OriginalNum=0;
		 OriginalNum = number;
		int count = 0;
		while (number > 0) {
			System.out.println(count + " :number before process :" + number);
			remainder = number % 10;
			quotient = number / 10;
			System.out.println(count + " :Result before process :" + result);
			result = (int) Math.pow(remainder, 3) + result;
			// result = 1^3 + 0
			number = quotient;
			count++;
			System.out.println(count + " : remainder :" + remainder);
			System.out.println(count + " :quotient :" + quotient);
			System.out.println(count + " :result :" + result);
			System.out.println(count + " :number after process :" + number);
			System.out.println("*************");
		}

		System.out.println(result);
		System.out.println(number);
		System.out.println(OriginalNum);
		if (result == OriginalNum) {
			// Condition is true, if will be executed
			System.out.println(" Armstrong Number");
		} else
			// Condition is false, if will be executed
			System.out.println(" Not an Armstrong");

		/*
		 * if(result==OriginalNum) { System.out.println(" Armstrong Number"); } else
		 * System.out.println(" Not an Armstrong");
		 */

	}

}
