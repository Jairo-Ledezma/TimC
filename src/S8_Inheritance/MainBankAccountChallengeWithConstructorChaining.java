package S8_Inheritance;

public class MainBankAccountChallengeWithConstructorChaining {

	public static void main(String[] args) {
		BankAccountChallengeWithConstructorChaining account = new BankAccountChallengeWithConstructorChaining();
		//BankAccountChallengeWithConstructor account2 = new BankAccountChallengeWithConstructor(5254,1000,"jairo" , "jairo@jairo.com" , 123456789);
		
	
		System.out.println(account.getAccountBalance());
		account.deposit(-10);
		account.deposit(100);
		System.out.println(account.getAccountBalance());
		account.withdrawal(250);
		account.withdrawal(180);
		account.withdrawal(20.00);
		account.deposit(100);
		System.out.println(account.getAccountBalance());
		account.withdrawal(45.55);
		account.getAccountBalance();
		
	}

}
