package day1.Basics;

public class LearnEquals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// using literals
		// shares the same memory location ( reference is same)
		String s1 = "TAT";
		String s2 = "TAT";
		String s7 = "FOR";
		
		String s3 = "TIT";
		String s4 = "TIT";
		
		// using objects
		// Doesnot share the same memory location
		// ( reference is not the same)
		 String s5 = new String("TAT"); 
	     String s6 = new String("TAT");
	     
	     // ==   --> Evaluates the memory location. 
	     //      --> doesnot read the content
	     
	     // equals()
	     
	// Literals with ==     
	     if(s1==s2) {
	    	 System.out.println("s1==s2");
	     }

	     if(s2==s7) {
	    	 System.out.println("s2==s7");
	     }
	     else
	    	 System.out.println("S2 not equal to s7");
	     
	     
	     if(s5==s6) {
	    	 System.out.println("s1==s2");
	     }
	     
	 	// Literals with equals()   
	    // equals   --> Evaluates the value memory  
	    //          --> reads the content
	     
	String str1 = new String("Selenium");
	String str2 = new String("Selenium");    
		// str1 , str2 - memory location is not the same
	
	if(str1==str2) {  // --> false
		
	}
	
	if(str1.equals(str2)) {   // --> true
		
	}
	}

}
