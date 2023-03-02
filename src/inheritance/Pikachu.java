package inheritance;

public class Pikachu extends Pokemon {
	
	private String earShape;
	private String tailShape;
	
	/*public Pikachu() {
		super("pikachu" , "Electric" , 5);
		
	}*/

	/*public Pikachu(String name, String type, int weight, String earShape, String tailShape) {// normal constructor including super 
		super(name, type, weight);
		this.earShape = earShape;
		this.tailShape = tailShape;
	}*/
	
	public Pikachu(String name, String type, int weight, String earShape, String tailShape) {// normal constructor including super but on this one the type has ternary setable according to size
		super(name, weight<5.0 ? "small electric" :(weight < 10  ? "medium electric" : "Large electric"), weight);
		this.earShape = earShape;
		this.tailShape = tailShape;
	}

	@Override
	public String toString() {
		return "Pikachu [earShape=" + earShape + ", tailShape=" + tailShape + ", toString()=" + super.toString() + "]";
	}
	
	public void  MakeNoise () {
		System.out.println(name + " pika pika"); // note that name is not a local variable but an inherited one from pokemon class, if it was private we would not have access to it from pikachu class
		//in this case we are able to access it because we change the access modifier from private to protected
	}

	@Override
	public void move(String speed) {
		// TODO Auto-generated method stub
		super.move(speed); //this calls the exact method of the super class, you can override it as the make noise method or simply add to it like in this method
		//System.out.println("actually really fast");
		
		if (speed.toLowerCase().equals("fast")) {
			run();
			wagTail();
		}else {
			talk();
			walk();
		}
	}
	
	private void talk() {
		System.out.println("pika pika, pikachu");
	}
	
	private void run() {
		System.out.println("pikachu is running");
	}
	
	private void walk() {
		System.out.println("pikachu is walking");
	}
	
	private void wagTail() {
		System.out.println("Pikachu is wagging its tail");
	}
	
	
	
	

	
	
	
	

}
