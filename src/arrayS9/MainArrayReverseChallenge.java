package arrayS9;

import java.util.Arrays;

public class MainArrayReverseChallenge {

	public static void main(String[] args) {
		
		int [] array = {1,2,3,4,5,6};
		System.out.println(Arrays.toString(reverse(array)));
		System.out.println(Arrays.toString(reverseCopy(array)));
		
		
	}
	
	private static int[] reverse(int[] array) {
		int maxIndex = array.length-1;
		int halfIndex = array.length/2;
		for (int i = 0; i< halfIndex; i++) {
			int temp = array[i];
			array[i]=array[maxIndex-i];
			array[maxIndex-i]=temp;
		}
		
		
		return array;
	}
	
	private static int[]reverseCopy(int []array){
		int [] returnArray = Arrays.copyOf(array, array.length);
		
		for (int i =array.length-1 ; i==0; i--) {
			int counter =0;
			returnArray[counter] = array[i];
			counter++;
		}
		
		return returnArray;
	}

}
