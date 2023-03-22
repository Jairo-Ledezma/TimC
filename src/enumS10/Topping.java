package enumS10;

//an enum is used to store constants, this means the values never change the value or order  you can also set values and get to them, check the method below 
public enum Topping {
	MUSTARD,
	PICKLES,
	BACON,
	CHEDDAR,
	TOMATO;
	
		
	public double getPrice() {

		return switch(this) {
		case BACON ->  1.5;
		case CHEDDAR -> 1.0;
		default -> 0.0;
		};
	}

}


