package redditDataMining;

import java.util.ArrayList;

public class Movies {

	private ArrayList<Movie> movies;

	public Movies() {
		movies = new ArrayList<Movie>();
		addMovies(movies);
	}

	public void addMovies(ArrayList<Movie> movies) { // Change this to have data in a file, and one or two lines of code doing it
		movies.add(new Movie("The Dark Tower", null));
		movies.add(new Movie("Detroit", null));
		movies.add(new Movie("Kidnap", null));
		movies.add(new Movie("Columbus", null));
		movies.add(new Movie("Fun Mom Dinner", null));
		movies.add(new Movie("Step", null));
		movies.add(new Movie("Wind River", null));
		movies.add(new Movie("Annabelle: Creation", null));
		movies.add(new Movie("The Glass Castle", null));
		movies.add(new Movie("Good Time", null));
		movies.add(new Movie("Ingrid Goes West", null));
		movies.add(new Movie("The Nile Hilton Incident", null));
		movies.add(new Movie("The Only Living Boy in New York", null));
		movies.add(new Movie("Pilgrimage", null));
		movies.add(new Movie("The Trip to Spain", null));
		movies.add(new Movie("Whose Streets?", null));
		movies.add(new Movie("The Hitman's Bodyguard", null));
		movies.add(new Movie("Logan Lucky", null));
		movies.add(new Movie("6 Days", null));
		movies.add(new Movie("Crown Heights", null));
		movies.add(new Movie("Dave Made a Maze", null));
		movies.add(new Movie("Gook", null));
		movies.add(new Movie("Lemon", null));
		movies.add(new Movie("Patti Cake$", null));
		movies.add(new Movie("Birth of the Dragon", null));
		movies.add(new Movie("Leap!", null));
		movies.add(new Movie("Terminator 2 in 3D", null));
		movies.add(new Movie("Beach Rats", null));
		movies.add(new Movie("Bushwick", null));
		movies.add(new Movie("Polina", null));
		movies.add(new Movie("The Villainess", null));
		movies.add(new Movie("Close Encounters of the Third Kind", null));
		movies.add(new Movie("Tulip Fever", null));
		movies.add(new Movie("Goon: Last of the Enforcers", null));
		movies.add(new Movie("I Do... Until I Don't", null));
		movies.add(new Movie("The Layover", null));
		movies.add(new Movie("Unlocked", null));
		movies.add(new Movie("Viceroy's House", null));
		movies.add(new Movie("Home Again", null));
		movies.add(new Movie("It", null));
		movies.add(new Movie("The Limehouse Golem", null));
		movies.add(new Movie("Rebel in the Rye", null));
		movies.add(new Movie("School Life", null));
		movies.add(new Movie("Trophy", null));
		movies.add(new Movie("True to the Game", null));
		movies.add(new Movie("The Unknown Girl", null));
		movies.add(new Movie("American Assassin", null));
		movies.add(new Movie("mother!", null));
		movies.add(new Movie("Brad's Status", null));
		movies.add(new Movie("In Search of Fellini", null));
		movies.add(new Movie("Vengeance: A Love Story", null));
		movies.add(new Movie("The Wilde Wedding", null));
		movies.add(new Movie("Kingsman: The Golden Circle", null));
		movies.add(new Movie("The LEGO Ninjago Movie", null));
		movies.add(new Movie("Battle of the Sexes", null));
		movies.add(new Movie("The Force", null));
		movies.add(new Movie("Loving Vincent", null));
		movies.add(new Movie("Stronger", null));
		movies.add(new Movie("The Tiger Hunter", null));
		movies.add(new Movie("Victoria & Abdul", null));
		movies.add(new Movie("Woodshock", null));
		movies.add(new Movie("American Made", null));
		movies.add(new Movie("Flatliners", null));
		movies.add(new Movie("Chasing the Dragon", null));
		movies.add(new Movie("Literally, Right Before Aaron", null));
		movies.add(new Movie("Lucky", null));
		movies.add(new Movie("Mark Felt: The Man Who Brought Down the White House", null));
		movies.add(new Movie("Signature Move", null));
		movies.add(new Movie("Super Dark Times", null));
	}

	public ArrayList<Movie> getMovies() {
		return movies;
	}
}