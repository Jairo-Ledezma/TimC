package S5expressionsStatements;

public class MethodOverloadingMain {

	public static void main(String[] args) {
		
		System.out.println("New Score is " + calculateScore("tim" , 500));
		System.out.println("New Score is " + calculateScore(10));
		//System.out.println(calculateScore());
		
		
		
	}
	
	public static int calculateScore(String playerName , int score) {
		System.out.println("player " + playerName + " scored " + score + " points");
		return score*1000;
	}
	
	public static int calculateScore( int score) {
		return calculateScore("Anonymous" ,score);
	}
	
	public static int calculateScore( ) {
		System.out.println("No Player Name, No Player Score");
		return 0;
	}

}
