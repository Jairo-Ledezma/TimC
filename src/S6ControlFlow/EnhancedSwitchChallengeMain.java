package S6ControlFlow;

public class EnhancedSwitchChallengeMain {
	
	public static void printDayOfTheWeek(int day) {
		String nameOfDay = switch (day) {
		case 0 -> "Sunday";
		case 1 -> "Monday";
		case 2 -> "Tuesday";
		case 3 -> "Wednesday";
		case 4 -> "Thursday";
		case 5 -> "Friday";
		case 6 -> "Saturday";
		default -> "Invalid Day";
		};

		
			System.out.println("The " + day + " day is " + nameOfDay);
		
	}

	public static void main(String[] args) {
		printDayOfTheWeek(0);
		printDayOfTheWeek(1);
		printDayOfTheWeek(2);
		printDayOfTheWeek(3);
		printDayOfTheWeek(4);
		printDayOfTheWeek(5);
		printDayOfTheWeek(6);
		printDayOfTheWeek(7);
		

	}

}
