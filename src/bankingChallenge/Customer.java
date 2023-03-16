package bankingChallenge;

import java.util.ArrayList;

public class Customer {
	
	private String name;
	
	private ArrayList <Double> transactions = new ArrayList<>();
	
	public Customer(String name) {
		this.name = name;
	}
	
	
	public String getName() {
		return name;
	}
	
	
	
	public void addTransaction(Double transaction) {
		
		if (transaction <0) {
			transactions.add(transaction);
			System.out.println( transaction + " usd has been wthdrewn from your account");
			
		}else if (transaction > 0) {
			transactions.add(transaction);
			System.out.println( transaction + " usd has been deposited to your account");
		}else {
			System.out.println("please check your input, something went wrong, do try again");
		}
		
		
		
	}
	
	public void getTransactionsHistory() {
		
			System.out.println(transactions);
		
	}


	@Override
	public String toString() {
		return "Customer=" + name + ", transactions= [ " + transactions + " ]" ;
	}
	
	


	
	
	

}
