package day1.Basics;

public class FibanocciSeries {
    // 0,1,1,2,3,5,8,13,21,34
	// Print first 10 fibanooci numbers
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // first two elemnets needed
		// add the two elements
		// x+y =z
		// first num  second num result
		// 0,            1,          1
		// 1(sec num)    1 (res)     2
		// 1 (sec num)   2(res)      3
		
		int firstNum = 0, secNum = 1, result=0;
		System.out.println(firstNum);
		System.out.println(secNum);
		for (int i = 0; i <= 7; i++) {
			result = firstNum+secNum;
			firstNum=secNum;
			secNum = result;
			System.out.println(result);
		}
	}

	
	

}
