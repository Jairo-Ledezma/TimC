package arrayListsAndLinkedListsS10;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListExplanation {

	public static void main(String[] args) {
		// DECLARING A LINKED LIST

		// LinkedList <String> placesToVisit = new LinkedList<>(); this is how you
		// normally declare it

		var placesToVisit = new LinkedList<String>(); // this is how you can also declare it using the var, note that in
														// this case you need to add the type on the <> signs to help
														// the var infer the type of data it will receive

		// ADDING ELEMENTS TO A LINKED LIST

		placesToVisit.add("Sidney");// this adds the element to the end of the list, same as with an arrayList
		placesToVisit.add(0, "Canberra"); // this is the same method, however it is overloaded so that it also takes the
											// index you want to add the element to
		System.out.println(placesToVisit); // this prints the whole list
		placesToVisit.addFirst("Usa"); // addFirst() will add the element to the first index of the list
		placesToVisit.addLast("England");// addLast() will add the element to the last index of the list
		System.out.println(placesToVisit);
		// Queue methods
		placesToVisit.offer("India"); // offer() will add the element passed to it to the last index of the list
		placesToVisit.offerLast("China"); // offerLast() will also add the element to the last index of the list
		placesToVisit.offerFirst("England"); // offerFirst will add the element to the first index of the list
		// stack methods
		placesToVisit.push("Disneyland"); // will add the element to the first index of the list;
		System.out.println(placesToVisit);

		// REMOVING ELEMENTS FROM A LINKED LIST

		placesToVisit.remove(4); // remove() will remove the element in the index you pass to it
		placesToVisit.remove("China"); // remove() can also remove the element you pass to it
		System.out.println(placesToVisit);

		System.out.println("-".repeat(100));
		System.out.println(placesToVisit); // prints the list
		String s1 = placesToVisit.remove(); // remove() with no arguments passed to it, will remove the first element on
											// the list, but it also returns it, in this case we delete disneyland and
											// assign it to the string s1 at the same time

		System.out.println(s1 + " was removed"); // prints the value that has been removed, not that this element no
													// longer exists on the list, but the method remove() removed it and
													// assigned it to the s1 variable, note that it can also be used
													// without the need to assign it to a variable
		System.out.println("-".repeat(100));

		System.out.println("-".repeat(100));
		System.out.println(placesToVisit); // prints the list
		String s2 = placesToVisit.removeFirst(); // removeFirst() with no arguments passed to it, will remove the first
													// element on
		// the list, but it also returns it, in this case we delete England and
		// assign it to the string variable s2 at the same time, note that it can also
		// be used without the need to assign it to a variable

		System.out.println(s2 + " was removed"); // prints the value that has been removed, note that this element no
													// longer exists on the list, but the method removeFirst() removed
													// it and
													// assigned it to the s2 variable
		System.out.println("-".repeat(100));

		System.out.println("-".repeat(100));
		System.out.println(placesToVisit); // prints the list
		String s3 = placesToVisit.removeLast(); // removeLast() with no arguments passed to it, will remove the last
												// element on
		// the list, but it also returns it, in this case we delete India and
		// assign it to the string variable s3 at the same time, note that it can also
		// be used without the need to assign it to a variable

		System.out.println(s3 + " was removed"); // prints the value that has been removed, note that this element no
													// longer exists on the list, but the method removeLast() removed it
													// and
													// assigned it to the s3 variable
		System.out.println("-".repeat(100));

		System.out.println("-".repeat(100));
		System.out.println(placesToVisit);
		String s4 = placesToVisit.poll(); // poll() will remove the first element, note that it can also be assigned to
											// a variable
		System.out.println(s4 + " was removed");
		System.out.println(placesToVisit);
		System.out.println("-".repeat(100));

		System.out.println("-".repeat(100));
		System.out.println(placesToVisit);
		String s5 = placesToVisit.pollFirst(); // pollFirst() will remove the first element, note that it can also be
												// assigned to a variable
		System.out.println(s5 + " was removed");
		System.out.println(placesToVisit);
		System.out.println("-".repeat(100));

		System.out.println("-".repeat(100));
		System.out.println(placesToVisit);
		String s6 = placesToVisit.pollFirst(); // pollLast() will remove the Last element, note that it can also be
												// assigned to a variable
		System.out.println(s6 + " was removed");
		System.out.println(placesToVisit);
		System.out.println("-".repeat(100));

		// adding some elements to show more examlpes here
		placesToVisit.push("Disneyland"); // pushes the element to index 0
		placesToVisit.push("Universal Studios");// pushes the element to index 0
		placesToVisit.push("In&Out");// pushes the element to index 0
		System.out.println(placesToVisit);// prints list, note that since push was used in all 3 Disneyland is now the
											// last index, since push always pushes the element to index 1, other
											// elements move forward 1 index

		System.out.println("-".repeat(100));
		String s7 = placesToVisit.pop(); // pop() will remove the first element on the list
		System.out.println(s7 + " was removed");
		System.out.println(placesToVisit);
		System.out.println("-".repeat(100));

		// RETREIVING ELEMENTS FROM A LINKED LIST

		System.out.println("element at index 1 is : " + placesToVisit.get(1));// get() will return the element in that
																				// index
		System.out.println("element at index 0 is : " + placesToVisit.getFirst());// getFirst() will get the first
																					// element in the list
		System.out.println("element at last index is : " + placesToVisit.getLast());
		; // getLast() will get the last element in the list

		// RETREIVING THE INDEX NUMBER OF AN ELEMENT IN A LINKED LIST
		placesToVisit.add("zapopan");
		placesToVisit.add("Jalisco");
		placesToVisit.add("Oaxaca");
		placesToVisit.add("Monterrey");
		placesToVisit.add("Oaxaca");
		System.out.println(placesToVisit);
		System.out.println("Index of Oaxaca is " + placesToVisit.indexOf("Oaxaca")); // indexOf() will search in the
																						// list for the first index of
																						// the value passed to it and
																						// return the index number
		System.out.println("Last index of oaxaca is " + placesToVisit.lastIndexOf("Oaxaca")); // lastIndexOf() will
																								// search in the list
																								// for the value passed
																								// to it and return the
																								// last index of it, if
																								// there are 2 equals it
																								// will return the last
																								// one

		// queue retrieval methods
		System.out.println("Element from element() " + placesToVisit.element()); // returns the first element in the
																					// list

		// Stack retrieval methods
		System.out.println("Element from peek() " + placesToVisit.peek()); // returns the first element
		System.out.println("Element from peekFirst() " + placesToVisit.peekFirst()); // returns the first element
		System.out.println("Element from peekLast() " + placesToVisit.peekLast()); // returns the last element

		// ITERATING AN ARRAY

		// with for loop
		for (int i = 1; i < placesToVisit.size(); i++) {

			System.out.println("Traveling from -> " + placesToVisit.get(i - 1) + " to -> " + placesToVisit.get(i));

		}

		// with for each loop
		for (String e : placesToVisit) {
			String previous = placesToVisit.getFirst();
			System.out.println("Traveling from " + previous + " to " + e);
			previous = e;
		}

		// with list iterator
		System.out.println("-".repeat(100));
		ListIterator<String> iterator = placesToVisit.listIterator(1); // creates an iterator we need to pass the type
																		// of data to the <> and after the = we use the
																		// list to iterate and the listIterator method,
																		// do note that we can pass the starting point
																		// of the iteration by passing the index from
																		// which we want to start to the listIterator(1)
																		// method (that 1 is the index starting point )
		String previousTown = placesToVisit.getFirst();

		while (iterator.hasNext()) { // hasNext() returns a boolean true or false 
			String town = iterator.next(); // captures the next value of the list 
			System.out.println("Traveling from " + previousTown + " to " + town); // prints data
			previousTown = town; // assigns data
			

		}
		System.out.println("-".repeat(100));
		
		testIterator(placesToVisit);

	}
	
	private static void testIterator(LinkedList <String> list) {
		var iterator = list.iterator(); // one way
		//ListIterator<String> iterator = (ListIterator<String>) list.iterator(); <- another way
		
		while(iterator.hasNext()) {
			
			if(iterator.next().equals("zapopan")) {
				iterator.remove(); //Note that we can test and modify a list using the iterator, in here we are removing an element in the linked list
			}
			//System.out.println(iterator.next());
		}
		
		System.out.println(list);
	}


}
