package S6ControlFlow;

public class ContinueStatementMain {

	public static void main(String[] args) {
		
		int i=0;
		while(i<50) {
			i+=5;
			if (i%25 == 0) {
				continue; // will skip the loop in this case it skips the loon under the condition specified in the if statement
			}
			System.out.print(i + "_");
		}

	}

}
