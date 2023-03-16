package bankingChallenge;

import java.util.ArrayList;



public class Bank {
	
	private static ArrayList <Customer> customerList = new ArrayList<>();
	
	
	
	public  boolean addCustomer(String customer) {

		for (int i = 0; i < customerList.size(); i++) {
			if (customerList.get(i).getName().equals(customer)) {
				System.out.println(customer + " is already our valued customer, let's try again!");
				return false;
			}
		}
		Customer newCustomer = new Customer(customer);
		customerList.add(newCustomer);
		System.out.println(customer + " has been added to our list of valuable customers");
	
		return true;
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
	
	public void getCustomerList() {
		for(int i = 0; i<customerList.size(); i++) {
			System.out.println("1.- " + customerList.get(i).toString());
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


}


