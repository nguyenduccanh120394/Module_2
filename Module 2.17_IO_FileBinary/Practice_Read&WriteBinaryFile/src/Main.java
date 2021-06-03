import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        StudentManagement studentManagement= new StudentManagement();
        List<Student>list = new ArrayList<>();
        Student student1 = new Student(1,"Nam","Ha Noi");
        Student student2 = new Student(2,"Long","Ha Noi");
        Student student3 = new Student(3,"Lam","Ha Noi");
        Student student4 = new Student(4,"Bao","Ha Noi");
        list.add(student1);
        list.add(student2);
        list.add(student3);
        list.add(student4);
        try {
            studentManagement.writetoFile("test.dat",list);
           list= studentManagement.readToFile("test.dat");
           for (Student item : list){
               System.out.println(item);
           }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
