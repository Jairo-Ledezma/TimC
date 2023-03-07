package EncapsulationS8;

public class Main {

	public static void main(String[] args) {
		NonEncapsulatedPlayer player = new NonEncapsulatedPlayer();
		
		player.name="Tim";
		player.health=20;
		player.weapon = "Sword";
		
		int damage =10;
		
		player.loseHealth(damage);
		System.out.println("remaining health = " + player.healthRemaining());
		player.health = 200; //cheating!!! encapsulation is wrong and therefore players can cheat, there is a method to restore life that is net being called, if the NonEncapsulatedPlayer fields were 
		//private, users would not be able to call player.health and set the 200 value, they would have to call the restoreHealth() method which has a rule for life not to go above 100
		player.loseHealth(11);
		System.out.println("remaining health = " + player.healthRemaining());
		
		
		EncapsulatedPlayer jairo =  new EncapsulatedPlayer("Jairo" , 200 , "Sword");
		
		System.out.println("initialHealth is = " + jairo.healthRemaining());
		
		
	}

}
