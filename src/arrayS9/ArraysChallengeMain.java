package arrayS9;

import java.util.Arrays;
import java.util.Random;

public class ArraysChallengeMain {

	public static void main(String[] args) {
		
		
		System.out.println(Arrays.toString(sortArray(getRandomArray(10))));
		
		
		

	}
	
	private static int [] getRandomArray(int len) {
		Random random = new Random();
		int[] ranArray= new int[len];
		
		for (int i = 0; i<len; i++) {
			ranArray[i] = random.nextInt(100);
		}
		
		return ranArray;
		
	}
	
	
	private static int[] sortArray(int[] array) {
		int temp; // this will hold a temp value for the index in i
		boolean flag = true; // this will control the loop
		while (flag) { // while true do this
			flag = false; // set the flag to false so eventually the loop can exit
			for (int i = 0; i < array.length - 1; i++) { // start a for loop that goes from 0 to lenght -1
				if (array[i] < array[i + 1]) { // condition to check if array in index 1 is less than array in index 2
					temp = array[i]; // if it is temp will store array [i]
					array[i] = array[i + 1]; // array i gets swapped with array [i+1]
					array[i + 1] = temp; // array i+1 gets swapped with temp that was holding the value of array [i]
					flag = true; // the flag changes to true since to make sure the loop continues
				}
			}
		}

		return array;

	}

}
