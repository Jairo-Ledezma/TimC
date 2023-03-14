package arrayListsAndLinkedListsS10;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class ArrayListMainChallenge {

	public static void main(String[] args) {
		challenge();

	}
	
	private static void challenge() {
		Scanner scanner = new Scanner(System.in);
		ArrayList<String> groceries = new ArrayList<>();
		int counter = 0;
		boolean softwareFlag = true;

		while (softwareFlag) {
			boolean oneFlag = true;

			System.out.println("Welcome to our Grocery List app!");
			System.out.println();
			System.out.println("Please select an option");
			System.out.println();
			System.out.printf("1 to add items"+
							  	" 2 to remove items"+
								" 0 to exit");

			String selectedOption = scanner.next();

			switch (selectedOption) {
			case "0":
				System.out.println("Thank you for using our Grocery List app");
				System.out.println("Your sorted list is :" + groceries);
				System.out.println("Have fun shopping");
				
				softwareFlag = false;
				break;
			case "1":
				boolean decisionFlag = true;
				while (oneFlag) {
					counter++;
					System.out.println("plase add item number " + counter);
					String item = scanner.next().toLowerCase();
					if (groceries.contains(item)) {
						counter--;
						System.out.println(item + " is already on the list");
					}else {
						groceries.add(item);
						groceries.sort(Comparator.naturalOrder());
						System.out.println("Your sorted list is :" + groceries);
					}
					

					while (decisionFlag) {
						System.out.println("Do you wish to add another item ?  Y or N ");
						String decision = scanner.next().toLowerCase();
						if (decision.equals("y")) {
							decisionFlag = true;
							break;
						} else if (decision.equals("n")) {
							System.out.println("Your sorted list is :" + groceries);
							decisionFlag = false;
							oneFlag = false;
							break;

						} else {
							System.out.println("Please type y for yes and n for no");
							decisionFlag = true;

						}

					}

				}
				break;

			case "2":

				boolean removeFlag = true;

				while (removeFlag) {
					System.out.println("Please type the item to be removed ");
					String removal = scanner.next().toLowerCase();
					groceries.remove(removal);
					System.out.println("Your editted list is now :" + groceries);
					counter--;
					System.out.println("Do you wish to remove another Item?  Y or N");
					String decision = scanner.next().toLowerCase();
					if (decision.equals("y")) {
						continue;
					} else {
						removeFlag = false;
						System.out.println("Your editted list is now :" + groceries);
						break;
					}

				}
			}
		}
	}

}
