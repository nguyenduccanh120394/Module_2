import java.io.*;
import java.nio.Buffer;
import java.util.Scanner;

public class Demo_WriteATextFile2 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter str");
        String str = scanner.nextLine();
        try {
            FileWriter writer = new FileWriter("Hello2.txt");
            writer.write(str);
            writer.close();
            FileReader fileReader = new FileReader("Hello2.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String[] results = str.split(",");
            for (String item : results){
                System.out.print(item+" ");
            }

        }catch (IOException exception){
            System.out.println(exception.getMessage());
        }
    }
}

