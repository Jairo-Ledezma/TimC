package arrayListsAndLinkedListsS10;

import java.util.Arrays;
import java.util.Comparator;


public class ArraysAndArraysLists {

	public static void main(String[] args) {

		// we have to keep in mind that when we create an arrayList from an array, some
		// list methods are there such as sort method, however, since it comes from an
		// array some methods will compile fine but at runtime will fail, for example
		// adding an element, since array's indexes are set and cant be modified

		String[] originalArray = { "First", "Second", "Third" }; // created an array 

		var originalList = Arrays.asList(originalArray); // showing the array as list, do note the var name here, it allows java to imply the type of data without having to declare it 

		originalList.set(0, "one"); // since we are changing the value on the list side to an index that does exist in the array it compiles and runs 

		System.out.println("List : " + originalList); // prints the list with the modified value
		System.out.println("Array : " + Arrays.toString(originalArray)); // prints the original Array with the modified value

		originalList.sort(Comparator.naturalOrder()); // in here we are sorting the list with comparator.naturalOrder, this will also modify the original array 

		System.out.println("Array : " + Arrays.toString(originalArray)); // printing the original array to show it sorted 

		 originalList.add("Fourth"); // this compiles fine but at run time it will fail since the original array only has 3 indexes (0,1,2) 
		 originalList.remove(0); // this compiles fine but at runtime will fail because arrays are immutable, and we can't remove the values on them

		// System.out.println( "List : " + originalList);
		// System.out.println("Array : " +Arrays.toString(originalArray));

	}

}
