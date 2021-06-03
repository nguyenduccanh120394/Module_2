import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class InputStreamExample2 {
    public static void main(String[] args) throws IOException {
        FileInputStream inputStream = new FileInputStream("CodeGym.txt");
        byte[] bytes =new byte[10];
        int i =-1;
        while ((i=inputStream.read(bytes))!=-1){
            String s = new String(bytes,0,i);
            System.out.println(s);
        }
        inputStream.close();
    }
}
