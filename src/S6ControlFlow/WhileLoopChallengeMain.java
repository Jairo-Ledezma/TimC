package S6ControlFlow;

public class WhileLoopChallengeMain {
	
	public static boolean isEvenNumber(int number) {
		if(number%2==0) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		
		
		//My approach:
		int number = 5;
		int finishNumber = 20;
		int evenNumbers = 0;
		int oddNumbers=0;
		
		while(number<=finishNumber) {
			if(isEvenNumber(number)) {
				evenNumbers++;
				System.out.println(number);
				if(evenNumbers==5) {
					break;
				}
			}else if(!isEvenNumber(number)) {
			oddNumbers++;}
			number++;
		}
		
		//tim's approach
		/*while (number<=finishNumber) {
			number++;
			if(!isEvenNumber(number)) {
				oddNumbers++;
				continue;
			}
			evenNumbers++;
			System.out.println("Even Number " + number);
			if(evenNumbers==5) {
				break;
			}
			
		}*/
		System.out.println("odd numbers found: " + oddNumbers);
		System.out.println("even numbers found: " + evenNumbers);
	}

}
