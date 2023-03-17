package arrayListsAndLinkedListsS10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class MyPractice {

	public static void main(String[] args) {

		ArrayList<String> stringLists = new ArrayList<>(List.of("Jan", "Feb", "Mar"));

		String[] stringArray = stringLists.toArray(new String[0]);
		
		System.out.println(Arrays.toString(stringArray));
		
		Random random = new Random();
		int number = random.nextInt((int)Math.pow(10, 10));
		System.out.println(number);
	}
	

}
