package S6ControlFlow;

public class ForLoopChallengeMain {
	
	public static double calculateInterest(double amount , double interestRate) {
		return (amount * (interestRate/100));
	}

	public static void main(String[] args) {
		
		for (double rate = 7.5; rate<=10.00; rate+=0.25) {
			double interestAmount = calculateInterest(100.00,rate);
			if (interestAmount > 8.5) {
				break;
			}
			System.out.println("interest rate for 100.00 at " + rate +" interest rate is : " + interestAmount );
		}

	}

}
