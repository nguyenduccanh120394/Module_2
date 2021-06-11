import java.util.ArrayList;
import java.util.List;

public class StaffManagement {
    private static final String MISSION_CINEMA_STAFF = "Cinema Staff";
    private static final String MISSION_TICKER_SELLER = "Ticker Seller";
     FileMangement fileMangement = new FileMangement();
     List<Staff>listStaff ;
    public StaffManagement(){
        try {
            listStaff = fileMangement.readFromFileStaff("dataStaff.csv");
        }catch (Exception e){
            listStaff = new ArrayList<>();
        }
    }
    public List<Staff> getListStaff(){
        return listStaff;
    }
    public void add(Staff staff){
        listStaff.add(staff);
        fileMangement.writeToFileStaff("dataStaff.csv", listStaff);
    }
    public void disPlay(){
        for (int i = 0; i < listStaff.size(); i++) {
            System.out.println(listStaff.get(i));
        }
    }
    public List<Staff> getListStaffCinemaRoom(List<Staff>listStaff){
        List<Staff>listStaffCinemaRoom = new ArrayList<>();
        for (int i = 0; i < listStaff.size(); i++) {
            if (listStaff.get(i).getMission().equals("Cinema Staff")){
                listStaffCinemaRoom.add( listStaff.get(i));
            }
        }
        return listStaffCinemaRoom;
    }

}
