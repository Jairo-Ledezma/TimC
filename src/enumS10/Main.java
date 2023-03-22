package enumS10;

import java.util.Random;

public class Main {

	public static void main(String[] args) {
		DayOfTheWeek weekDay = DayOfTheWeek.TUES;
		
		System.out.println(weekDay);
		
		System.out.printf("Name is %s, Ordinal Value is : %d%n" , weekDay.name() , weekDay.ordinal());
		
		for(int i =0; i<10; i++) {
		var day = getRandomDayOfTheWeek();
		switchDayOfTheWeek(day);
		
		/*System.out.printf("Name is %s, Ordinal Value is : %d%n" , day.name() , day.ordinal());
		
		if(day==DayOfTheWeek.FRI) {
			System.out.println("Found a friday!!!");
		}*/
		}
		
		for (Topping topping : Topping.values()) {
			System.out.println(topping.name() + " : " + topping.getPrice());
		}
	}
	
	
	public static DayOfTheWeek getRandomDayOfTheWeek () {
		int random = new Random().nextInt(7); //creates a random number and stores it into a variable 
		DayOfTheWeek[] allDays = DayOfTheWeek.values(); // values method will return the enum data as an array
		
		return allDays[random];
	}
	
	public static void switchDayOfTheWeek(DayOfTheWeek weekDay) {
		
		int weekDayInteger = weekDay.ordinal()+1;
		
		switch(weekDay) {
			case WED -> System.out.println("Wednesday is Day " + weekDayInteger);
			case SAT -> System.out.println("Saturday is Day " + weekDayInteger);
			default -> System.out.println(weekDay.name().charAt(0) + weekDay.name().substring(1).toLowerCase() + "day is Day " + weekDayInteger);
		}
	}

}
