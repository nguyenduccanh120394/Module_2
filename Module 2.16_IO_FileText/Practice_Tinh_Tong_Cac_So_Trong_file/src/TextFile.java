import java.io.*;
import java.util.Scanner;

public class TextFile {
    public static void main(String[] args) throws IOException {
        FileWriter file = new FileWriter("Book");
            file.write(1);
            file.write("\r\n");
            file.write(1);
        File file1 = new File("Hello.txt");
        file1.createNewFile();
        file.close();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter File Path:");
        String filePath = scanner.nextLine();
           readFileText(filePath);
    }
    public static void  readFileText(String filePath) throws IOException {
        try {
            File file = new File(filePath);
            if (!file.exists()){
                throw new FileNotFoundException();
            }
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line = "";
            int sum = 0;
            while ((line= br.readLine())!=null){
                System.out.println(line);
                sum+=Integer.parseInt(line);
            }
            br.close();
            System.out.println("Tong = "+sum);
        }catch (IOException exception){
            System.out.println("Not found");
        }
    }
}
