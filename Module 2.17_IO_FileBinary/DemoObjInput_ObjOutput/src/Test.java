import java.io.IOException;

public class Test {
    public static void main(String[] args) {
        FileObject fileObject = new FileObject();
        Product product = new Product(1, "IPhone 12", 2800000, "New");
        try {
            fileObject.writeObject("demo.dat",product);
            product = fileObject.readObject("demo.dat");
            System.out.println(product);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
