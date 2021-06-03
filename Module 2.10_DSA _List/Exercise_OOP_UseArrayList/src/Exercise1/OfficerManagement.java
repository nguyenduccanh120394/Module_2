package Exercise1;

import java.util.ArrayList;
import java.util.List;

public class OfficerManagement {
    private List<Officer> officers;

    public OfficerManagement() {
        this.officers = new ArrayList<>();
    }

    public void add(Officer officer) {
        this.officers.add(officer);
    }

    public List<Officer> getOfficers() {
        return officers;
    }

    public void printData(List<Officer> officers) {
        for (Officer item : officers) {
            System.out.println(item);
        }
    }
    public void searchOfficerByName(List<Officer> officers,String gender) {
        for (int i = 0; i < officers.size(); i++) {
            if (officers.get(i).getGender().equals(gender)){
                System.out.print("Vị trí "+i+" is ");
                System.out.println(officers.get(i));
            }
    }
}
}
