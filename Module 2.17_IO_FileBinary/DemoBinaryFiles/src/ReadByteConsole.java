import java.io.IOException;
import java.io.InputStream;

public class ReadByteConsole {

    public static void main(String[] args) throws IOException {
        InputStream inputStream=System.in;
        while (true){
            System.out.println("Nhap 1 ky tu");
            int ch = inputStream.read();
            if (ch == 'q'){
                System.out.println("Finish!");
                break;
            }
            inputStream.skip(2);
            System.out.println("Ky tu nhan duoc: "+(char) ch);
        }
    }
}
