import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        StudentManagement studentManagement = new StudentManagement();
        studentManagement.adD(new Student("Canh",18));
        studentManagement.adD(new Student("Nam",19));
        studentManagement.adD(new Student("Long",16));
        studentManagement.adD(new Student("Long",14));
        studentManagement.disPlay();
        List<Integer>index= new ArrayList<>();
        studentManagement.find("Long", index);
        System.out.println(index);
    }
}
