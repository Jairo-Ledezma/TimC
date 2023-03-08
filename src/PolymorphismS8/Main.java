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
		while (true) {
			System.out.println("Enter type (A for adventure, R for romantic , S for science fiction, or Q to quit )");
			String type = s.nextLine();
			if("Qq".contains(type)){
				System.out.println("Closing algorithm....");
				System.out.println("Closed");
				break;
			}
			System.out.println("Enter Movie Title");
			String name = s.nextLine();
			Movie movie = Movie.getMovie(type, name);
			movie.watchMovie();
		}
		
		
	}
	
	

}
