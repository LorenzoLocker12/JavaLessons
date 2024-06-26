import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);


        while (true) {
            System.out.println("Type the inital letter of the type of the film (H for horror) and (C for comedy) or (Q " +
                    "to quit): ");
            String type = s.nextLine();
            if("Qq".contains(type)) {
                break;
            }
            System.out.println("Type the title of the film: ");
            String title = s.nextLine();

            Movie userMovie = Movie.getMovie(title, type);
            userMovie.watchMovie();

            System.out.println("-------------------");

        }


//        Movie theMovie = new Horror("Chuck");
//        theMovie.watchMovie();
//
//        Movie comedy = new Comedy("Everybody hates Chris");
//        comedy.watchMovie();
//
//        Movie test1 = Movie.getMovie("The haunted Manor", "horror");
//        test1.watchMovie();
//
//        Movie test2 = Movie.getMovie("Comedy film idk", "comedy");
//        test2.watchMovie();

    }
}