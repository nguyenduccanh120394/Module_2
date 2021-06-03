import java.util.ArrayList;
import java.util.List;
public class Student {
   private int id;
   private String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
    public static final int NUM_OF_ELEMENT = 5;

    public static void main(String[] args) {
        List <Student> students = new ArrayList<>();
        for (int i = 0; i < NUM_OF_ELEMENT; i++) {
            Student student = new Student(i,"My Name"+ i);
            students.add(student);
        }
        printData(students);
    }
    public static void printData(List<Student> students){
        for (Student student:students){
            System.out.println(student);
        }
        System.out.println("");
    }
}
