import java.util.ArrayList;
import java.io.File;
import java.io.IOException;
import java.io.FileWriter;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ArrayList<SimpleMovie> movies = MovieDatabaseBuilder.getMovieDB("src/movie_data");
        /*
        for (SimpleMovie movie : movies) {
            System.out.println(movie);
        }
        System.out.println("Number of movies: " + movies.size());
        Scanner s = new Scanner(System.in);
        System.out.println("Enter an actor/actress name: ");
        String target = s.nextLine();

        */

        ArrayList<String> names = new ArrayList<String>();
        for(SimpleMovie movie : movies){
            if(movie.getActors().contains("Kevin Bacon")){
                names.add(String.valueOf(movie.getActors()));
            }
        }

        try {
            File f = new File("src/kbactors.txt");
            f.createNewFile();
            FileWriter fw = new FileWriter(f);
            for (String n : names) {
                String[] actorList = n.split(",");

                fw.write(actorList + "\n");
            }
            fw.close();
        }
        catch (IOException ioe) {
            System.out.println("Writing file failed");
            System.out.println(ioe);
        }
    }
}