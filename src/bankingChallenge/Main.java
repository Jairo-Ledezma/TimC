package bankingChallenge;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		runBankSoftware();

	}

	public static void runBankSoftware() {
		Bank bank = new Bank();
		Boolean softwareFlag = true;
		String customerName = "";
		String stringAmount = "";
		Scanner scanner = new Scanner(System.in);

		System.out.println("Welcome to our banking software");
		while (softwareFlag) {
			System.out.println("-".repeat(100));
			System.out.println("please select the desired option");
			System.out.println("0.- to exit the software");
			System.out.println("1.- for adding a new customer");
			System.out.println("2.- to perform a transaction");
			System.out.println("3.- to check a customer's transaction history");
			System.out.println("4.- to see our client list");

			String workerDecision = scanner.nextLine();

			switch (workerDecision) {
			case "0":
				
				System.out.println("Thank you for using our software");
				softwareFlag = false;
				scanner.close();
				break;

			case "1":
				do {
					System.out.println("please type in the customer's name");
					customerName = scanner.nextLine();
				} while (!bank.addCustomer(customerName));
				break;

			case "2":
				if (bank.isListEmpty()) {
					System.out.println(
							"you dont have any clients registered yet, please press 1 to register your first client");
					break;
				} else {
					do {
						System.out.println("Please type in the name of the customer");
						customerName = scanner.nextLine();
					} while (!bank.isClientOnList(customerName));
					System.out.println(
							"Please type in the amount, type negative numbers to withdraw and positive numbers to deposit");
					stringAmount = scanner.nextLine();
					Double realAmount = Double.parseDouble(stringAmount);
					bank.newTransaction(customerName, realAmount);
					break;
				}

			case "3":
				if (bank.isListEmpty()) {
					System.out.println(
							"you dont have any clients registered yet, please press 1 to register your first client");
					break;
				} else {
					do {
						System.out.println("Please type in the customer");
						customerName = scanner.nextLine();
					} while (!bank.isClientOnList(customerName));
					bank.checkCustomerTransactions(customerName);
					System.out.println("please type e to go back to the main menu");
					customerName = scanner.nextLine();
					if (customerName.equals("e")) {
						break;
					}
				}
			case "4":
				if (bank.isListEmpty()) {
					System.out.println(
							"you dont have any clients registered yet, please press 1 to register your first client");
					break;
				} else {
					System.out.println("Please input the name of the client to print his/her statement");
					customerName = scanner.nextLine();
					bank.getClientStatement(customerName);
				}

			}

		}
	}

}
