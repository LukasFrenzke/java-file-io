import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class TeamOutputStream {

    public static void teamWriter(List<Person> name) throws IOException{
        File file = new File("team.txt");

        FileWriter fw = new FileWriter(file);
        for(Person person : name){
        try {
            fw.write(person.getFirstname());
            fw.write(" ");
            fw.write(Integer.toString(person.getAge()));
            fw.write("\n");
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
        fw.close();
    }
}
