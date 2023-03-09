package oopChallenge;

public class MealOrder {
	
private Hamburger hamburger;

private Drink drink;

//private SideItem sideItem;


public MealOrder (Hamburger hamburger , Drink drink /*, SideItem sideItem*/) {
	this.hamburger = hamburger;
	this.drink = drink;
	//this.sideItem = sideItem;
}

public void printTotal() {
	int totalAmount = hamburger.getPrice() + drink.getPrice();
	System.out.println("your total order amount is " + totalAmount  );
}


}
