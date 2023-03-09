package arrayS9;

import java.util.Arrays;
import java.util.Random;

public class UsingArraysMain {

	public static void main(String[] args) {

		int[] firstArray = getRandomArray(10); // creates an array using the method created

		System.out.println(Arrays.toString(firstArray)); // prints the recently created array, not that to print the
															// array
															// Arrays.toString method was called

		Arrays.sort(firstArray); // sort() will sort the array to order from minimum to max value, it has to be
									// called from the Arrays class

		System.out.println(Arrays.toString(firstArray));// prints the sorted array

		int[] secondArray = new int[10]; // an array with 0 in all fields is created since 0 is the default value for
											// the data type the array was initialized (int)
		System.out.println(Arrays.toString(secondArray)); // prints the array
		Arrays.fill(secondArray, 5);// fill() receives 2 parameters, the array to fill and the info to fill it, in
									// this case it will fill the array with only 5

		System.out.println(Arrays.toString(secondArray)); // prints the now filled with all 5 values array

		int[] thirdArray = getRandomArray(10); // initializes an array with the method created
		System.out.println(Arrays.toString(thirdArray)); // prints the third array

		int[] fourthArray = Arrays.copyOf(thirdArray, thirdArray.length); // initializes a fourth array by copying the
																			// third array with the Arrays.copy method,
																			// it takes the array to be copied from and
																			// the length of indexes we want to copy
																			// from it
		System.out.println(Arrays.toString(fourthArray));// prints the fourthArray

		Arrays.sort(fourthArray); // this will sort the fourth array
		System.out.println(Arrays.toString(fourthArray)); // this will print the fourth array, note that the third array
															// does not get affected because even if it is a copy of
															// third array, these 2 are different instances, different
															// objects in the memory

		System.out.println(Arrays.toString(thirdArray)); // this prints the third array, note that it does not get
															// affected by the sort() method applied on fourthArray

		int[] smallerArray = Arrays.copyOf(thirdArray, 5); // this will copy the third array into the smaller array,
															// since the length we pass is less that the original it
															// will copy the first 5 indexes
		System.out.println(Arrays.toString(smallerArray)); // this prints the smaller array note that only 5 indexes
															// were copied from the third array

		int[] largerArray = Arrays.copyOf(thirdArray, thirdArray.length + 2); // this copies the third array but has
																				// more indexes than the one its being
																				// copied from, so the remaining or
																				// leftover indexes will be set to the
																				// data default value, in this case 0
		System.out.println(Arrays.toString(largerArray));// this prints the larger array, note the additional 0 due to
															// the larger array's length in the end

		// BINARY SEARCH -> the binary search splits the information in parts and
		// searches trough it, it is faster than going one by one (linear or sequential
		// search)

		String[] sArray = { "Jairo", "Leslie", "Vivianne", "Romina", "Jackie", "Bella" }; // created a String array with
																							// 5 strings

		Arrays.sort(sArray); // sort the array as Binary search only works with sorted arrays

		System.out.println(Arrays.toString(sArray));// prints the array sorted

		if (Arrays.binarySearch(sArray, "Leslie") >= 0) { // this is the binary search, a method on the Arrays class
															// that takes the array to search on and the value we are
															// searching for, in this case we are adding a conditional
															// to print something if the value was found
			System.out.println("Found leslie on the list");

			int[] s1 = { 1, 2, 3, 4, 5 }; // created an array with numbers 1-5
			int[] s2 = { 1, 2, 3, 4, 5 }; // created another array same as above

			if (Arrays.equals(s1, s2)) { // Arrays.equals() helps you to compare 2 arrays and returns true if they are
											// equal, for them to be equal they must have same length, values and values
											// have to be in the same indexes
				System.out.println("These 2 arrays are equal");
			}else {
				System.out.println("These 2 arrays are not equal");
			}
		}
	}

	private static int[] getRandomArray(int arrayLength) { // we are creating a method that fills an array with random
															// numbers, it receives the length of the array to be
															// created
															// as a parameter

		int[] randomArray = new int[arrayLength]; // in here we creating an instance of an array and passing the
													// parameter received in the method as its length

		Random random = new Random(); // this instance of the class Random will help us to generate random numbers

		for (int i = 0; i < arrayLength; i++) { // we create a for loop that starts in 0 and traverse the parameter
												// received which is also the length of the array we are creating

			randomArray[i] = random.nextInt(100); // random.nextInt() is a method from the Random class that will help
													// us
													// to create the random number, it receives a max limit int, which
													// means
													// it will not generate any number bigger than the one it receives,
													// if
													// you dont pass any int to the method you set no limits and it
													// generates any number
		}

		return randomArray; // the method returns the created array

	}

}
