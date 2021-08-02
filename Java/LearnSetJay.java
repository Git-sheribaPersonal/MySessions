package ImplClass;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class LearnSetJay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Set - Interface - Doesnot allow duplicates implementation class : - Hashset :
		 * Doesnot maintain the insertion order(random order) - LinkedHashset :
		 * Maintains the insertion order - Treeset : Sorted output (in ASCII order)
		 * 
		 */
			// Set<String> value = new LinkedHashSet<String>();
			Set<String> value = new TreeSet<String>();
			// Set<String> value = new HashSet<String>();

			// LinkedHashSet - Insertion Order
			// TreeSet - ASCII order sorted
			// HashSet - Random Order

			value.add("IOB");
			value.add("AXIS");
			value.add("HDFC");
			value.add("PNB");
			value.add("SBI");

			System.out.println(value);

			boolean ifAdd1 = value.add("CUB");
			System.out.println("ifAdd1:" + ifAdd1);

			boolean ifAdd = value.add("CUB");
			System.out.println("ifAdd:" + ifAdd);

			// No index concept in set - no get(index) method
			// Normal for loop with iterator(i++) cannot be used
			// for each

			// Set doesnot have get(i) method
			// for loop works on index

			for (String eachString : value) {
				System.out.println(eachString);
			}

			// value.clear();

			// HashSet
			// CUB [0]
			// PNB [1]
			// HDFC
			// SBI
			// IOB
			// AXIS

			// TReeset
			// AXIS [0]
			// CUB [1]
			// HDFC
			// IOB
			// PNB
			// SBI

			// LinkedHashSet
			// IOB [0]
			// AXIS [1]
			// HDFC
			// PNB
			// SBI
			// CUB

			// Set will not allow duplicates
			// I forcefully insert a duplicate value. Will an exception be thrown?

			// copy the set into a list
			List<String> fromSet = new ArrayList<String>(value);

			System.out.println(" Values copied to the list");
			for (int i = 0; i < fromSet.size(); i++) {
				System.out.println(fromSet.get(i));
			}
			
			fromSet.remove("AXIS");
			System.out.println("after removal");
			for (int i = 0; i < fromSet.size(); i++) {
				System.out.println(fromSet.get(i));
			}
			
			value.removeAll(fromSet);	
			System.out.println(value);
		//	value.retainAll(fromSet);
		
		//	do in two mthds:
			// Find intersection of elements in two arrays
			int arr[] = {23,45,67,56,23,45};
			int arr1[] = {20,45,20,23,34,12};
			//Mthds 1 : Use arrays and for loop	
			
			// Mthd 2: use Set or List
			// find the intersection of the arrays ( common elements)
			// step 1 : convert arrays to set/List (HW)
			// step 2 : use retainAll() --> arr.retainAll(arr1)
			// Step 3 : print arr
			
			// Pgm 2 : print the duplicates
			int arr3[] = { 14, 12, 13, 11, 15, 14, 18, 16, 17, 14, 19, 18, 17, 20 };
			
			Set<Integer> duplicateSet = new TreeSet<Integer>();
			for (int i = 0; i < arr3.length; i++) {
				duplicateSet.add(arr3[i]);
				
				
		/*		if(duplicateSet.add(arr3[i])==false) { // duplicate element
					System.out.println(arr3[i]);
				}*/
				
				
			}
			
			
			
			
			
			
			
			

		}

	}


