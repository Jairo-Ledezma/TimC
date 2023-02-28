package S8_Inheritance;

public class BankAccountChallengeWithConstructorChaining {

	private int accountNumber;
	private double accountBalance;
	private String customerName;
	private String email;
	private int phoneNumber; 
	
	
	public BankAccountChallengeWithConstructorChaining() {
		this(5254 , 1000.00,"jairo" , "jairo@jairo.com",123456789);
		System.out.println("Empty constructor called, but in it another constructor with parameters is called");
	}
	
	public BankAccountChallengeWithConstructorChaining(int accountNumber , double accountBalance,
			String customerName , String email , int phoneNumber ) {
		//System.out.println("account constructor with parameters called");
		this.accountNumber = accountNumber;
		this.accountBalance = accountBalance;
		this.customerName = customerName;
		this.email  = email;
		this.phoneNumber = phoneNumber;
	}

	public void deposit(double deposit) {
		if (deposit <= 0 ) {
			System.out.println("You can't deposit a negative number");
		}else {
			accountBalance  = accountBalance + deposit;
		}
		
		
	}
	
	public void withdrawal (double withdrawalAmount) {
		if (withdrawalAmount > accountBalance ) {
			System.out.println("Not enough funds");
		}else {
			this.accountBalance = accountBalance - withdrawalAmount;
			System.out.println(withdrawalAmount + " has been withdrew your new balance is " + accountBalance);
		}
	}
	
	public int getAccountNumber() {
		return accountNumber;
	}
	
	public double getAccountBalance() {
		return accountBalance;
	}
	
	public String getCustomerName() {
		return customerName;
	}
	
	public String getEmail() {
		return email;
	}
	
	public int getPhoneNumber() {
		return phoneNumber;
	}
	
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	
	public void setAccountBalance(int accountBalance) {
		this.accountBalance = accountBalance;
	}
	
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	
}
