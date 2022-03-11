import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){
        Person lukas = new Person ("Lukas", 25);
        Person david = new Person ("David", 25);
        Person lis = new Person ("Lisanne", 25);
        Person stefan = new Person ("Stefan", 25);
        Person andi = new Person ("Andi", 25);
        Person andreas = new Person ("Andreas", 25);
        Person mike = new Person ("Mike", 25);
        Person miles = new Person ("Miles", 25);
        Person daniela = new Person ("Daniela", 25);
        Person bernd = new Person ("Bernd", 25);
        File file = new File ("./person.txt");
        File team = new File ("./team.txt");

        //Write a person to a file
        PersonOutputStream.writer(lukas);

        //Read a person from a file
        try {
            PersonInputStream.reader(file);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        List<Person> seaTeam = new ArrayList<Person>();
        seaTeam.add(lukas);
        seaTeam.add(david);
        seaTeam.add(lis);
        seaTeam.add(stefan);
        seaTeam.add(andi);
        seaTeam.add(andreas);
        seaTeam.add(mike);
        seaTeam.add(miles);
        seaTeam.add(daniela);
        seaTeam.add(bernd);

        //Write Team to a file
        try {
            TeamOutputStream.teamWriter(seaTeam);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        //Read Team from a file
        try {
            TeamInputStream.teamReader(team);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
}