package arrayReferencesS9;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		
		int [] myIntArray = new int [5]; // created an arrar "myIntArray is the reference to it (reference to the object)"
		
		int [] anotherArray = myIntArray; // created another reference pointing to the same myIntArray (reference to the same object as above)
		
		System.out.println(Arrays.toString(myIntArray));
		System.out.println(Arrays.toString(anotherArray));
		
		anotherArray[0] = 1;
		modifyArray(myIntArray);
		
		System.out.println("After changing a value to anotherArray in index 0, myIntArray = " +Arrays.toString(myIntArray) );
		System.out.println("After changing a value to anotherArray in index 0, anotherArray = " +Arrays.toString(anotherArray) );
		
		//reference represent the address of where an object is stored in memory, in this case myIntArray is the object in memory 
		// and anotherArray is not another object, it is just an address that points to the myIntArray object
		// in other words there is only one object(an array with 5 indexes) with 2 references to it (myIntArray) and (anotherArray)

	}
	
	private static void modifyArray(int [] array) {
		array[1] = 2;
	}

}
