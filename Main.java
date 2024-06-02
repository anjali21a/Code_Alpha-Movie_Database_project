import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        MovieDatabase movieDatabase = new MovieDatabase();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Movie Database");
            System.out.println("1. Add a new movie");
            System.out.println("2. Search for a movie");
            System.out.println("3. Display all movies");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter movie title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter director: ");
                    String director = scanner.nextLine();
                    System.out.print("Enter year: ");
                    int year = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    System.out.print("Enter genre: ");
                    String genre = scanner.nextLine();
                    Movie1 movie = new Movie1(title, director, year, genre);
                    movieDatabase.addMovie(movie);
                    System.out.println("Movie added successfully!");
                    break;
                case 2:
                    System.out.print("Enter movie title to search: ");
                    String searchTitle = scanner.nextLine();
                    Movie1 foundMovie = movieDatabase.searchMovie(searchTitle);
                    if (foundMovie != null) {
                        System.out.println("Movie found: " + foundMovie);
                    } else {
                        System.out.println("Movie not found.");
                    }
                    break;
                case 3:
                    System.out.println("Movies in database:");
                    for (Movie1 m : movieDatabase.getAllMovies()) {
                        System.out.println(m);
                    }
                    break;
                case 4:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice, please try again.");
            }
        } while (choice != 4);

        scanner.close();
    }
}
