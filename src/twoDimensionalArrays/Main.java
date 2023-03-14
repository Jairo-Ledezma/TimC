package twoDimensionalArrays;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {

		int[][] array2 = new int[4][4]; // this initializes an array with four elements (indexes) in which each of those
										// 4 spaces contains an array with 4 indexes as well

		System.out.println(Arrays.toString(array2)); //this will print the array 
		System.out.println("array2 length : " + array2.length); // shows the lenght of the array 

		for (int[] outer : array2) {
			System.out.println(Arrays.toString(outer)); // the for loop traverses the arrays and prints all of them due to the arrays.tostring method
		}

		for (int i = 0; i < array2.length; i++) { // nested for loop to fill the bidimensional arrays
			// int[] innerArray = array2[i];
			var innerArray = array2[i]; // this locates the arrays one by one the value of the variable changes on each
										// loop since it says array2[i] and the value i changes on each loop
			for (int j = 0; j < innerArray.length; j++) { // nested for loop to go trough the length of the inner array,
															// as mentioned above the value of inner array changes, on
															// each loop it accesses the next inner array
				// System.out.println(array2[i][j] + "");
				array2[i][j] = (i * 10) + (j + 1); // this will fill the inner arrays indexes with numbers,
			}
			// System.out.println();
		}
		
		for(var outer : array2) { // for each loop to traverse and print the bi dimensional array 
			for(var inner : outer) {
				System.out.print(inner + " ");
			}
			System.out.println();
		}
		
		System.out.println(Arrays.deepToString(array2)); // this method Arrays.deepToString () receives a bi dimensional array and prints it without the need to manually traverse it 
		
		array2[1] = new int[] {10,20,30};
		System.out.println(Arrays.deepToString(array2)); 
		
	}

}
