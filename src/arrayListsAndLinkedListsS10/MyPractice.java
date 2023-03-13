package arrayListsAndLinkedListsS10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MyPractice {

	public static void main(String[] args) {

		ArrayList<String> stringLists = new ArrayList<>(List.of("Jan", "Feb", "Mar"));

		String[] stringArray = stringLists.toArray(new String[0]);
		
		System.out.println(Arrays.toString(stringArray));
	}
	

}
