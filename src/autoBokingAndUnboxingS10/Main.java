package autoBokingAndUnboxingS10;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
	
	public static void main(String[] args ) {
		
		Integer[] wrapperArray = new Integer[5]; // an array, arrayList or linkedlist do not allow primitive types but we can use them with these using the wrapper class
		// a wrapper class wraps a primitive value and autoboxes it into an object, each primitive type has a wrapper class.
		
		wrapperArray[0] = 50;
		wrapperArray[1] = 2;
		System.out.println(Arrays.toString(wrapperArray));
		System.out.println(wrapperArray[0].getClass().getName());
		
		Character [] characterArray = {'a' , 'b' , 'c' , 'd'};
		
		System.out.println(Arrays.toString(characterArray));
		System.out.println(characterArray[0].getClass().getName());
		
		
		
		Integer deprecated = new Integer(15); // deprecated since jdk9
		Integer manualBoxing =  Integer.valueOf(10); // manual boxing
		Integer autoBoxing = 15; // auto boxing
		
		System.out.println(manualBoxing.intValue()); // manual unboxing
		System.out.println(autoBoxing); // auto unboxing
		
		ArrayList<Integer> ourList = getList(1,2,3,4,5); 
		
		System.out.println(ourList); 
		
		
		
		
		
		
		
		
	} 
	
	private static ArrayList<Integer> getList(int... varargs){ // this method receives ints and adds them as Integer objects (autoboxing) to an array list of Integers
		ArrayList <Integer> integerList = new ArrayList<>();
		
		for(int i : varargs) {
		integerList.add(i);
		}
		return integerList;
	}
	
	
	private static Integer getInteger(int i) { // this method receives primitive data int and returns object Integer
		return i;
	}
	
	
	private static int getInt(Integer i) { // this method receives an Integer object and returns a primitive data int 
		return i;
	}
	
	

}
