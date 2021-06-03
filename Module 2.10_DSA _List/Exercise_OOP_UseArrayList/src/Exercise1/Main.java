package Exercise1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
public class Main {
    public static void main(String[] args) {
          List<Officer> list = new ArrayList<>();
          OfficerManagement officerManagement = new OfficerManagement();
          Officer officer1 = new Engineer("Canh",15,"nam","Ha Noi","CNTT");
          Officer officer2 = new Staff("Bình",18,"Nam","Ha Noi",1);
          Officer officer3 = new Worker("Nam",100,"Nữ","Ha Noi",3);
          Officer officer4 = new Engineer("Canh",15,"nam","Ha Noi","CNTT");
          Officer officer5 = new Staff("Bình",18,"Nam","Ha Noi",2);
          list.add(officer1);
          list.add(officer2);
          list.add(officer3);
          list.add(officer4);
          list.add(officer5);
          officerManagement.printData(list);
          officerManagement.searchOfficerByName(list,"Nam");
        }
    }


