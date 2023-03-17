package enumS10;

import java.util.Random;

public class Main {

	public static void main(String[] args) {
		DayOfTheWeek weekDay = DayOfTheWeek.TUES;
		
		System.out.println(weekDay);
		
		System.out.printf("Name is %s, Ordinal Value is : %d%n" , weekDay.name() , weekDay.ordinal());
		
		for(int i =0; i<10; i++) {
		var day = getRandomDayOfTheWeek();
		
		System.out.printf("Name is %s, Ordinal Value is : %d%n" , day.name() , day.ordinal());
		
		if(day==DayOfTheWeek.FRI) {
			System.out.println("Found a friday!!!");
		}
		}
	}
	
	
	public static DayOfTheWeek getRandomDayOfTheWeek () {
		int random = new Random().nextInt(7); //creates a random number and stores it into a variable 
		DayOfTheWeek[] allDays = DayOfTheWeek.values(); // values method will return the enum data as an array
		
		return allDays[random];
	}

}
