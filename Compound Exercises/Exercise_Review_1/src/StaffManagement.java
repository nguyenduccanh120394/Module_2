import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StaffManagement {
    List<Staff>staffList= null;

    public StaffManagement(){
        staffList=new ArrayList<>();
    }
    public void addStaff(Staff staff){
        staffList.add(staff);
    }
    public void displayList(){
        for (Staff item:staffList){
            System.out.println(item);
        }
    }
    public void displayIndex(int index){
        for (int i = 0; i < staffList.size(); i++) {
            System.out.println(staffList.get(index));
            break;
        }
    }
    public int searchById(int id){
        for (int i = 0; i < staffList.size(); i++) {
            if (staffList.get(i).getId()==id){
                return i;
            }
        }
        return -1;
    }
    public List<Staff> searchByName(String name ){
        List<Staff>list=new ArrayList<>();
        for (int i = 0; i < staffList.size(); i++) {
            if (staffList.get(i).getName().contains(name)){
                list.add(staffList.get(i));
            }
        }
        return list;
    }
    public void displayListName(List<Staff>listName){
        if (listName.size()==0){
            System.out.println("Not Found");
        }else {
            for (int i = 0; i < listName.size(); i++) {
                System.out.println(listName.get(i));
            }
        }

    }
    public void delete(int id){
        staffList.remove(id);
    }
    public void edit(int id ,Staff staff ){
        int index = searchById(id);
        if (index == -1) {
            System.out.println("Not Found");
        }else {
            staffList.set(index,staff);
        }
    }
    public int searchByEmail(String email){
        for (int i = 0; i < staffList.size(); i++) {
            if (staffList.get(i).getEmail().contains(email)){
                return i;
            }
        }
        return -1;
    }
    public List<Developer> displayDevList(){
        List<Developer>developers= new ArrayList<>();
        for (int i = 0; i < staffList.size(); i++) {
            if (staffList.get(i)instanceof Developer ){
                developers.add((Developer) staffList.get(i));
            }
        }
        return developers;
    }
    public List<Tester> displayTesterList(){
        List<Tester>testerList= new ArrayList<>();
        for (int i = 0; i < staffList.size(); i++) {
            if (staffList.get(i)instanceof Tester){
                testerList.add((Tester) staffList.get(i));
            }
        }
        return testerList;
    }
    public void displaySalaryDev(){
        List<Developer>listSalaryDev=displayDevList();
        int toTalSalary=0;
        int aveSalaryDev;
        for (int i = 0; i < listSalaryDev.size(); i++) {
            toTalSalary+=listSalaryDev.get(i).getSalaryDev();
        }
        aveSalaryDev=toTalSalary/listSalaryDev.size();
        for (int i = 0; i < listSalaryDev.size(); i++) {
            if (listSalaryDev.get(i).getSalaryDev()<aveSalaryDev){
                System.out.println(listSalaryDev.get(i));
            }
        }
    }

}