package bankingChallenge;

import java.util.ArrayList;


public class Customer {
	
	private String name;
	private int accountNumber;
	private double balance;
	
	private ArrayList <Double> transactions = new ArrayList<>();
	
	public Customer(String name , double balance) {
		this.name = name;
		accountNumber = 0;
		this.balance = balance;
		
	}
	
	
	public String getName() {
		return name;
	}
	
	public int getAccountNumber() {
		return accountNumber;
	}
	
	public void setAccountNumber (int accountNumber) {
		
		this.accountNumber = accountNumber;
		
	}
	
	
	
	public void addTransaction(Double transaction) {
		double opNumber = Math.abs(transaction);
		
		if (transaction < 0 && balance > opNumber) {
			transactions.add(transaction);
			balance-=opNumber;
			System.out.println( transaction + " usd has been wthdrewn from your account");
			
		}else {
			System.out.println("Sorry, you dont have enough balance to withdraw " + opNumber + ", your current balance is " + balance + " Usd");
			return;
		}
		if (transaction > 0  ) {
			transactions.add(transaction);
			balance+=transaction;
			System.out.println( transaction + " usd has been deposited to your account");
		}else {
			System.out.println("please check your input, something went wrong, do try again");
		}
		
		
		
	}
	
	public void getTransactionsHistory() {
		if(transactions.isEmpty()) {
			System.out.println(name + " has not made any transactions yet");
		}else {
			for (int i=0; i< transactions.size(); i++) {
				if (transactions.get(i)>0) {
					System.out.println("a deposit of " + transactions.get(i) + " was added to the account");
				}else {
					System.out.println("a withdrawal of " + transactions.get(i) + " was taken from the account");
				}
			}
			
		}
		
	}
	
	


	@Override
	public String toString() {
		return "Customer = " + name + ", transactions = " + transactions + ", Actual Balance = " + balance +", AccountNumber = " + accountNumber;
	}
	
	


	
	
	

}
