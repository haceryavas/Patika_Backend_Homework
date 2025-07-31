package week3.movie.collection;
/**
 * The Movie class represents a movie with basic information such as
 * title, release year, genre, and IMDb rating.
 * It provides getter and setter methods for each field,
 * and a formatted toString method for printing movie details.
 */
public class Movie {
    private String movieTitle;     // The title of the movie
    private int releaseYear;       // The year the movie was released
    private String genre;          // The genre(s) of the movie
    private double imdbRating;     // The IMDb rating of the movie

    /**
     * Constructor to create a Movie object with given properties.
     */
    public Movie(String movieTitle, int releaseYear, String genre, double imdbRating) {
        this.movieTitle = movieTitle;
        this.releaseYear = releaseYear;
        this.genre = genre;
        this.imdbRating = imdbRating;
    }

    /**
     * Returns a formatted string representation of the movie object.
     */
    @Override
    public String toString() {
        return "Movie { " +
                "movieTitle = '" + movieTitle + '\'' +
                ", releaseYear = " + releaseYear +
                ", genre = '" + genre + '\'' +
                ", imdbRating = " + imdbRating +
                '}';
    }

    // Getters and Setters
    public String getMovieTitle() {
        return movieTitle;
    }

    public void setMovieTitle(String movieTitle) {
        this.movieTitle = movieTitle;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public double getImdbRating() {
        return imdbRating;
    }

    public void setImdbRating(double imdbRating) {
        this.imdbRating = imdbRating;
    }
}
