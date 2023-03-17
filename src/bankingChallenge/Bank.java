package bankingChallenge;

import java.util.ArrayList;
import java.util.Random;



public class Bank {
	
	private static ArrayList <Customer> customerList = new ArrayList<>();
	
	
	
	public void addCustomer(String customer ,String deposit) {
		double numberDeposit=Double.parseDouble(deposit); 
		int ac = 0;
		do {
			ac = generateAccountNumber();
		} while (doesAccountNumberExist(ac));
		Customer newCustomer = new Customer(customer, numberDeposit);
		newCustomer.setAccountNumber(ac);
		customerList.add(newCustomer);

		System.out.println(customer + " has been added to our list of valuable customers with account number "
				+ newCustomer.getAccountNumber());

	}
	
	
	public void checkCustomerTransactions(String customer ) {
		
		for (int i=0; i<customerList.size(); i++) {
			if(customer.equals(customerList.get(i).getName())) {
				customerList.get(i).getTransactionsHistory();
			}
		}
	}
	
	public void newTransaction(String clientName , Double amount) {
		for (int i = 0; i<customerList.size(); i++) {
			if(customerList.get(i).getName().equals(clientName)) {
				customerList.get(i).addTransaction(amount);
				
			}
		}
	}
	
	public void getClientStatement(String name) {
		for(int i = 0; i<customerList.size(); i++) {
			if(name.equals(customerList.get(i).getName())) {
			System.out.println(customerList.get(i).toString());
			}
		}
	}
	
	public boolean isClientOnList(String name) {
		
		for (int i=0; i<customerList.size();i++) {
			if(customerList.get(i).getName().equals(name)) {
				return true;
			}		
		}
		System.out.println(name + " is not on our client list, let's try again ");
		return false;
		
	}
	
	public boolean isListEmpty() {
		if (customerList.isEmpty()) {
			return true;
		}
		return false;
	}
	
	private boolean doesAccountNumberExist(int ac) {
		for (int i = 0; i<customerList.size(); i++) {
			if (customerList.get(i).getAccountNumber() == ac) {
				return true;
			}
		}
		return false;
	}
	
	private int generateAccountNumber() {
		Random random = new Random();
		int number = random.nextInt((int)Math.pow(10, 10));
		return number;
	}
	
	public void getClientList() {
		var  iterator = customerList.listIterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}


}


