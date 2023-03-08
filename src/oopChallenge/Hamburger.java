package oopChallenge;

public class Hamburger {
	private String name;
	private int price;
	
	
	
	public Hamburger(String name) {
		this.name = name;
		
	}
	
	public int getPrice() {
		return this.price;
	}

}


class RegularHamburger extends Hamburger{
	private int topings;
	private int extraTopings;
	private int price;
	

	public RegularHamburger(String name , int extraTopings ) {
		super(name);
		this.topings = 7;
		if(extraTopings> 0 && extraTopings<=3) {
			this.extraTopings = extraTopings;
		}else {
			System.out.println("We are sorry, only 3 additional topings can be added to a " + this.getClass().getSimpleName());
		}
		this.price = 50 + (extraTopings*5);
	}


	@Override
	public int getPrice() {
		return this.price;
	}	
	
	
}

class PlusHamburger extends Hamburger{
	private int topings;
	private int extraTopings;
	private int price;
	

	public PlusHamburger(String name , int extraTopings ) {
		super(name);
		this.topings = 7;
		if(extraTopings> 0 && extraTopings<=2) {
			this.extraTopings = extraTopings;
		}else {
			System.out.println("We are sorry, only 2 additional topings can be added to a " + this.getClass().getSimpleName());
		}
		this.price = 50 + (extraTopings*5);
	}
	@Override
	public int getPrice() {
		return this.price;
	}	
	
}
