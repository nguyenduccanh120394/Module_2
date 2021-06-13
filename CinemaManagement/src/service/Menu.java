package service;

import model.Staff;

import java.util.List;

public class Menu {
    public static void menuCustomer(){
        String leftAlignFormat = "| %-25s | %-7d |%n";
        System.out.format("+-------------------------------------+%n");
        System.out.format("|              MENU MEMBER            |%n");
        System.out.format("+---------------------------+---------+%n");
        System.out.format("| Function                  |Selection|%n");
        System.out.format("+---------------------------+---------+%n");
        System.out.format(leftAlignFormat,"SEARCH",1);
        System.out.format(leftAlignFormat,"ADD TO CART",2);
        System.out.format(leftAlignFormat,"DEL FR CART",3);
        System.out.format(leftAlignFormat,"PAY",4);
        System.out.format("+---------------------------+---------+%n");
    }
    public static void menuNonMember(){
        String leftAlignFormat = "| %-25s | %-7d |%n";
        System.out.format("+-------------------------------------+%n");
        System.out.format("|            MENU NON-MEMBER          |%n");
        System.out.format("+---------------------------+---------+%n");
        System.out.format("| Function                  |Selection|%n");
        System.out.format("+---------------------------+---------+%n");
        System.out.format(leftAlignFormat,"SEARCH",1);
        System.out.format(leftAlignFormat,"DISPLAY",2);
        System.out.format(leftAlignFormat,"LOGIN",3);
        System.out.format(leftAlignFormat,"REGISTER",4);
        System.out.format("+---------------------------+---------+%n");
    }
    public void startMenu(){
        String leftAlignFormat = "[ %-25s | %-7d ]%n";
        System.out.format("+-------------------------------------+%n");
        System.out.format("|             CINEMA CENTER           |%n");
        System.out.format("+---------------------------+---------+%n");
        System.out.format("| Function                  |Selection|%n");
        System.out.format("+---------------------------+---------+%n");
        System.out.format(leftAlignFormat,"Create new account",1);
        System.out.format(leftAlignFormat,"Login",2);
        System.out.format(leftAlignFormat,"Skip",3);
        System.out.format("+---------------------------+---------+%n");
    }
    public void menuRegister(){
        String leftAlignFormat = "| %-35s |%n";
        System.out.format("+-------------------------------------+%n");
        System.out.format(leftAlignFormat,"REGISTER");
        System.out.format("+-------------------------------------+%n");
    }
    public void menuLogin(){
        String leftAlignFormat = "| %-35s |%n";
        System.out.format("+-------------------------------------+%n");
        System.out.format(leftAlignFormat,"LOGIN");
        System.out.format("+-------------------------------------+%n");
    }
    public void menuInputFilm(){
        String leftAlignFormat = "| %-25s |%n";
        System.out.format("+~~~~~~~~~~~~~~~~~~~~~~~~~~~+%n");
        System.out.format(leftAlignFormat,"Input Film:");
        System.out.format("+~~~~~~~~~~~~~~~~~~~~~~~~~~~+%n");
    }
    public void menuCountry(){
        String leftAlignFormat = "| %-25s | %-7d |%n";
        System.out.format("+-------------------------------------+%n");
        System.out.format("|               COUNTRY               |%n");
        System.out.format("+---------------------------+---------+%n");
        System.out.format("| Country                   |Selection|%n");
        System.out.format("+---------------------------+---------+%n");
        System.out.format(leftAlignFormat,"Việt Nam",1);
        System.out.format(leftAlignFormat,"Mỹ",2);
        System.out.format(leftAlignFormat,"Nhật Bản",3);
        System.out.format(leftAlignFormat,"Hàn Quốc",4);
        System.out.format(leftAlignFormat,"Trung Quốc",5);
        System.out.format(leftAlignFormat,"Thái Lan",6);
        System.out.format("+---------------------------+---------+%n");
    }
    public void menuCategory(){
        String leftAlignFormat = "| %-25s | %-7d |%n";
        System.out.format("+---------------------------+---------+%n");
        System.out.format("|               CATEGORY              |%n");
        System.out.format("+---------------------------+---------+%n");
        System.out.format("| Category                  |Selection|%n");
        System.out.format("+---------------------------+---------+%n");
        System.out.format(leftAlignFormat,"Hành Động",1);
        System.out.format(leftAlignFormat,"Kinh Dị",2);
        System.out.format(leftAlignFormat,"Khoa Học",3);
        System.out.format(leftAlignFormat,"Kinh Điển",4);
        System.out.format(leftAlignFormat,"Lãng mạn",5);
        System.out.format(leftAlignFormat,"Tài Liệu",6);
        System.out.format(leftAlignFormat,"Thể Thao",7);
        System.out.format(leftAlignFormat,"Tâm lý",8);
        System.out.format(leftAlignFormat,"Hollywood",9);
        System.out.format(leftAlignFormat,"Hài",10);
        System.out.format(leftAlignFormat,"Phim Âm Nhạc",11);
        System.out.format(leftAlignFormat,"Gia Đình",12);
        System.out.format(leftAlignFormat,"Tội Phạm",13);
        System.out.format(leftAlignFormat,"Hoạt Hình",14);
        System.out.format("+---------------------------+---------+%n");
    }
    public void menuStaffManagement(){
        String leftAlignFormat = "| %-25s | %-7d |%n";
        System.out.format("+-------------------------------------+%n");
        System.out.format("|          STAFF MANAGEMENT           |%n");
        System.out.format("+---------------------------+---------+%n");
        System.out.format("| Function                  |Selection|%n");
        System.out.format("+---------------------------+---------+%n");
        System.out.format(leftAlignFormat,"Add Staff to List",1);
        System.out.format(leftAlignFormat,"Update Staff",2);
        System.out.format(leftAlignFormat,"Delete Staff",3);
        System.out.format(leftAlignFormat,"Staff Search",4);
        System.out.format(leftAlignFormat,"Show List of Staff",5);
        System.out.format(leftAlignFormat,"Calculate Staff salary",6);
        System.out.format(leftAlignFormat,"Back to Home Page",7);
        System.out.format(leftAlignFormat,"Exit Program",8);
        System.out.format("+---------------------------+---------+%n");
    }
    public void menuInputMovieSchedule(){
        String leftAlignFormat = "| %-32s |%n";
        System.out.format("+-------------------------------------+%n");
        System.out.format(leftAlignFormat,"Add MovieSchedule:");
        System.out.format("+-------------------------------------+%n");
    }
    public void listFilm(){
        FilmManagement filmManagement = new FilmManagement();
        String leftAlignFormat = "| %-60s |%n";
        System.out.format("+--------------------------------------------------------------+%n");
        System.out.format("|                       CURRENT MOVIE LIST                     |%n");
        System.out.format("+--------------------------------------------------------------+%n");
        for (int i = 0; i < filmManagement.listFilm.size(); i++) {
            System.out.format(leftAlignFormat,"ID FILM: "+filmManagement.listFilm.get(i).getIdFilm()+" --->"+" FILM NAME: "+ filmManagement.listFilm.get(i).getName());
        }
        System.out.format("+--------------------------------------------------------------+%n");
    }
    public void menuInputStaff(){
        String leftAlignFormat = "| %-35s |%n";
        System.out.format("+-------------------------------------+%n");
        System.out.format(leftAlignFormat,"InPut Staff:");
        System.out.format("+-------------------------------------+%n");
    }
    public void menuGender(){
        String leftAlignFormat = "| %-14s | %-7d |%n";
        System.out.format("+----------------+---------+%n");
        System.out.format("|           GENDER         |%n");
        System.out.format("+----------------+---------+%n");
        System.out.format("| Type           |Selection|%n");
        System.out.format("+----------------+---------+%n");
        System.out.format(leftAlignFormat,"Male",1);
        System.out.format(leftAlignFormat,"Female",2);
        System.out.format("+----------------+---------+%n");
    }
    public void menuMission(){
        String leftAlignFormat = "| %-14s | %-7d |%n";
        System.out.format("+----------------+---------+%n");
        System.out.format("|         MISSION          |%n");
        System.out.format("+----------------+---------+%n");
        System.out.format("| Mission        |Selection|%n");
        System.out.format("+----------------+---------+%n");
        System.out.format(leftAlignFormat,"Ticker Seller",1);
        System.out.format(leftAlignFormat,"Cinema Staff",2);
        System.out.format("+----------------+---------+%n");
    }
    public void menuRank(){
        String leftAlignFormat = "| %-14s | %-7d |%n";
        System.out.format("+----------------+---------+%n");
        System.out.format("|            RANK          |%n");
        System.out.format("+----------------+---------+%n");
        System.out.format("| Rank           |Selection|%n");
        System.out.format("+----------------+---------+%n");
        System.out.format(leftAlignFormat,"Rank A",1);
        System.out.format(leftAlignFormat,"Rank B",2);
        System.out.format(leftAlignFormat,"Rank C",3);
        System.out.format("+----------------+---------+%n");
    }
    public void menuInputCinemaRoom(){
        String leftAlignFormat = "| %-18s |%n";
        System.out.format("+--------------------+%n");
        System.out.format(leftAlignFormat,"Add Cinema Room:");
        System.out.format("+--------------------+%n");
    }
    public void menuStafflist(){
        StaffManagement staffManagement = new StaffManagement();
        List<Staff>listStaffCNRoom = (List<Staff>) staffManagement.getListStaffCinemaRoom(staffManagement.getListStaff());
        String leftAlignFormat = "| %-112s |%n";
        System.out.format("+------------------------------------------------------------------------------------------------------------------+%n");
        System.out.format("|                                CURRENT STAFF LIST MISSION CINEMA ROOM                                            |%n");
        System.out.format("+------------------------------------------------------------------------------------------------------------------+%n");
        for (int i = 0; i < listStaffCNRoom.size(); i++) {
            System.out.format(leftAlignFormat,"ID Staff: "+listStaffCNRoom.get(i).getId()+" --->"+" Staff Name: "+ listStaffCNRoom.get(i).getName()
                    +"--->"+" Mission: "+listStaffCNRoom.get(i).getMission()+"Work at Room:"+staffManagement.getStaffAreActiveAt(listStaffCNRoom));
        }
        System.out.format("+------------------------------------------------------------------------------------------------------------------+%n");
    }
    public void menuKindOfRoom(){
        String leftAlignFormat = "| %-15s | %-7d |%n";
        System.out.format("+-----------------+---------+%n");
        System.out.format("|        Kind Of Room       |%n");
        System.out.format("+-----------------+---------+%n");
        System.out.format("| Type            |Selection|%n");
        System.out.format("+-----------------+---------+%n");
        System.out.format(leftAlignFormat,"Vip",1);
        System.out.format(leftAlignFormat,"Normal",2);
        System.out.format("+-----------------+---------+%n");
    }
    public void menuEditFilm(){
            String leftAlignFormat = "| %-18s |%n";
            System.out.format("+--------------------+%n");
            System.out.format(leftAlignFormat,"Edit Film:");
            System.out.format("+--------------------+%n");
    }
    public void menuEditStaff(){
        String leftAlignFormat = "| %-18s |%n";
        System.out.format("+--------------------+%n");
        System.out.format(leftAlignFormat,"Edit Staff:");
        System.out.format("+--------------------+%n");
    }
    public void menuDelStaff(){
        String leftAlignFormat = "| %-18s |%n";
        System.out.format("+--------------------+%n");
        System.out.format(leftAlignFormat,"Delete Staff:");
        System.out.format("+--------------------+%n");
    }
    public void menuFindStaff(){
        String leftAlignFormat = "| %-14s | %-7d |%n";
        System.out.format("+----------------+---------+%n");
        System.out.format("|      SEARCH STAFF BY     |%n");
        System.out.format("+----------------+---------+%n");
        System.out.format("| Type           |Selection|%n");
        System.out.format("+----------------+---------+%n");
        System.out.format(leftAlignFormat,"ID",1);
        System.out.format(leftAlignFormat,"Name",2);
        System.out.format(leftAlignFormat,"Mission",3);
        System.out.format("+----------------+---------+%n");
    }
    public void listStaffs(){
        StaffManagement staffManagement = new StaffManagement();
        String leftAlignFormat = "| %-147s |%n";
        System.out.format("+-----------------------------------------------------------------------------------------------------------------------------------------------------+%n");
        System.out.format("|                                                               CURRENT STAFF LIST                                                                    |%n");
        System.out.format("+-----------------------------------------------------------------------------------------------------------------------------------------------------+%n");
        for (int i = 0; i < staffManagement.listStaff.size(); i++) {
            System.out.format(leftAlignFormat,"StaffID:"+ staffManagement.listStaff.get(i).getId()+", StaffName:"+staffManagement.listStaff.get(i).getName()+
                    ", Gender:"+ staffManagement.listStaff.get(i).getGender()+", Address:"+ staffManagement.listStaff.get(i).getAddress()+
                    ", PhoneNumber:"+ staffManagement.listStaff.get(i).getPhoneNumber()+", Mission:"+ staffManagement.listStaff.get(i).getMission()+
                    ", OverTime: "+staffManagement.listStaff.get(i).getOverTime()+", Rank: "+staffManagement.listStaff.get(i).getRank());
        }
        System.out.format("+-----------------------------------------------------------------------------------------------------------------------------------------------------+%n");
    }
    public void menuCinemaRoom(){
        System.out.format("+--------------------------------------------+%n");
        System.out.format("|                MOVIE SCREEN                |%n");
        System.out.format("+----------------------------------------+---|%n");
        System.out.format("|[01][02][03][04][05][06][07][08][09][10]| A |%n");
        System.out.format("|[01][02][03][04][05][06][07][08][09][10]| B |%n");
        System.out.format("|[01][02][03][04][05][06][07][08][09][10]| C |%n");
        System.out.format("|[01][02][03][04][05][06][07][08][09][10]| D |%n");
        System.out.format("|[01][02][03][04][05][06][07][08][09][10]| E |%n");
        System.out.format("|[01][02][03][04][05][06][07][08][09][10]| F |%n");
        System.out.format("|[01][02][03][04][05][06][07][08][09][10]| G |%n");
        System.out.format("|[01][02][03][04][05][06][07][08][09][10]| H |%n");
        System.out.format("|[01][02][03][04][05][06][07][08][09][10]| I |%n");
        System.out.format("|[01][02][03][04][05][06][07][08][09][10]| J |%n");
        System.out.format("+----------------------------------------|   |%n");
    }
    public void menuLoginID(){
        System.out.format("+-------------------------------------+%n");
        System.out.format("|----------------LOGIN----------------|%n");
        System.out.format("|               ENTER ID              |%n");
        System.out.format("+-------------------------------------+%n");
    }
    public void menuLoginPassWord(){
        System.out.format("+-------------------------------------+%n");
        System.out.format("|            ENTER PASSWORD:          |%n");
        System.out.format("+-------------------------------------+%n");
    }
    public void menuTotalManagement(){
        String leftAlignFormat = "| %-25s | %-7d |%n";
        System.out.format("+-------------------------------------+%n");
        System.out.format("|           TOTAL MANAGEMENT          |%n");
        System.out.format("+---------------------------+---------+%n");
        System.out.format("| Management type           |Selection|%n");
        System.out.format("+---------------------------+---------+%n");
        System.out.format(leftAlignFormat,"Staff Management",1);
        System.out.format(leftAlignFormat,"Film Management",2);
        System.out.format(leftAlignFormat,"Member Management",3);
        System.out.format(leftAlignFormat,"Movie Schedule Management",4);
        System.out.format(leftAlignFormat,"Cinema Room Management",5);
        System.out.format(leftAlignFormat,"Cinema Ticket Management",6);
        System.out.format(leftAlignFormat,"Sale Management",7);
        System.out.format(leftAlignFormat,"Messenger by Member",8);
        System.out.format("+---------------------------+---------+%n");
    }
    public void disPlayStaffbyID(Staff staff){
        String leftAlignFormat = "| %-147s |%n";
        System.out.format("+-----------------------------------------------------------------------------------------------------------------------------------------------------+%n");
        System.out.format("|                                                               STAFF YOU NEED TO FIND                                                                |%n");
        System.out.format("+-----------------------------------------------------------------------------------------------------------------------------------------------------+%n");
            System.out.format(leftAlignFormat,"StaffID:"+ staff.getId()+", StaffName:"+staff.getName()+ ", Gender:"+ staff.getGender()+", Address:"+ staff.getAddress()+
                    ", PhoneNumber:"+ staff.getPhoneNumber()+", Mission:"+ staff.getMission()+ ", OverTime: "+staff.getOverTime()+", Rank: "+staff.getRank());
        System.out.format("+-----------------------------------------------------------------------------------------------------------------------------------------------------+%n");
    }
    public void disPlayStaffbyName(List<Staff>list){
        String leftAlignFormat = "| %-147s |%n";
        System.out.format("+-----------------------------------------------------------------------------------------------------------------------------------------------------+%n");
        System.out.format("|                                                                  STAFF LIST                                                                         |%n");
        System.out.format("+-----------------------------------------------------------------------------------------------------------------------------------------------------+%n");
        for (int i = 0; i < list.size(); i++) {
            System.out.format(leftAlignFormat,"StaffID:"+ list.get(i).getId()+", StaffName:"+list.get(i).getName()+
                    ", Gender:"+ list.get(i).getGender()+", Address:"+ list.get(i).getAddress()+
                    ", PhoneNumber:"+ list.get(i).getPhoneNumber()+", Mission:"+ list.get(i).getMission()+
                    ", OverTime: "+list.get(i).getOverTime()+", Rank: "+list.get(i).getRank());
        }
        System.out.format("+-----------------------------------------------------------------------------------------------------------------------------------------------------+%n");
    }
    public void menuFilmManagement(){
        String leftAlignFormat = "| %-25s | %-7d |%n";
        System.out.format("+-------------------------------------+%n");
        System.out.format("|          STAFF MANAGEMENT           |%n");
        System.out.format("+---------------------------+---------+%n");
        System.out.format("| Function                  |Selection|%n");
        System.out.format("+---------------------------+---------+%n");
        System.out.format(leftAlignFormat,"Add Film to List",1);
        System.out.format(leftAlignFormat,"Update Film",2);
        System.out.format(leftAlignFormat,"Delete Film",3);
        System.out.format(leftAlignFormat,"Search Film",4);
        System.out.format(leftAlignFormat,"Show List Film",5);
        System.out.format(leftAlignFormat,"Back to Home Page",6);
        System.out.format(leftAlignFormat,"Exit Program",7);
        System.out.format("+---------------------------+---------+%n");
    }
}
