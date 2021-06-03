import java.io.*;

public class FileObject {
    public void writeObject(String path, Product product)throws IOException {
        FileOutputStream fos = null;
        ObjectOutputStream os = null;
        try {
           fos = new FileOutputStream(path);
           os = new ObjectOutputStream(fos);
           os.writeObject(product);
           os.flush();
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            os.close();
        }
        System.out.println("success!");

    }
    public Product readObject(String path)throws IOException{
        FileInputStream fis= null;
        ObjectInputStream ois = null;
        Product product = null;
        try {
            fis = new FileInputStream(path);
            ois = new ObjectInputStream(fis);
            product = (Product) ois.readObject();
            System.out.println(product);
        }catch (IOException | ClassNotFoundException e ){
            e.printStackTrace();
        }
        return product;
    }
}
