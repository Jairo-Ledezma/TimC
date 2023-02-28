package S6ControlFlow;

public class PrimeNumberChallengeMain {

	public static boolean isPrime(int wholeNumber) {
		if (wholeNumber <= 2) {
			return (wholeNumber == 2);
		}

		for (int divisor = 2; divisor <= wholeNumber / 2; divisor++) {
			if (wholeNumber % divisor == 0) {
				return false;
			}
		}
		return true;

	}

	public static void primeList(int range) {
		int primeCounter = 0;
		for (int i = 0; i <= range; i++) {
			if (range > 1000) {
				System.out.println("error! maximun Range is 1,000");
				break;
			}

			if (isPrime(i)) {
				System.out.println("the number " + i + " is a prime number");
				primeCounter++;
				if (primeCounter == 3) {
					break;
				}

			}

		}

	}

	public static void main(String[] args) {
		primeList(900);

	}

}
