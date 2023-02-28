
package S6ControlFlow;

public class WhileAndDoWhileLoop {

	public static void main(String[] args) {

		
		// for loop
		for (int i = 1; i <= 5; i++) {
			System.out.println(i);
		}

		
		// while loop (note that the index is declared outside of the loop)
		int i = 1;
		while (true) {
			if (i > 5) {
				break;
			}
			System.out.println(i);
			i++;
		}
		
		//do while loop (index also declared outside this will run at least once since condition)
		//is checked in the end
		int x=1;
		do {
			System.out.println(x);
			x++;
		}while(x<=5);
		
		

	}

}