package day1.Basics;
//odd nums from 1 to 20
	// for()
	// if(check if the num is odd)
public class PrintOddNumbersContinue {
    
	public void mthd1() {
		// print the odd numbers when ever an odd number occurs
		int num = 30;
		for (int i = 0; i <= num; i++) {
			if(i%2 != 0) {
				System.out.println(i + " is an odd number");
			}
		}
	}
	public void mthd2() {
		// skip the even numbers when ever an even number occurs
		int num = 30;
		for (int i = 0; i <= num; i++) {
			if(i%2 == 0) {
				continue;
			}
			System.out.println(i + " is an odd number");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrintOddNumbersContinue obj = new PrintOddNumbersContinue();
		obj.mthd1();
		System.out.println("********************");
		obj.mthd2();
	}
}
