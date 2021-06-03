import javax.security.sasl.SaslClient;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PracticeReadFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter File Path");
        String filePath= scanner.nextLine();
        try {
            List<Integer>list=readFile(filePath);
            int max = findMax(list);
            System.out.println(max);
            FileWriter fileWriter = new FileWriter("FindMax.txt");
            fileWriter.write("Gia tri lon nhat la: " + max);
            fileWriter.close();
        } catch (IOException e) {
            System.out.println("Not file");
        }

    }
   public static List<Integer> readFile(String filePath) throws IOException{
        List<Integer> list=new ArrayList<>();
        FileReader file = new FileReader(filePath);
        BufferedReader bufferedReader = new BufferedReader(file);
        String line = null;
        while ((line=bufferedReader.readLine())!=null){
            list.add(Integer.parseInt(line));
        }
        bufferedReader.close();
        file.close();
        return list;
    }
    public static int findMax(List<Integer>list){
        int max=list.get(0);
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i)>max){
                max=list.get(i);
            }
        }
        return max;
    }
}
