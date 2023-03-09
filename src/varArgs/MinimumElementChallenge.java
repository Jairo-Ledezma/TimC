package varArgs;

import java.util.Arrays;
import java.util.Scanner;

public class MinimumElementChallenge {

	public static void main(String[] args) {
		//System.out.println(minValue(readIntegers(1,2,3,4,85,50,6,45,25,14,154,245,565)));
		
		int [] userInput = readNumbers();
		System.out.println("minimun number is :" + minValue(userInput));
		
		
		
		
	}
	
	private static int[] readIntegers(int...numbers) {
		int [] intToArr = numbers;
		for (int i=0; i<numbers.length; i++) {
			
			intToArr[i]=numbers[i];
		}
		
		return intToArr;
	}

	private static int minValue(int[] array) {
		int minVal = array[0];

		for (int i = 0; i < array.length; i++) {
			if (array[i] <= minVal) {
				minVal = array[i];

			}
		}

		return minVal;
	}
	
	private static int[] readNumbers() {
		Scanner s = new Scanner(System.in);

		System.out.println("Please enter a list of numbers separated by a comma ");
		String input = s.nextLine();
		String[] splits = input.split(",");
		int[] values = new int[splits.length];
		
		for (int i = 0; i<splits.length; i++) {
			values[i] = Integer.parseInt(splits[i].trim());
		}

		return values;

	}

}
// test