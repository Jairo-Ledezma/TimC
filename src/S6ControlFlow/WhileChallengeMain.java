package S6ControlFlow;

public class WhileChallengeMain {
	
	//this challenge will sum the digits of any given number to the sumDigits method

	public static int sumDigits(int number) {

		if (number < 0) {
			return -1;
		}
		int sum = 0;
		while (number > 9) {
			if (number <= 9) {
				break;
			}
			sum += number%10;
			number = number / 10;
		}
		sum += number;
		return sum;
	}

	public static void main(String[] args) {
		System.out.println(sumDigits(9));

	}

}
