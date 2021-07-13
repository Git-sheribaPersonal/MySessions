package day1.Basics;

public class MyMobile {

	// Variables

	int cost = 26000;
	String brand = "Samsung";
	char logo = 'S';
	boolean isTouch = true;

	// Methods
	// signature/syntax
	// AccessSpecifier + returnType + methodName + arguments

	// Method - AccessSpecifier
	// 4 types
	// public - project level access ( within all packages)
	// private - Classlevel access
	// protected - within same package alone / if inherited can be used inside other
	// packges
	// package/default - within same package alone

	// CLASS - AccessSpecifier
	// 2 types
	// public
	// package/default

	// RETURN TYPE
	//

	public void sendSMS(int amt) {
		// TODO Auto-generated method stub
		System.out.println(amt);
		System.out.println(" Amount displayed");
	}

	public void makeCalls() {
		System.out.println(" Making calls");
	}

	public void viewGallery() {
		// TODO Auto-generated method stub
		System.out.println(" Beautiful pics seen");
	}

	private void netBank() {
		// TODO Auto-generated method stub
		System.out.println("Net payment done");
	}

	public int getAmount() {
		int txnAmnt = 34957580;
		return txnAmnt;
	}

	public boolean isTouchScreen() {
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyMobile mobObj = new MyMobile();
		
		mobObj.viewGallery();
		mobObj.makeCalls();
		mobObj.netBank();
		
		
		int amount = mobObj.getAmount();
		
		mobObj.sendSMS(amount);
		
		boolean touchScreen = mobObj.isTouchScreen();
		
		
		

	}

}
