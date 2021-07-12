// package
package day1.Basics;
// class
public class LearnCar {
// method
	public void audi() {
		// VARIABLES
		// Syntax:
		// dataType variableName = value;
		// PRIMITIVE DATA TYPE
		// Stores whole numbers from -128 to 127
		byte num = 9;
		// Stores whole numbers from -32,768 to 32,767
		short num1 = 129;
		// Stores whole numbers from -2,147,483,648 to 2,147,483,647
		int noOfWheels = 4;
		// Stores whole numbers from -9,223,372,036,854,775,808 to
		// 9,223,372,036,854,775,807
		long numLong = 4589577979L;
		int seatCapacity = 5;
		boolean isSunRoof = true;
		char logo = 'a';
		float fuelCapacity = 15.5f;
		double horsePower = 150.8843392278333839393938383833838;

		// NON PRIMITIVE DATA TYPE
		String brandName = "Audi";

		// To print in my console
		System.out.println("VARIABLES");
		System.out.println("num");
		// + concatenation operator
		System.out.println("Byte:" + num);
		System.out.println(" Brand Name of my car:" + brandName);
		System.out.println(" Logo :      " + logo);
		// jar files -- java archive files( group of classes)

		// To execute my program
		// ctrl+F11
		// RightClick--> Run as --> java Application
		// Menu --> run button
	}

	// main // ctrl + space+enter
	public static void main(String[] args) {
		// STEP 1: How to execute a method
		// STEP 2: Instantiation ( creating an instance of class/create an object)
		// Syntax
		// <clasName objectName = new clasName()-constructor>
		LearnCar carObj = new LearnCar();
		carObj.audi();
	}

//	To execute a class
//	1. main() 
//  2. Object for the class

}
