package S5expressionsStatements;

public class MethodOverloadingChallengeMain {
	
	public static double convertToCentimeters(int heightInInches) {
		return heightInInches *2.54;
	}
	
	public static double convertToCentimeters(int heightinFeet , int remHeightInInches) {
		int totalInches = (heightinFeet * 12) + remHeightInInches;
		return convertToCentimeters(totalInches);
	}

	public static void main(String[] args) {
		
		System.out.println(convertToCentimeters(150));
		System.out.println(convertToCentimeters(5,4));

	}

}
