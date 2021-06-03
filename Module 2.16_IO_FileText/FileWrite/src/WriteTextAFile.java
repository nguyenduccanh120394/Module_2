import java.io.*;

public class WriteTextAFile {
    public static void main(String[] args) throws IOException {
        FileWriter file = new FileWriter("WriteFile.txt");
        file.write("Hello World 12345+@#$%^&48!");
        FileReader fileReader = new FileReader("WriteFile.txt");
        BufferedReader reader = new BufferedReader(fileReader);
        file.close();
        String line = null;
        while ((line=reader.readLine())!=null){
            System.out.println(line);
        }
        reader.close();
    }
}
