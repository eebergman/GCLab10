import java.util.ArrayList;
import java.util.Scanner;

public class MovieApp {
	public static void main(String[] args) {

		System.out.println("Hello and welcome to the Movie List Application.");
		beginHere();
	}

	public static void beginHere() {
		Scanner sc = new Scanner(System.in);
		ArrayList<Movie> movieList = new ArrayList<Movie>();
		String[] genresOChoice = { "Animated", "Comedy", "Drama", "Horror", "Musicial", "Sci-fi" };

		for (int i = 1; i <= 100; i++) {
			movieList.add(i - 1, Movie.getMovie(i));
		}

		System.out.println("Please enter the genre you wish to list the movies of.");
		for (int i = 0; i < genresOChoice.length; i++) {
			System.out.println("Press " + i + " for " + genresOChoice[i]);
		}

		// String userChoice = sc.nextLine();

		sc.close();
	}

	public static void secondMethod() {

	}

	// public enum userGenreSelection() {
	//
	// }
}
