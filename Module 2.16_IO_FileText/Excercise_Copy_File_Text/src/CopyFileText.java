import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CopyFileText {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Enter file path");
        String filePath = scanner.nextLine();
        try {
            List<String>list=readFile(filePath);
            System.out.println(list);
            writeFile(filePath,list);
        } catch (IOException exception) {
            System.out.println("Not Found");;
        }
    }
    static List<String> readFile(String filePath)throws IOException {
        List<String> list= new ArrayList<>();
        FileReader fileReader = new FileReader(filePath);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String line = null;
        while ((line=bufferedReader.readLine())!=null){
            list.add(line);
        }
        return list;
    }
    static void writeFile(String filePath,List<String>list)throws IOException{

        try {
            FileWriter fileWriter = new FileWriter("Hello.txt");
            for (int i = 0; i < list.size(); i++) {
                fileWriter.write(list.get(i)+"\n");
            }
            fileWriter.close();
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }
}
