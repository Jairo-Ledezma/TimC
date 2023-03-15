package LinkedListChallenge;

public class Town {
	
	private String name;
	private int distance;
	
	public Town(String name ) {
		this.name = name;
		this.distance = 0;
	}
	
	public Town(String name , int distance) {
		this.name = name;
		this.distance = distance;
	}
	
	public int getdistance() {
		return distance;
	}

	
	public String getName() {
		return name;
	}

	
	
	
	
}
