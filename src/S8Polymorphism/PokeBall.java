package S8Polymorphism;

public class PokeBall {
	
	private Pikachu pikachu;
	private Bulbasaur bulbasaur;
	private Squirtle squirtle;
	private Pidgey pidgey;
	private Charmander charmander;
	private Butterfly buterfly;
	
	public PokeBall() {
		this.pikachu = new Pikachu();
		this.bulbasaur = new Bulbasaur();
		this.squirtle = new Squirtle();
		this.pidgey = new Pidgey();
		this.charmander = new Charmander();
		this.buterfly = new Butterfly();
	}
	
	public void choosePokemon(boolean chosen1, boolean chosen2 , boolean chosen3, boolean chosen4, boolean chosen5, boolean chosen6) {
		pikachu.setChosen(chosen1);
		bulbasaur.setChosen(chosen2);
		squirtle.setChosen(chosen3);
		pidgey.setChosen(chosen4);
		charmander.setChosen(chosen5);
		buterfly.setChosen(chosen6);
		pikachu.chosePokemon();
		bulbasaur.chosePokemon();
		squirtle.chosePokemon();
		pidgey.chosePokemon();
		charmander.chosePokemon();
		buterfly.chosePokemon();
		
		
	}
	
	
	
	
	

}

class Pikachu {
	private String name; 
	private boolean chosen;
	
	public Pikachu() {
		this.name = "Pikachu";
		this.chosen = false;
	}
	
	
	public boolean setChosen(boolean chosen) {
		return this.chosen = chosen;
	}
	 
	public void chosePokemon() {
		if(chosen) {
		System.out.println(name + " I chose you");
		System.out.println("pika pika");
		chosen = false;
		}
	}
}

class Bulbasaur {
	private String name; 
	private boolean chosen;
	
	public Bulbasaur() {
		this.name = "Bulbasaur";
		this.chosen = false;
	}
	
	public boolean setChosen(boolean chosen) {
		return this.chosen = chosen;
	}
	
	public void chosePokemon() {
		if(chosen) {
		System.out.println(name + " I chose you");
		System.out.println("Bulbasaur");
		chosen = false;
		}
	}
}

class Squirtle {
	private String name; 
	private boolean chosen;
	
	public Squirtle() {
		this.name = "Squirtle";
		this.chosen = false;
	}
	
	public boolean setChosen(boolean chosen) {
		return this.chosen = chosen;
	}
	
	public void chosePokemon() {
		if(chosen) {
		System.out.println(name + " I chose you");
		System.out.println("Squirtle");
		chosen = false;
		}
	}
}

class Charmander {
	private String name; 
	private boolean chosen;
	
	public boolean setChosen(boolean chosen) {
		return this.chosen = chosen;
	}
	
	public Charmander() {
		this.name = "Charmander";
		this.chosen = false;
	}
	
	 
	public void chosePokemon() {
		if(chosen) {
		System.out.println(name + " I chose you");
		System.out.println("Charmander");
		chosen = false;
		}
	}
}

class Butterfly  {
	private String name; 
	private boolean chosen;
	
	public Butterfly() {
		this.name = "Butterfly";
		this.chosen = false;
	}
	
	public boolean setChosen(boolean chosen) {
		return this.chosen = chosen;
	}
	 
	public void chosePokemon() {
		if(chosen) {
		System.out.println(name + " I chose you");
		System.out.println("Butterfly");
		chosen = false;
		}
	}
}

class Pidgey {
	private String name; 
	private boolean chosen;
	
	public Pidgey() {
		this.name = "Pidgey";
		this.chosen = false;
	}
	
	public boolean setChosen(boolean chosen) {
		return this.chosen = chosen;
	}
	 
	public void chosePokemon() {
		if(chosen) {
		System.out.println(name + " I chose you");
		System.out.println("Pidgey");
		chosen = false;
		}
	}
}

