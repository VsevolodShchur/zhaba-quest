import java.io.FileReader;
import java.util.Scanner;

public class FileWorker{
    public static String read(String fileName) throws Exception {

        FileReader fr= new FileReader("file1.txt");
        Scanner scan = new Scanner(fr);
        StringBuilder sb =  new StringBuilder();

        while (scan.hasNextLine()) {
            sb.append(scan.nextLine());
        }

        fr.close();

        return sb.toString();
    }
}
