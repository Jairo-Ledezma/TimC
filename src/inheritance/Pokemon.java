package inheritance;

public class Pokemon {
	
	protected String name;
	private String type;
	private double weight;
	
	public Pokemon() {
		
	}
	
	public Pokemon (String name, String type , double weight) {
		this.name=name;
		this.type = type;
		this.weight = weight;
	}

	@Override
	public String toString() {
		return "Pokemon [name=" + name + ", type=" + type + ", weight=" + weight + "]";
	}
	
	public void move(String speed) {
		System.out.println(name + " moves " + speed );
	}
	
	public void  MakeNoise () {
		System.out.println( name + " makes noise");
	}

}
