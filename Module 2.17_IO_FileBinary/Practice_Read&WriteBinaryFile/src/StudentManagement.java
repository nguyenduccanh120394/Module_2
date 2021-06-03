import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class StudentManagement  {
    List<Student> list = new ArrayList<>();

    public StudentManagement(){
    }
    public void writetoFile(String path, List<Student>list) throws FileNotFoundException,IOException{
        FileOutputStream fis = null;
        ObjectOutputStream ois = null;
        try {
            fis = new FileOutputStream(path);
            ois = new ObjectOutputStream(fis);
            ois.writeObject(list);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                ois.close();
                fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    public List<Student> readToFile(String path){
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        try {
            fis = new FileInputStream(path);
            ois = new ObjectInputStream(fis);
            List<Student>list=(List<Student>)ois.readObject();
            System.out.println(list);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return list;
    }

}