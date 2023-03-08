package oopChallenge;

public class Drink {
	
	private String flavour;
	private String size;
	private int price;
	
	public Drink (String flavour ,String size) {
		this.flavour = flavour;
		this.size = size;
		switch(size.toUpperCase().charAt(0)) {
		case 'L' -> this.price = 50;
		case 'S' -> this.price = 30;
		default-> System.out.println("Please select either S for small beverage or L for large beverage");
		}
		
	}
	
	public int getPrice() {
		return this.price;
	}

}
