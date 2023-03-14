package arrayListsAndLinkedListsS10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MoreListExaplanation {

	public static void main(String[] args) {
		String[] items = { "Apples", "Bananas", "Milk", "Eggs" }; // an array of Strings is created

		List<String> list = List.of(items); // it is passed to a list which is inmutable which means cant be modified

		System.out.println(list); // prints the list

		ArrayList<String> groceries = new ArrayList<>(list); // an array list is created and the list is passed to it

		groceries.add("yoghurt"); // now we can add strings to it

		System.out.println(groceries); // printing the arraylist

		// we can also pass a list to an arrayList at the time we instanciate it as
		// follows

		ArrayList<String> newList = new ArrayList<>(List.of("Pickles", "Mustard", "Cheese"));

		newList.add("Ketchup");

		System.out.println(newList);

		// we can also add entire lists or ArrayLists to another ArrayList using the
		// method addAll() as follows:

		groceries.addAll(newList);
		System.out.println(groceries);

		System.out.println("Third item is : " + groceries.get(2)); // this is how we get elements on an array list, as
																	// opposed to a regular array we use the get()
																	// method to access them and we pass the index we
																	// want to get as the parameter

		// searching for an item in the list
		// 1.- contains method() , you can pass the String literal or the reference to
		// it it returns true or false

		String searchItem = "Milk";

		if (groceries.contains(searchItem)) {
			System.out.println("Groceries array list does contain " + searchItem);
		} else {
			System.out.println("Groceries array list does not contain " + searchItem);
		}

		// 2.- indexOf() and lastIndexOf() , these methods return the index number of
		// the value we pass as the parameter

		groceries.add("Milk"); // added the second milk to show last index of method

		System.out.println(groceries.indexOf("Milk")); // returns the number of the first index of milk, in this case 2
		System.out.println(groceries.lastIndexOf("Milk")); // returns the value of the last index of milk, in this case
															// 9

		// removing elements of the list
		// 1.-we can remove them by index (you need to know the index of the item to be
		// removed)
		// 2.-we can removed by value
		// 3.-we can remove all occurrences of a value
		// 4.-we can remove several values at once
		// 5.-we can remove items by retaining others
		// 6.- we can remove all the elements

		System.out.println(groceries); // printing just to see the whole list

		groceries.remove(1);// this will remove the Bananas (1)

		System.out.println(groceries); // printing to confirm bananas are removed

		groceries.remove("Milk"); // in this case index 1 is going to be removed since even though 2 indexes
									// contain the String "Milk" the method will remove the first occurrence it runs
									// into (2)

		System.out.println(groceries); // printing to confirm both milks were removed

		groceries.add("Milk"); // adding milk to show the remove all method

		groceries.add("Milk");// adding milk to show the remove all method

		System.out.println(groceries); // printing the entire list to show the newly added 2 milk strings to it

		groceries.removeAll(Collections.singleton("Milk")); // this will remove all occurrences of the value passed to
															// it (3)

		System.out.println(groceries); // printing to validate all Milk occurrences are removed

		groceries.removeAll(List.of("Apples", "Eggs")); // this will remove all values and occurrences passed to it, to
														// do so you call
														// the static method List.of you create a list of the items to
														// be removed which is passed to the removeAll() method (4)

		System.out.println(groceries); // printing to confirm the apples and eggs were in fact removed

		groceries.retainAll(List.of("yoghurt", "Pickles", "Mustard", "Cheese")); // this will remove Ketchup (5)

		System.out.println(groceries); // printing to confirm ketchup was removed;

		groceries.clear(); // this will delete every element in the arrayList (6)

		System.out.println(groceries); // printing to make sure the ArrayList is empty

		System.out.println("is ArrayList called groceries empty ? : " + groceries.isEmpty()); // is empty method will
																								// return true if it is
																								// or false if it is not

		groceries.add("Apples"); // adding apples to show what comes up calling isEmpty() when the arraylist is
									// not empty

		System.out.println(groceries); // printing to show the apples on the array list

		System.out.println("is ArrayList called groceries empty ? : " + groceries.isEmpty()); // is empty method will
																								// return true if it is
																								// or false if it is not

		groceries.clear(); // removing all elements

		// adding multiple indexes with values
		// 1.- we can add using List.of method
		// 2.- we can add using Arrays.asList method

		groceries.addAll(List.of("apples", "milk", "mustard")); // Similar to remove all (but it does the oposite)
																// addAll() will add a list that is passed to it to the
																// array, method List.of() needs to be passed to
																// addAll()

		groceries.addAll(Arrays.asList("eggs", "pickles", "mustard", "ham")); // same add all method but this time we
																				// use Arrays.asList() static method to
																				// pass the values

		System.out.println(groceries);

		// Sorting elements
		// 1.-we can sort the elements by calling the sort() method which receives a
		// type
		// called Comparator that allows us to compare objects and a static method
		// called naturalOrder() (1)
		// 2.- we can also sort the elements backwards with the static method
		// reverseOrder() from the Comparator class

		groceries.sort(Comparator.naturalOrder()); // this will sort the order, it does so by comparing the first letter
													// and sorting it from A -Z and numbers -n to n in case 2 elements
													// start the same it moves to the second letter (1)

		System.out.println(groceries);

		groceries.sort(Comparator.reverseOrder()); // this will sort the order in reverse, it does so by comparing the
													// first letter and sorting it from Z to A and numbers from n to -n

		System.out.println("this is an ArrayList "+ groceries  );

		// we can also create arrays from array lists

		String[] groceryArray = groceries.toArray(new String[groceries.size()]); // in here we are creating an array the
																					// same size as our groceries
																					// ArrayList and we are transforming
																					// it to a regular string array with
																					// the ArrayList(name) . toArray()
		System.out.println("This is a regular Array " + Arrays.toString(groceryArray)); // as we recall a regular Array cant be printed, if we do so
															// we get the reference to the address in memory, so we call
															// Arrays.toString method and pass the regular String array
															// to it
		
		
	

	}
	
	
	
}
