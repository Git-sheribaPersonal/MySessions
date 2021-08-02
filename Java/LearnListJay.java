package ImplClass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LearnListJay {
	/*
	 * // List:
	 *   	Interface
	 *      Cannot create an object for a List (interface)
	 *      Implementation class: ArrayList, LinkedArrayList
	 *      syntax: 
	 *         List<String> nameList = new ArrayList<String>();
	 *         <> generics
	 *         wrapper class:
	 *             int        Integer
	 *             short      Short
	 *             byte       Byte
	 *             boolean    Boolean
	 *             String     String
	 *             long       Long
	 *             float      Float
	 *             char       Character
	 *    Properties:
	 *    		size is dynamic
	 *    		Insertion order is maintained
	 *          Duplicate values can be stored
	 *   size of array : length    (property)
	 *   size of string : length() (method)                           
	 *         
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Empty List
		List<String> nameList = new ArrayList<String>();
		// add data to the List
		nameList.add("SBI");
		nameList.add("IOB");
		nameList.add("AXIS");
		nameList.add("CUB");
		nameList.add("HDFC");
		nameList.add("ICICI");
		
		// Find the size of the list
	System.out.println("Size of the list:" + nameList.size());
		//   To get an element from the list
	    // Returns the element at the specified position in this list.
	System.out.println("Element:" + nameList.get(2));
	   // Insert an element into a list
	nameList.add("HDFC");
	nameList.add(2, "PNB");
	System.out.println("Element:" + nameList.get(2));	
	
	for (int i = 0; i < nameList.size(); i++) {
		System.out.println(nameList.get(i));
	}
	
	System.out.println(nameList);
	
	
	//   dataType  variable      source
	System.out.println("FOR EACH:");
	for (String eachString : nameList) {
		System.out.println(eachString);
	}
	
	// remove a value from the list
	
	nameList.remove(0);  // using index
	System.out.println(nameList);
	
	// removes the first occurence of the given value
	nameList.remove("HDFC"); // using the value
	System.out.println(nameList);
	
	// sorting a list
	// sorts in ascending order
	Collections.sort(nameList);
	System.out.println(nameList);
	
	// reverse the list
	Collections.reverse(nameList);
	System.out.println(nameList);
	
	
	// Copy the elements from one list to another list
	// open an empty list
	List<String> nameList2 = new ArrayList<String>(nameList);
//	System.out.println(nameList2);
	
	nameList2.remove("ICICI");
	System.out.println(nameList2);
	
	// To retain the matched values
	System.out.println("retained values");
	nameList.retainAll(nameList2);
	System.out.println(nameList);
	
	// Remove matched values data
	// firstList .removeAll(secondList)
	nameList.removeAll(nameList2);
	System.out.println(nameList);
	
	int arr[] = {3,4,5};
	int arr1[] = {4,2,1,4};
	
	List<Integer> intList = new ArrayList<Integer>();
	List<Integer> intList1 = new ArrayList<Integer>();
	for (int j = 0; j < arr.length; j++) {
		intList.add(arr[j]);
	}
	for (int k = 0; k < arr1.length; k++) {
		intList1.add(arr1[k]);
	}
	
	
	System.out.println(intList);
	System.out.println(intList1);
	
	
	// transfer values from an array to a list
	// execute the pgm
	// print the duplicates 
	// remove the duplicates
	
	
	/*
	// remove all the elements from the list
	nameList.clear();
	System.out.println(nameList);        // not throw the exception
	System.out.println(nameList.get(3)); // IndexOutOfBoundsException
	*/
	
	String str = "Rs.6000 items";
	String replaceAll = str.replaceAll("\\D", "");
	System.out.println(replaceAll);
	
		
	}
}


