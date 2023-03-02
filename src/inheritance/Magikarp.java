package inheritance;

public class Magikarp extends Pokemon{
	
	private int gills;
	private int fins;
	
	
	
	public Magikarp(String name, double weight, int gills, int fins) {
		super(name, "water small", weight);
		this.gills = gills;
		this.fins = fins;
	}

	private void moveMuscles() {
		System.out.println("Muscles moving");
	}
	
	private void moveBackFin() {
		System.out.println("Back fin moving");
	}

	@Override
	public void move(String speed) {
		// TODO Auto-generated method stub
		super.move(speed);
		
		moveMuscles();
		if (speed == "fast") {
			moveBackFin();
		}
		System.out.println();
	}

	@Override
	public String toString() {
		return "Magikarp [gills=" + gills + ", fins=" + fins + ", toString()=" + super.toString() + "]";
	}
	
	
	
}
