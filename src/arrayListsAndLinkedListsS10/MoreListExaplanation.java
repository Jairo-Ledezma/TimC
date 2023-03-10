package arrayListsAndLinkedListsS10;

import java.util.ArrayList;
import java.util.List;

public class MoreListExaplanation {
	
	public static void main(String [] args) {
		String [] items = {"Apples" , "Bananas" , "Milk" , "Eggs"}; // an array of Strings is created 
		
		List <String> list = List.of(items); // it is passed to a list which is inmutable which means cant be modified
		
		System.out.println(list); // prints the list 
		
		
		ArrayList<String> groceries = new ArrayList<>(list); // an array list is created and the list is passed to it 
		
		groceries.add("yoghurt"); // now we can add strings to it 
		
		System.out.println(groceries); // printing the arraylist 
		
		// we can also pass a list to an arrayList at the time we instanciate it as follows 
		
		ArrayList< String> newList = new ArrayList <> (List.of("Pickles" , "Mustard" , "Cheese"));
		
		newList.add("Ketchup");
		
		System.out.println(newList);
		
		// we can also add entire lists or ArrayLists to another ArrayList using the method addAll() as follows: 
		
		groceries.addAll(newList);
		System.out.println(groceries);
		
	}

}
