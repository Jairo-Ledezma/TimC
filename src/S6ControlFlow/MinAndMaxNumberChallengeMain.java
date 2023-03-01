package S6ControlFlow;

import java.util.Scanner;

public class MinAndMaxNumberChallengeMain {

	public static void minAndMax() {
		Scanner scanner = new Scanner(System.in);
		double enteredNumber = 0;
		double minNumber = 0;
		double maxNumber = 0;

		do {
			try {
				System.out.println("Please enter a number to continue, or enter any charachter to exit");
				enteredNumber = Double.parseDouble(scanner.nextLine());
				if (minNumber == 0 && maxNumber == 0) {
					minNumber = enteredNumber;
					maxNumber = enteredNumber;
				} else if ((enteredNumber > minNumber) && (enteredNumber < maxNumber)) {
					minNumber = enteredNumber;
				} else {
					minNumber = maxNumber;
					maxNumber = enteredNumber;
				}
			} catch (NumberFormatException bad) {
				break;
			}

		} while (true);
		System.out.println("Thanks for playing");
		System.out.println("The smallest number entered is : " + minNumber);
		System.out.println("The largest number entered is : " + maxNumber);
	}

	public static void main(String[] args) {
		minAndMax();

	}

}
