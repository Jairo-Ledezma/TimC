package PolymorphismS8;

public class NextMain {

	public static void main(String[] args) {
		/*Movie movie = Movie.getMovie("Adventure", "Jaws");
		movie.watchMovie();
		Adventure jaws = (Adventure) Movie.getMovie("A", "Jaws");
		jaws.watchMovie();
		
		Object romantic = Movie.getMovie("r", "Airplane");
		Romantic romanticMovie = (Romantic) romantic;
		romanticMovie.watchRomantic();
		
		var laSirenita = Movie.getMovie("R", "La sirenita");
		laSirenita.watchMovie();
		
		var plane = new Romantic("La sirenita");
		plane.watchRomantic();*/
		
		Object unknownObject = Movie.getMovie("r", "Ariplane");
		
		if (unknownObject.getClass().getSimpleName().equals("Romantic")){
			Romantic r =(Romantic) unknownObject;
			r.watchRomantic();
		}else if (unknownObject instanceof Adventure ) {
			((Adventure)unknownObject).watchAdventure();
		}else if (unknownObject instanceof ScienceFiction sify) {
			sify.watchScifi();
		}
		
		

	}

}
