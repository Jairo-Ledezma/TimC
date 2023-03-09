package arrayS9;

import java.util.Arrays;

public class MainArrayExplanation {

	public static void main(String[] args) {

		// creation of array
		int[] myIntArray = new int[10];
		myIntArray[0] = 10; // assign value 10 to index 0 of the array
		myIntArray[1] = 15;
		myIntArray[5] = 50;

		double[] myDoubleArray = new double[10]; // arrays can hold different type of data and objects as well
		myDoubleArray[0] = 5.5;
		myDoubleArray[1] = 10.7;
		myDoubleArray[2] = 30.12;

		// creation of array with array initializer
		int[] intArray = new int[] { 1, 2, 3, 4, 5, 6, 7, 8 }; // if we know the values of the array beforehand we can
																// initialize it like this, do note that the array
																// length does not have to be specify in the square
																// brackets

		int[] numbersArray = { 1, 2, 3, 4, 5 }; // the array initializer as an anonymous array
		String[] names = { "Jairo", "Leslie", "Vivianne", "Romina" }; // the array initializer as an anonymous array
																		// with strings

		System.out.println("first value in numbersArray : " + numbersArray[0]);
		int numbersArrayLength = numbersArray.length;
		System.out.println("the length of numbers array is : " + numbersArrayLength);
		System.out.println("Last : " + numbersArray[numbersArrayLength - 1]);// System.out.println("Last : " +
																				// numbersArray[numbersArrayLength]);
																				// this will throw an index out of
																				// bounds exception because
																				// numbersArrayLength's value is 10 and
																				// the total index in the array are 9,
																				// since they start from 0 so we can
																				// simply add minus 1 to correct that

		int[] newArray; // this declares an array not initialized
		newArray = new int[] { 5, 4, 3, 2, 1 };// newArray{5,4,3,2,1} // this can't be done as the anonymous
												// initializers can't be used to redefine values only to initialize the
												// array
		
		//to traverse the array we can loop trough it 
		for (int i = 0; i<newArray.length;i++) {
			System.out.println(newArray[i]);
		}
		System.out.println("");
		
		//filling an array with a loop
		int[] anArray = new int[5];
		
		for (int i=0; i<anArray.length; i++) {
			anArray[i]=i+1;
			System.out.println(anArray[i]);
		}
		
		System.out.println("");
		 // for each loop or enhanced for loop
		for (int element : anArray) {
			System.out.println(element + " ");
		}
		
		System.out.println("");
		
		System.out.println(anArray); // this will print the reference to the object array and not the actual array 
		
		System.out.println(Arrays.toString(anArray));

	}

}
