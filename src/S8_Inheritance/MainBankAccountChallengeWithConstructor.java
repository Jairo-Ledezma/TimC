package S8_Inheritance;

public class MainBankAccountChallengeWithConstructor {

	public static void main(String[] args) {
		//BankAccountChallengeWithConstructor account = new BankAccountChallengeWithConstructor();
		BankAccountChallengeWithConstructor account2 = new BankAccountChallengeWithConstructor(5254,1000,"jairo" , "jairo@jairo.com" , 123456789);
		
	
		System.out.println(account2.getAccountBalance());
		account2.deposit(-10);
		account2.deposit(100);
		System.out.println(account2.getAccountBalance());
		account2.withdrawal(250);
		account2.withdrawal(180);
		account2.withdrawal(20.00);
		account2.deposit(100);
		System.out.println(account2.getAccountBalance());
		account2.withdrawal(45.55);
		account2.getAccountBalance();
		
	}

}
