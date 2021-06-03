import java.io.*;
import java.nio.Buffer;
import java.util.Scanner;

public class Demo_WriteATextFile {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter str");
        String str = scanner.nextLine();
        try {
            FileWriter writer = new FileWriter("Hello.txt");
            writer.write(str);
            writer.close();
            FileReader fileReader = new FileReader("Hello.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = null;
            while ((line = bufferedReader.readLine())!=null){
                System.out.println("trong file co:");
                System.out.println(line);
            }
            bufferedReader.close();
        }catch (IOException exception){
            System.out.println(exception.getMessage());
        }
    }
}
