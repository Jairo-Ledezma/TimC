package S6ControlFlow;

import java.util.Scanner;

public class Scanner5IntSumEnteredByUserMain {

	public static void fiveSum() {
		Scanner scanner = new Scanner(System.in);
		int numCount = 1;
		double sum = 0;

		System.out.println("please enter 5 numbers!");

		do {
			System.out.println("Please enter number " + numCount);
			try {
				sum += Double.parseDouble(scanner.nextLine());
				numCount++;
			} catch (NumberFormatException badUserData) {
				System.out.println("Letters are not allowed, try again!");
				//continue;

			}
			;

		} while (numCount <= 5);

		System.out.println("The numbers you entered sum : " + sum);
	}

	public static void main(String[] args) {
		fiveSum();

	}

}
