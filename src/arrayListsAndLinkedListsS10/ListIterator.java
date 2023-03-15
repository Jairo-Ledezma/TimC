package arrayListsAndLinkedListsS10;

import java.util.LinkedList;

public class ListIterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	private static void testListIterator(LinkedList <String> list) {
		var iterator = list.listIterator(); // one way
		//ListIterator<String> iterator = (ListIterator<String>) list.iterator(); <- another way
		
		while(iterator.hasNext()) {
			
			if(iterator.next().equals("Zapopan")) {
				iterator.add("Mexicaltsingo");
			}
			while(iterator.hasPrevious()) {
				
				System.out.println(iterator.previous());
			}
			
		}
		
		System.out.println(list);
	}

}
