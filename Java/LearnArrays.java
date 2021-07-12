package day1.Basics;

import java.util.Arrays;

public class LearnArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 10;
		// Need to store many numbers
		// int numberSeq = 10,11,12,13,14; Not an accepted format
// How to declare an array
		// Datastructures

		// arrays - store similar elements of similar datatypes
		// - elements stored as per the index value
		// - zero based index
		// - it is a class/

		// - Objects can be created for array(Not a primitive data type)
		// SINGLE DIMENSIONAL ARRAY

		// Declare
		int numberSeq[];

		byte[] byteArr;
		float[] floatArr;
		char charArr[];
		boolean booleanArr[] = {};

		// assign/initialize
		int[] numberSeq1 = { 12, 221, 10, 133, 14, 105, 16 };
		char[] ch = { 'f', 'j', 'k' };
		// size of array is fixed.

		// What can be done with an array?
		// How many elements?
		// length - property
		int lengthArr = numberSeq1.length;
		System.out.println(" length of numberSeq1:" + lengthArr);
		// return type

		int lengthCH = ch.length;
		// empty array
		int boolLength = booleanArr.length;
		// No exception(error) thrown
		System.out.println(" Length of the empty array:" + boolLength);

		// HOW DO I ACCESS THE ARRAY?
		System.out.println(numberSeq1[2]);
		System.out.println(numberSeq1[4]); // index 4--> 5th element
	//	System.out.println(numberSeq1[5]); // i am choosing 6th element
		 //java.lang.ArrayIndexOutOfBoundsException
		// ArrayIndexOutOfBoundsException (class)
        // Reason : Index 5 out of bounds for length 5 ( actual index 4)
		
		// What do i choose - for? or while?
		//for ( int i = 0; i < numberSeq1.length; i++) {
		for (int i = 0; i <= numberSeq1.length-1; i++) {
			// from 0th index to 4th index
			System.out.println("numberSeq1[" +i+"]:"+numberSeq1[i]);
		//	numberSeq1[]
		}
			// sort the array
			Arrays.sort(numberSeq1);
			System.out.println("Sorted array");
			for (int i = 0; i <= numberSeq1.length-1; i++) {
				System.out.println("numberSeq1[" +i+"]:"+numberSeq1[i]);
			}
				
			// print the sorted the array in reverse order
			System.out.println("print the sorted the array in reverse order");
				for (int i = numberSeq1.length-1 ; i >= 0 ; i--) {
					System.out.println("numberSeq1[" +i+"]:"+numberSeq1[i]);
		}
	}
}
