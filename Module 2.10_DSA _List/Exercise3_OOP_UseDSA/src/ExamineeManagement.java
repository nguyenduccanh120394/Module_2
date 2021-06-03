import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
public class ExamineeManagement {
    List<Examinee> examinees = null;
    Scanner scanner = new Scanner(System.in);

    public ExamineeManagement(){
        examinees= new ArrayList<>();
    }

    public void addE(Examinee examinee){
        examinees.add(examinee);
    }

    public void disPlay(){
        for (Examinee item : examinees){
            System.out.println(item.toString());
        }
    }
    public void disPlay(int index){
        for (int i = 0; i < examinees.size(); i++) {
            System.out.println(examinees.get(index));
            break;
        }
    }

    public int findBySBD(int SBD){
        for (int i = 0; i < examinees.size(); i++) {
            if (examinees.get(i).getSBD()==SBD){
                return i;
            }
        }
        return -1;
    }
    public void findByName(String name){
        for (int i = 0; i < examinees.size(); i++) {
            if (examinees.get(i).getName().equals(name)){
                System.out.println(examinees.get(i));
            }
        }
    }
    public void delete(int SBD){
        examinees.remove(SBD);
    }
    public void edit(int SBD,Examinee examinee){
        int index=findBySBD(SBD);
        if (index==-1){
            System.out.println("Not Found");
        }else {
            examinees.set(index,examinee);
        }
    }
    public void sort(){
        Collections.sort(examinees);
    }


}
