import entities.Author;
import entities.Movie;
import java.util.ArrayList;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Movie> movies = new ArrayList<>();

        while (true){
            System.out.println("1 - Register new movie");
            System.out.println("2 - Exit");
            System.out.println("Choose an option: ");

            int option = sc.nextInt();
            sc.nextLine();

            if (option == 1){
                System.out.println("Author name: ");
                String authorName = sc.nextLine();
                Author author = new Author(authorName);

                System.out.println("Movie title: ");
                String movieTitle = sc.nextLine();
                Movie movie = new Movie(movieTitle, author);

                movies.add(movie);
                System.out.println("Registered successfully!");

            } else if (option == 2) {
                break;
            }else{
                System.out.println("Invalid option. Try again.");
            }
        }

        System.out.println("\nRegistered movies: ");
        for (Movie movie : movies){
            System.out.println("Title: " + movie.getTitle());
            System.out.println("Author: " + movie.getAuthor().getName());
            System.out.println("=====================");
        }

        sc.close();

    }
}