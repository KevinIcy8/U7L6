import java.util.ArrayList;
import java.io.File;
import java.io.IOException;
import java.io.FileWriter;

public class KBActors {
    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<String>();

        names.add("Person1");
        names.add("Person2");
        names.add("Person3");
        names.add("Person4");
        names.add("Person5");
        try {
            File f = new File("src/kbactors.txt");
            f.createNewFile();
            FileWriter fw = new FileWriter(f);
            for (String n : names) {
                fw.write(n + "\n");
            }
            fw.close();
        }
        catch (IOException ioe) {
            System.out.println("Writing file failed");
            System.out.println(ioe);
        }


    }
}
