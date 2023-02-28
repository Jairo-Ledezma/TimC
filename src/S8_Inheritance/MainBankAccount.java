package S8_Inheritance;

public class MainBankAccount {

	public static void main(String[] args) {
		BankAccountChallenge ba = new BankAccountChallenge();
		
		ba.setAccountBalance(100);
		System.out.println(ba.getAccountBalance());
		ba.deposit(-10);
		ba.deposit(100);
		System.out.println(ba.getAccountBalance());
		ba.withdrawal(250);
		ba.withdrawal(180);
		ba.withdrawal(20.00);
		ba.deposit(100);
		System.out.println(ba.getAccountBalance());
		ba.withdrawal(45.55);
		ba.getAccountBalance();
		
		

	}

}
