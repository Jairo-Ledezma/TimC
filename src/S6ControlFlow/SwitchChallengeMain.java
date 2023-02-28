package S6ControlFlow;

public class SwitchChallengeMain {

	public static void main(String[] args) {
		
		char letter = 'z';
		
		switch (Character.toLowerCase(letter)) {
		case 'a': 
			System.out.println("letter " + letter + " should be mentioned as Able");
			break;
		case 'b': 
			System.out.println("letter " + letter + " should be mentioned as Baker");
			break;
		case 'c':
			System.out.println("letter " + letter + " should be mentioned as Charlie");
			break;
		case 'd':
			System.out.println("letter " + letter + " should be mentioned as Dog");
			break;
		case 'e':
			System.out.println("letter " + letter + " should be mentioned as Easy");
			break;
		default:
			System.out.println(letter + " was not found");

		}
		
		
	}

}
