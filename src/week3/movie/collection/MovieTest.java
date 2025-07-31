package week3.movie.collection;

import java.util.*;

/**
 * @author Hacer Nur YAVAŞ - 1 August 2025
 * <p>
 * This program creates a movie collection and performs:
 * - Sorting by release year (ascending)
 * - Sorting by IMDb rating (descending)
 * - Filtering movies by genre (entered by the user)
 */

public class MovieTest {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // Create a list of movies
        List<Movie> movies = new ArrayList<>(5);

        movies.add(new Movie("The Lord of the Rings: The Fellowship of the Ring", 2001, "Fantasy", 8.9));
        movies.add(new Movie("The Dark Knight", 2008, "Action, Crime, Drama", 9.1));
        movies.add(new Movie("Interstellar", 2014, "Adventure, Drama, Sci-Fi", 8.7));
        movies.add(new Movie("The Lord of the Rings: The Return of the King", 2003, "Fantasy", 9.0));
        movies.add(new Movie("Star Wars: Episode V - The Empire Strikes Back", 1980, "Action, Adventure, Fantasy, Sci-Fi", 8.7));

        displayAllMovies(movies);
        sortByReleaseYear(movies);
        sortByImdbRatingDescending(movies);

        // Ask user for genre input and filter
        System.out.print("Enter a genre to filter by: ");
        String genre = scanner.nextLine();
        filterByGenre(movies, genre);

    }

    // Display all movies
    private static void displayAllMovies(List<Movie> movies) {
        for (Movie m : movies) {
            System.out.println(m);
        }
    }

    // Sort by release year (ascending)
    private static void sortByReleaseYear(List<Movie> movies) {
        movies.sort(Comparator.comparing(Movie::getReleaseYear));
        /**
         *  movies listesinin orijinal sırası değişir.
         * Bellekte yeni bir liste oluşturmaz.
         * Daha hızlıdır çünkü yeni bir koleksiyon oluşturmaz.
         */

        // Alternative using stream (commented out):
        /*movies.stream()
                .sorted(Comparator.comparingInt(Movie::getReleaseYear))
                .forEach(System.out::println);

        sortedMovies = movies.stream()
                .sorted(Comparator.comparing(Movie::getReleaseYear))
                .collect(Collectors.toList());*/
        /**
         * Orijinal movies listesi değişmez, sadece sıralanmış bir kopyası döner.
         * Daha işlevseldir (filter, map, limit gibi zincirleme işlemlerle birlikte kullanılabilir).
         * Birden fazla sıralama, filtreleme işlemini zincirleme yapmana izin verir.
         */

        System.out.println("\n==================== Movies Sorted by Release Year (Ascending) ====================");
        for (Movie m : movies) {
            System.out.println(m);
        }
    }

    // Sort by IMDb rating (descending)
    private static void sortByImdbRatingDescending(List<Movie> movies){
        movies.sort(Comparator.comparing(Movie::getImdbRating).reversed());
        System.out.println("\n==================== Movies Sorted by IMDb Rating (Descending) ====================");
        for (Movie m : movies) {
            System.out.println(m);
        }
    }

    /**
     * Filters and prints movies that match the given genre.
     * The match is case-insensitive and works with multi-genre strings.
     *
     * @param movies List of movies to search
     * @param genre  The genre to filter by
     */
    private static void filterByGenre(List<Movie> movies, String genre) {
        System.out.println("\n==================== Movies Matching Genre: '" + genre + "' ====================");
        boolean found = false;
        for (Movie m : movies) {
            if (m.getGenre().toLowerCase().contains(genre.toLowerCase())) {
                System.out.println(m);
                found = true;
            }
        }
        if (!found) {
            System.out.println("No movies found for genre: " + genre);
        }
    }
}
