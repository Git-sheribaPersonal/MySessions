package day1.Basics;

import java.util.Arrays;

public class MissingNumbersinArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	// it is sequence of number
	// only one number is missing
	// {898,43,68,98} -- this logic will not work for this data
		
	//	int[] arr = {0,1,2,3,4,6,7,8};
		
		int[] arr1 = {1,2,4,0,6,7,8,3};
		int[] arr = {1,2,4,6,7,8,3};
		
		// arr[1] --> 2
		// arr[5] --> 7
		
		//sort the array --> {0,1,2,3,4,6,7,8};
		Arrays.sort(arr);
		// element- arr[i] index(i)
		// 0        		0
		// 1        		1
		// 2        		2
		// 3        		3
		// 4        		4
		// 6        		5
		// 7        		6
	
		// for loop
		for (int i = 0; i < arr.length; i++) {
			//if(!(arr[i]==i)) {
			
			// i=0; arr[0]--> 0
			// i=1; arr[1]--> 1
			
			System.out.println(arr[i]);
			System.out.println(i);
			
				if(arr[i] != i) {
					System.out.println(" Mising value is :" + i);
					break;
			}
		}
	}
}
