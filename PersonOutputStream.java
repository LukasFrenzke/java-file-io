import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


public class PersonOutputStream{

    public static void writer(Person name){
        File file = new File("person.txt");

        FileWriter fw;
        try {
            fw = new FileWriter(file);
            fw.write(name.getFirstname());
            fw.write(" ");
            fw.write(Integer.toString(name.getAge()));
            fw.write("\n");
            fw.close();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

}