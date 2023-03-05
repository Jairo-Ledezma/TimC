package inheritance;

public class Main {

	public static void main(String[] args) {
		
		Pokemon pokemon = new Pokemon ("pokemon" , "Electric" , 5);
		doPokemonStuff(pokemon , "slow");
		
		Pikachu pikachu = new Pikachu("pikachu","tbd" , 9 , "pointy" , "lighting");
		doPokemonStuff(pikachu,"slow");
		
		Magikarp magikarp = new Magikarp("magikarp" , 3.00 , 2 ,2);
		doPokemonStuff(magikarp , "fast");
		
	}
	
	public static void doPokemonStuff(Pokemon pokemon , String speed) {
		pokemon.MakeNoise();
		pokemon.move(speed);
		System.out.println(pokemon);
		System.out.println("__________");
		
	}

}
