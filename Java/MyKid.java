package day1.Basics;

public class MyKid {
	
	int i =12;
	

	public static void main(String[] args) {
		MyMobile obj = new MyMobile();
		
		obj.makeCalls();
		obj.sendSMS(200);
		obj.viewGallery();
		// private mthd. cannot be accessed by any class
		// obj.netBank();
		

	}
 
}
