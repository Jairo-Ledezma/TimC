package PolymorphismS8;

public class Movie {

	private String title;

	public Movie(String title) {
		this.title = title;
	}

	public void watchMovie() {
		String instanceType = this.getClass().getSimpleName(); // using this points to the current class, getClass
																// method grabs the current class and offers some
																// methods, getSimpleName method will return the name of
																// the class
		System.out.println(title + " is a " + instanceType + " film");
	}
	
	public static Movie getMovie(String type, String title) {

		return switch (type.toUpperCase().charAt(0)) {
		case 'A' -> new Adventure(title);
		case 'R' -> new Romantic(title);
		case 'S' -> new ScienceFiction(title);
		default -> new Movie(title);

		};
	}

}

class Adventure extends Movie {

	public Adventure(String title) {
		super(title);

	}

	@Override
	public void watchMovie() {

		super.watchMovie();
		System.out.printf(".. %s%n".repeat(3),
				"Dinasaurs get loose on an island",
				"there are people eaten by them",
				"Some survivors escape");
	}

}

class Romantic extends Movie {

	public Romantic(String title) {
		super(title);

	}

	@Override
	public void watchMovie() {

		super.watchMovie();
		System.out.printf(".. %s%n".repeat(3),
				"there is a youg murmaid",
				"falls in love with a human prince",
				"fight against the witch and live hapily ever after");
	}

}

class ScienceFiction extends Movie {

	public ScienceFiction(String title) {
		super(title);

	}

	@Override
	public void watchMovie() {

		super.watchMovie();
		System.out.printf(".. %s%n".repeat(3),
				"Bad Aliens do Bad Stuff",
				"Space guys chase Alliens",
				"Planet blows up");
	}

}
