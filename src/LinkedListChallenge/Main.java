package LinkedListChallenge;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		createItinerary();

	}

	public static void createItinerary() {
		Scanner scanner = new Scanner(System.in);
		boolean decision = true;
		boolean stFlag = true;
		boolean falseDecision = true;
		LinkedList<Town> itinerary = new LinkedList<>();
		do {
			falseDecision = true;
			while (stFlag) {
				System.out.println("Please enter your starting point name");
				String startingPoint = scanner.next();
				Town sp = new Town(startingPoint);
				itinerary.add(sp);
				stFlag = false;
			}

			System.out.println("Please enter your destination name");
			String townName = scanner.next();

			if (checkEntries(itinerary, townName)) {
				System.out.println("Please enter the distance in km");
				int km = (int) scanner.nextInt();
				Town town = new Town(townName, km);
				itinerary.add(town);

			}
			while (falseDecision) {
				System.out.println("Do you wish to add a new destination?");
				String moreDestiny = scanner.next();
				if (moreDestiny.equals("y")) {
					decision = true;
					falseDecision = false;
				} else if (moreDestiny.equals("n")) {
					falseDecision = false;
					decision = false;
				} else {
					System.out.println("your answer is not correct, please type y for yes and n for no");
					falseDecision = true;
				}
			}
		} while (decision);

		printLinkedList(itinerary);

	}

	public static void printLinkedList(LinkedList<Town> list) {

		var iterator = list.listIterator(1);
		while (iterator.hasNext()) {
			iterator.previous();
			System.out.println(iterator.next().getName() + " is at " + iterator.next().getdistance() + " from "
					+ iterator.previous().getName());
			iterator.next();
		}

	}

	public static boolean checkEntries(LinkedList<Town> list, String name) {
		var iterator = list.listIterator();
		while (iterator.hasNext()) {
			if (iterator.next().getName().equals(name)) {
				System.out.println("That name is already on the list");
				return false;
			}
		}
		return true;
	}

}
