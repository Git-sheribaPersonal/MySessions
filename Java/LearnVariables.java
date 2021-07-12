package day1.Basics;

import java.util.Iterator;

// Instance variable (Global)
// Local Variable
// Scope(life) of this variable 
public class LearnVariables {

	// Instance Variable
	// Inside the class but outside all the methods
	String brand = "CAR";
	

	public void localVariable() {
		// Local Variable - inside the method
		
		int seatCapacity = 5;
		boolean isSunRoof = true;
		char logo = 'a';
		float fuelCapacity = 15.5f;

		System.out.println("localVariable");
		System.out.println("isSunRoof:" + isSunRoof);
		System.out.println(" Instance variable brand:" + brand);
	}

	public void callingMethod() {
		int seatCapacity = 0;
		System.out.println(seatCapacity);
		// calling a instance variable
		System.out.println(" Instance variable brand:" + brand);
	}

	public static void main(String[] args) {
		// syntax:
		// <className  objectName  =  new classname()>
		LearnVariables obj = new LearnVariables();
		
		obj.localVariable();
		obj.callingMethod();
		// callng a instance variable
		System.out.println(obj.brand);
	}

}
