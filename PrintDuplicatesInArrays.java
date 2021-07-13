package day1.Basics;

public class PrintDuplicatesInArrays {
	public static void main(String[] args) {
		
		int arr[] = { 14, 12, 13, 11, 15, 14, 18, 16, 17, 14, 19, 18, 17, 20 };

		// int lenArray = arr.length;
		int count;
		// 14, 12, 13, 11, 15, 14, 18, 16, 17, 14, 19, 18, 17, 20
		// picks 14 
		
		// compare with 12, 13, 11, 15, 14, 18, 16, 17, 14, 19, 18, 17, 20
		// i=0, j loop j = i+1 --> 0+1 = 1
		//             j =2   
		//  .
		//  .
		// 
		
		// for (int i = 0; i <= arr.length - 1; i++)
		
		for (int i = 0; i <= arr.length - 1; i++) {  //14
			
			count = 0;
			
			for (int j = i + 1; j <= arr.length - 1; j++) {
				
				if (arr[i] == arr[j]) {
					count++;
				}
			}

			if (count > 0) {
				System.out.println("Duplictaed no is : " + arr[i]);
			}
		}
	}
}
