package S8Polymorphism;

public class SmartKitchen {
	
	private Refrigerator refrigerator;
	private DishWasher dishWasher;
	private CoffeeMaker coffeeMaker;
	
	public SmartKitchen() {
		refrigerator = new Refrigerator();
		dishWasher = new DishWasher();
		coffeeMaker = new CoffeeMaker();
	}

	
	
	public void doKitchenWork(boolean coffeeFlag , boolean fridgeFlag, boolean dishWasherFlag) {
		refrigerator.setHasWorkToDo(fridgeFlag);
		dishWasher.setHasWorkToDo(dishWasherFlag);
		coffeeMaker.setHasWorkToDo(coffeeFlag);
		coffeeMaker.brewCoffee();
		refrigerator.orderFood();
		dishWasher.doDishes();
	}
	
	
	

}

class Refrigerator  {
	
	private boolean hasWorkToDo;
	
	
	
	public void setHasWorkToDo(boolean hasWorkToDo) {
		this.hasWorkToDo = hasWorkToDo;
	}
	
	
	
	public void orderFood() {
		if(hasWorkToDo) {
		System.out.println("The Refrigerator is ordering food");
		hasWorkToDo = false;
		}
	}

}

class CoffeeMaker  {
	
	private boolean hasWorkToDo;
	
	
	
	public void setHasWorkToDo(boolean hasWorkToDo) {
		this.hasWorkToDo = hasWorkToDo;
	}
	
	public void brewCoffee() {
		if(hasWorkToDo) {
		System.out.println("The coffee maker is brewing coffee");
		hasWorkToDo = false;
		}
	}
	
	

}


class DishWasher {
	
	private boolean hasWorkToDo;
	
	
	
	
	public void setHasWorkToDo(boolean hasWorkToDo) {
		this.hasWorkToDo = hasWorkToDo;
	}
	
	
	
	public void doDishes() {
		if(hasWorkToDo) {
		System.out.println("The Dish Washer is doing the dishes");
		hasWorkToDo =false;
		}
	}

}
