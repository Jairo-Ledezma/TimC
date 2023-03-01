package S6ControlFlow;

import java.time.LocalDate;
import java.util.Scanner;

public class ScannerClassReviewMain {

	/*
	 * console.readline did not worked, i got an error saying Could not find or load
	 * main class solutions tried: -cleaned the project -created a new project with
	 * only that class on the package -tried to run it on a different terminal than
	 * eclipse's terminal
	 */

	public static String getInputFromConsole(int currentYear) {
		String name = System.console().readLine("hi, what's your name");
		System.out.println("hi " + name + ", thanks for taking the course");

		String dateOfBirth = System.console().readLine("what year were you born? ");
		int age = currentYear - Integer.parseInt(dateOfBirth);
		return "so you are " + age + " years old ";
	}

	public static String getInputFromScanner() {
		int currentYear = LocalDate.now().getYear();
		int birthDate = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Hi, What's your name?");
		String name = scanner.nextLine();
		System.out.println("Hi " + name + ", thanks for taking the course");
		System.out.println("What year were your born?");

		birthDate = Integer.parseInt(scanner.nextLine());
		System.out.println("Letters are not allowed, try again...");
		birthDate = Integer.parseInt(scanner.nextLine());

		if ((birthDate < currentYear - 125) || (birthDate >= currentYear)) {
			do {
				System.out.println("I think there is something wrong with your date of birth, can you type it again?");
				birthDate = Integer.parseInt(scanner.nextLine());

			} while ((birthDate < currentYear - 125) || (birthDate >= currentYear));
		}

		int age = currentYear - birthDate;

		return "so your are " + age + " years old.";

	}

	public static void main(String[] args) {
		int currentYear = 2022;
		try {
			System.out.println(getInputFromConsole(currentYear));
		} catch (NullPointerException e) {
			System.out.println(getInputFromScanner());
		}

	}

}
