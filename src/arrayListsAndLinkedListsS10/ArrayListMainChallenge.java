package arrayListsAndLinkedListsS10;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListMainChallenge {

	public static void main(String[] args) {
		challenge();

	}
	
	private static void challenge() {
		Scanner scanner = new Scanner(System.in);
		ArrayList<String> items = new ArrayList<>();
		int counter = 1;
		boolean softwareFlag = true;
		
		while (softwareFlag) {
		System.out.println("Please select an option");

		String selectedOption = scanner.next();
		
		
		
		switch (selectedOption) {
		case "0":
			System.out.println("Thank you for using our soft");
			softwareFlag = false;
			break;
		case "1":
			boolean flag = true;
			boolean desicionFlag = true;
			while (flag) {
				
				System.out.println("plase add item number " + counter);
				String item = scanner.next().toLowerCase();
				items.add(item);
				System.out.println("Do you wish to add another item ?  Y or N ");
				
				while(desicionFlag) {
				String decision = scanner.next().toLowerCase();
				
					if (decision.equals("y")) {
						counter++;
						desicionFlag = false;
					continue;
				} else if (decision.equals("n")) {
					System.out.println("your grocery list is: " + items);
					desicionFlag = false;
					flag = false;
					break;
				}else {
					System.out.println("Please type in Y for yes and n for no");
				}
				}

			}
			break;
		case "3":

			boolean removeFlag = true;

			while (removeFlag) {
				System.out.println("Please type the item to be removed ");
				String removal = scanner.next().toLowerCase();
				items.remove(removal);
				counter--;
				System.out.println("Do you wish to remove another Item?  Y or N");
				String decision = scanner.next().toLowerCase();
				if (decision.equals("y")) {
					continue;
				} else {
					removeFlag = false;
					System.out.println("Your editted list is now :" + items);
					break;
				}

			}
		}
		}
	}

}
