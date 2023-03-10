package arrayListsAndLinkedListsS10;

import java.util.ArrayList;
import java.util.Arrays;

record GroceryItem (String name, String type , int count ) {
	
	public GroceryItem(String name) {
		this(name, "DAIRY" , 1);
	}
	
	@Override
	public String toString() {
		return String.format("%d %s in %S", count , name.toUpperCase() , type);
		
	}
	
}

public class ArrayListExplanationMain {

	public static void main(String[] args) {
		
		GroceryItem [] groceryArray = new GroceryItem [3];
		
		groceryArray[0] = new GroceryItem("milk");
		groceryArray[1] = new GroceryItem("Apples" , "PRODUCE" , 6);
		groceryArray[2] = new GroceryItem("Oranges" , "PRODUCE" , 5);
		
		System.out.println(Arrays.toString(groceryArray));
		
		
		ArrayList  <GroceryItem> objectList = new ArrayList <> ();  //nameoflist.add(parameters) will add an element to the end of the list 
		objectList.add(new GroceryItem("butter"));
		objectList.add(new GroceryItem("milk"));
		objectList.add(new GroceryItem("oranges" , "PRODUCE" , 5));
		objectList.add(0,new GroceryItem ("Apples" , "PRODUCE" , 6)); // we can also pass an index as the first argument to specify where in the list do we want the item to be added 
		objectList.set(1, new GroceryItem ("Cucumber","PRODUCE" , 5)); // set method will remove the iten in that index and replace it with the one thats passed on, in this case butter is removed and cucumbers are added 
		objectList.remove(2); // remove method will help to remove the object or item in the index passed on as parameter in this case it removes milk
		System.out.println(objectList);
		

	}

}
