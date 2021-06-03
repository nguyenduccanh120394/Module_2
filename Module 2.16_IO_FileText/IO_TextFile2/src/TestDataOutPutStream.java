import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestDataOutPutStream {
    public static void main(String[] args) {
        int [] a ={2,3,5,7,11};
        try {
            FileOutputStream fout = new FileOutputStream(args[0]);
            DataOutputStream dout = new DataOutputStream(fout);
            while (true){
                System.out.println(dout.());
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
