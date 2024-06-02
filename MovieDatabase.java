import java.util.ArrayList;
import java.util.List;

public class MovieDatabase {
    private List<Movie1> movies;

    public MovieDatabase() {
        this.movies = new ArrayList<Movie1>();
    }

    public void addMovie(Movie1 movie) {
        movies.add(movie);
    }

    public Movie1 searchMovie(String title) {
        for (Movie1 movie : movies) {
            if (movie.getTitle().equalsIgnoreCase(title)) {
                return movie;
            }
        }
        return null;
    }

    public List<Movie1> getAllMovies() {
        return new ArrayList<Movie1>(movies);
    }
}
