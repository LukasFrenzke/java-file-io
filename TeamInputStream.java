import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;


public class TeamInputStream {
    
    public static void teamReader(File name) throws IOException {
        FileReader fr = new FileReader(name);
        BufferedReader br = new BufferedReader(fr);

        String line;
        while((line = br.readLine())!=null){
            System.out.println(line);
        }
        br.close();
    }
}
