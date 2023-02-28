package S6ControlFlow;

public class SwitchStatementMain {

	public static void main(String[] args) {
		
		//switch statement can only be used with: byte, short, int, char, Byte, Short, Integer, Character, String, Enum. 
		
		int switchValue = 4;
		
		switch(switchValue) {
		
		case 1: 
			System.out.println("Value was 1");
			break;
			
		case 2: 
			System.out.println("Value was 2");
			break;
		case 3: case 4: case 5: 
			System.out.println("it was a 3, a 4, or a 5");
			System.out.println("actually it was a " + switchValue);
			break;
			
		default:
			System.out.println("It was not  1, 2, 3, 4, or 5 ");
			break;
		}
		
		//enhanced switch statement functionality added in java 9
		// no break is needed, the colon is replaced with an arrow, in case of multiple statements (see case 3,4,5) statements are to be wrapped in curly brackets
		
		int switchEnhancedValue = 5;
		
		switch(switchEnhancedValue) {
			case 1 -> System.out.println("Value was 1");
			case 2 -> System.out.println("Value was 2");
			case 3,4,5 -> { //------------------------------------Note how the multiple statements are wrapped in curly brackets
			System.out.println("it was a 3, a 4, or a 5");
			System.out.println("actually it was a " + switchEnhancedValue);
			}
			default->System.out.println("It was not  1, 2, 3, 4, or 5 ");
		}
		
		System.out.println(getQuarter("JanuAry"));
		System.out.println(getQuarter("APRIL"));
		System.out.println(getQuarter("july"));
		System.out.println(getQuarter("december"));
		
		

	}
	
	public static String getQuarter(String month) {
		
		return switch (month.toLowerCase()) {
		case  "january" , "february" , "march" ->  "1st";
		case "april" , "may" , "june" ->  "2nd";
		case "july" , "august" , "september" -> "3rd";
		case "october" , "november" , "december" -> "4th";
		default ->  "you did not give me a month";
		};
		
	}

}
