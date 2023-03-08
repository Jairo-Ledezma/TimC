package PolymorphismS8;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/*Movie theMovie = new Movie("Jurassic Park");
		theMovie.watchMovie();
		System.out.println(".".repeat(50));
		
		
		Movie adv = new Adventure("Star Wars");
		adv.watchMovie();
		System.out.println(".".repeat(50));
		
		Movie sciFi = new ScienceFiction("Jurassic World");
		sciFi.watchMovie();
		System.out.println(".".repeat(50));
		Movie com = new Comedy("Jurassic World");
		com.watchMovie();
		System.out.println(".".repeat(50));*/
		Scanner s = new Scanner(System.in);
		System.out.println("Please type in the type of the movie");
		String type = s.nextLine();
		System.out.println("Please type in the name of the movie");
		String name = s.nextLine();
		Movie theMovie = Movie.getMovie(type , name
				);
		theMovie.watchMovie();
		
		
	}

}
