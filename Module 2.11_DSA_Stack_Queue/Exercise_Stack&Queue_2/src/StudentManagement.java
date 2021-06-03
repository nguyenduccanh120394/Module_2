import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class StudentManagement {
    Stack<Student>stack= null;
    public StudentManagement(){
        stack=new Stack<>();
    }
    public void adD(Student student){
        stack.push(student);
    }
    public void disPlay(){
        for (Student item:stack){
            System.out.println(item);
        }
    }
    public int find(String name , List<Integer> list){
        list=new ArrayList<>();
        for (int i = 0; i < stack.size(); i++) {
            if (stack.get(i).getName().equals(name)){
                    list.add(i);
            }
        }
    return -1;
    }
}
