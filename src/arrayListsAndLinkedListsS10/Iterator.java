package arrayListsAndLinkedListsS10;

import java.util.LinkedList;
import java.util.ListIterator;

public class Iterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	private static void testIterator(LinkedList <String> list) {
		var iterator = list.iterator(); // one way
		//ListIterator<String> iterator = (ListIterator<String>) list.iterator(); <- another way
		
		while(iterator.hasNext()) {
			
			if(iterator.next().equals("Zapopan")) {
				iterator.remove();
			}
			//System.out.println(iterator.next());
		}
		
		System.out.println(list);
	}

}
