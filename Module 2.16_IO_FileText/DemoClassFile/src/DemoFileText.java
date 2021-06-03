import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class DemoFileText {
    public static void main(String[] args) throws IOException {
        File file = new File("Hello.txt");
        file.createNewFile();
        System.out.println("Path exit"+file.exists());
        if (file.exists()){
            System.out.println("File can write:"+file.canWrite());

        }
    }
}
