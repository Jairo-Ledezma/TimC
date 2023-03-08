package oopChallenge;



public class Main {

	public static void main(String[] args) {
		Hamburger hamburger = new RegularHamburger("regular" , 3);
		
		Hamburger plus = new PlusHamburger("plus",2);
		
		Drink s = new Drink("Orange" , "Small" );
		Drink l = new Drink("Orange" , "Large" );
		
		MealOrder order = new MealOrder(plus , l);
		
		order.printTotal();
		
		
		
		

	}

}
