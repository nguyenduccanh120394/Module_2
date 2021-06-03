import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class StudentManagement {
    List<Student>list;
    FileMangement fileMangement = new FileMangement();
    Scanner scanner = new Scanner(System.in);
    public StudentManagement(){
        try {
            this.list = fileMangement.readFromFile("data.csv");
        }catch (IndexOutOfBoundsException e){
            this.list=new ArrayList<>();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public List<Student> getList(){
        return list;
    }
    public void add(Student student){
        list.add(student);
        fileMangement.writeToFile("data.csv",list);
    }
    public void disPlay(){
        for (Student item:list){
            System.out.println(item);
        }
    }
    public int findById(String id){
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId().equals(id)){
                return i;
            }
        }
        return -1;
    }
    public void disPlay(int index){
        if (index!=-1){
            System.out.println(list.get(index));
    }else {
            System.out.println("Not Found");
        }
    }
    public void editById(String id){
        ValidateCheck validateCheck = new ValidateCheck();
        int index = findById(id);
        if (index == -1) {
            System.out.println("Not Found");
        }else {
            Student student = validateCheck.input();
            list.set(index,student);
            fileMangement.writeToFile("data.csv",list);
        }
    }
    public List<Student> deleteById(String id){
        List<Student>trash=new ArrayList<>();
        int index = findById(id);
        if (index==-1){
            System.out.println("Not Found");
        }else {
            trash.add(list.get(index));
            list.remove(index);
            fileMangement.writeToFile("data.csv",list);
            }
        return trash;
    }
    public void sort(){
        Collections.sort(list);
    }
    public void searchAboutAge(int abountThis, int aboutThat){
        List<Student>listAge= new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (abountThis<=list.get(i).getAge()&&list.get(i).getAge()<=aboutThat){
                System.out.println(list.get(i));
            }
        }
    }
}

