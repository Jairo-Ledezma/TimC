package StringFormating;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Calendar;

public class Main {

	public static void main(String[] args) {
		
		//in this class we will review the text block 
		// old way 
		
		String bulletIt = "Print a bulleted List: \n" +
		"\t\u2022 First Point \n"+
				"\t\t\u2022 SubPoint";
		
		//System.out.println(bulletIt);
		
		// now with the text block:
		
		String textBlock = """
				Print a bulleted list:
					\u2022 First point
						\u2022 SubPoint
				""";
		
		System.out.println(textBlock);
		
		
		int age =  35;
		int yearOfBirth = (LocalDate.now().getYear()) -(age);
		System.out.printf("your age is %.2f%n" , (float)age);
		System.out.printf("age: %d %nYear of Birth: %d" , age , yearOfBirth);
		
		for(int i = 1; i<=100000; i*=10) {
			System.out.printf("Printing %6d %n" , i);
		}
		
		String formattedString = String.format("your age is %d", age);
		System.out.println(formattedString);
		
		formattedString = "your age is %d".formatted(age);
		System.out.println(formattedString);
	
		
	}

}
