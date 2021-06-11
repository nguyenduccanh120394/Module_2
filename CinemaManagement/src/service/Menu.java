package service;

import model.Staff;
import service.FilmManagement;

import java.util.List;

public class Menu {
    public static void menuAdmin(){
        String leftAlignFormat = "| %-12s | %-7d |%n";
        System.out.format("+--------------+---------+%n");
        System.out.format("|     MENU MANAGEMENT    |%n");
        System.out.format("+--------------+---------+%n");
        System.out.format("| Function     |Selection|%n");
        System.out.format("+--------------+---------+%n");
        System.out.format(leftAlignFormat,"ADD",1);
        System.out.format(leftAlignFormat,"EDIT",2);
        System.out.format(leftAlignFormat,"DELETE",3);
        System.out.format(leftAlignFormat,"SEARCH",4);
        System.out.format(leftAlignFormat,"SORT",5);
        System.out.format("+--------------+---------+%n");
    }
    public static void menuCustomer(){
        String leftAlignFormat = "| %-12s | %-7d |%n";
        System.out.format("+--------------+---------+%n");
        System.out.format("|       MENU MEMBER      |%n");
        System.out.format("+--------------+---------+%n");
        System.out.format("| Function     |Selection|%n");
        System.out.format("+--------------+---------+%n");
        System.out.format(leftAlignFormat,"SEARCH",1);
        System.out.format(leftAlignFormat,"ADD TO CART",2);
        System.out.format(leftAlignFormat,"DEL FR CART",3);
        System.out.format(leftAlignFormat,"PAY",4);
        System.out.format("+--------------+---------+%n");
    }
    public static void menuNonMember(){
        String leftAlignFormat = "| %-12s | %-7d |%n";
        System.out.format("+--------------+---------+%n");
        System.out.format("|     MENU NON-MEMBER    |%n");
        System.out.format("+--------------+---------+%n");
        System.out.format("| Function     |Selection|%n");
        System.out.format("+--------------+---------+%n");
        System.out.format(leftAlignFormat,"SEARCH",1);
        System.out.format(leftAlignFormat,"DISPLAY",2);
        System.out.format(leftAlignFormat,"LOGIN",3);
        System.out.format(leftAlignFormat,"REGISTER",4);
        System.out.format("+--------------+---------+%n");
    }
    public void startMenu(){
        String leftAlignFormat = "| %-18s | %-7d |%n";
        System.out.format("+--------------------+---------+%n");
        System.out.format("|         CINEMA CENTER        |%n");
        System.out.format("+--------------------+---------+%n");
        System.out.format("| Function           |Selection|%n");
        System.out.format("+--------------------+---------+%n");
        System.out.format(leftAlignFormat,"Create new account",1);
        System.out.format(leftAlignFormat,"Login",2);
        System.out.format(leftAlignFormat,"Skip",3);
        System.out.format("+--------------------+---------+%n");
    }
    public void menuRegister(){
        String leftAlignFormat = "| %-18s |%n";
        System.out.format("+--------------------+%n");
        System.out.format(leftAlignFormat,"REGISTER");
        System.out.format("+--------------------+%n");
    }
    public void menuLogin(){
        String leftAlignFormat = "| %-18s |%n";
        System.out.format("+--------------------+%n");
        System.out.format(leftAlignFormat,"LOGIN");
        System.out.format("+--------------------+%n");
    }
    public void menuInputFilm(){
        String leftAlignFormat = "| %-18s |%n";
        System.out.format("+--------------------+%n");
        System.out.format(leftAlignFormat,"Input Film:");
        System.out.format("+--------------------+%n");
    }
    public void menuCountry(){
        String leftAlignFormat = "| %-18s | %-7d |%n";
        System.out.format("+--------------------+---------+%n");
        System.out.format("|            COUNTRY           |%n");
        System.out.format("+--------------------+---------+%n");
        System.out.format("| Country            |Selection|%n");
        System.out.format("+--------------------+---------+%n");
        System.out.format(leftAlignFormat,"Việt Nam",1);
        System.out.format(leftAlignFormat,"Mỹ",2);
        System.out.format(leftAlignFormat,"Nhật Bản",3);
        System.out.format(leftAlignFormat,"Hàn Quốc",4);
        System.out.format(leftAlignFormat,"Trung Quốc",5);
        System.out.format(leftAlignFormat,"Thái Lan",6);
        System.out.format("+--------------------+---------+%n");
    }
    public void menuCategory(){
        String leftAlignFormat = "| %-18s | %-7d |%n";
        System.out.format("+--------------------+---------+%n");
        System.out.format("|            CATEGORY          |%n");
        System.out.format("+--------------------+---------+%n");
        System.out.format("| Category           |Selection|%n");
        System.out.format("+--------------------+---------+%n");
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
        System.out.format("+--------------------+---------+%n");
    }
    public void menuAddAdmin(){
        String leftAlignFormat = "| %-18s | %-7d |%n";
        System.out.format("+--------------------+---------+%n");
        System.out.format("|              ADD             |%n");
        System.out.format("+--------------------+---------+%n");
        System.out.format("| Category           |Selection|%n");
        System.out.format("+--------------------+---------+%n");
        System.out.format(leftAlignFormat,"Add Film",1);
        System.out.format(leftAlignFormat,"Add Movie Schedule",2);
        System.out.format(leftAlignFormat,"Add Staff",3);
        System.out.format(leftAlignFormat,"Add Cinema Room",4);
        System.out.format(leftAlignFormat,"Add Cinema Ticket",5);
        System.out.format("+--------------------+---------+%n");
    }
    public void menuInputMovieSchedule(){
        String leftAlignFormat = "| %-18s |%n";
        System.out.format("+--------------------+%n");
        System.out.format(leftAlignFormat,"Add MovieSchedule:");
        System.out.format("+--------------------+%n");
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
        String leftAlignFormat = "| %-18s |%n";
        System.out.format("+--------------------+%n");
        System.out.format(leftAlignFormat,"InPut Staff:");
        System.out.format("+--------------------+%n");
    }
    public void menuGender(){
        String leftAlignFormat = "| %-12s | %-7d |%n";
        System.out.format("+--------------+---------+%n");
        System.out.format("|       Gender Type      |%n");
        System.out.format("+--------------+---------+%n");
        System.out.format("| Type         |Selection|%n");
        System.out.format("+--------------+---------+%n");
        System.out.format(leftAlignFormat,"Male",1);
        System.out.format(leftAlignFormat,"Female",2);
        System.out.format("+--------------+---------+%n");
    }
    public void menuMission(){
        String leftAlignFormat = "| %-14s | %-7d |%n";
        System.out.format("+----------------+---------+%n");
        System.out.format("|         MISSION          |%n");
        System.out.format("+----------------+---------+%n");
        System.out.format("| Mission        |Selection|%n");
        System.out.format("+----------------+---------+%n");
        System.out.format(leftAlignFormat,"Ticker Seller",1);
        System.out.format(leftAlignFormat,"Cinema model.Staff",2);
        System.out.format("+----------------+---------+%n");
    }
    public void menuRank(){
        String leftAlignFormat = "| %-12s | %-7d |%n";
        System.out.format("+--------------+---------+%n");
        System.out.format("|           RANK         |%n");
        System.out.format("+--------------+---------+%n");
        System.out.format("| Rank         |Selection|%n");
        System.out.format("+--------------+---------+%n");
        System.out.format(leftAlignFormat,"Rank A",1);
        System.out.format(leftAlignFormat,"Rank B",2);
        System.out.format(leftAlignFormat,"Rank C",3);
        System.out.format("+--------------+---------+%n");
    }
    public void menuInputCinemaRoom(){
        String leftAlignFormat = "| %-18s |%n";
        System.out.format("+--------------------+%n");
        System.out.format(leftAlignFormat,"Add Cinema Room:");
        System.out.format("+--------------------+%n");
    }
    public void menuStatus(){
        String leftAlignFormat = "| %-12s | %-7d |%n";
        System.out.format("+--------------+---------+%n");
        System.out.format("|       LIST STATUS      |%n");
        System.out.format("+--------------+---------+%n");
        System.out.format("| Status       |Selection|%n");
        System.out.format("+--------------+---------+%n");
        System.out.format(leftAlignFormat,"Ready",1);
        System.out.format(leftAlignFormat,"Cleaning up",2);
        System.out.format(leftAlignFormat,"Installing",3);
        System.out.format(leftAlignFormat,"Trouble!!",4);
        System.out.format("+--------------+---------+%n");
    }
    public void menuStafflist(){
        StaffManagement staffManagement = new StaffManagement();
        List<Staff>listStaffCNRoom = (List<Staff>) staffManagement.getListStaffCinemaRoom(staffManagement.listStaff);
        String leftAlignFormat = "| %-72s |%n";
        System.out.format("+--------------------------------------------------------------------------+%n");
        System.out.format("|              CURRENT STAFF LIST MISSION CINEMA ROOM                      |%n");
        System.out.format("+--------------------------------------------------------------------------+%n");
        for (int i = 0; i < listStaffCNRoom.size(); i++) {
            System.out.format(leftAlignFormat,"ID model.Staff: "+listStaffCNRoom.get(i).getId()+" --->"+" model.Staff Name: "+ listStaffCNRoom.get(i).getName()+"--->"+" Mission: "+listStaffCNRoom.get(i).getMission());
        }
        System.out.format("+--------------------------------------------------------------------------+%n");
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
    public void menuEditAdmin(){
        String leftAlignFormat = "| %-18s | %-7d |%n";
        System.out.format("+--------------------+---------+%n");
        System.out.format("|              EDIT            |%n");
        System.out.format("+--------------------+---------+%n");
        System.out.format("| Type               |Selection|%n");
        System.out.format("+--------------------+---------+%n");
        System.out.format(leftAlignFormat,"Edit Film",1);
        System.out.format(leftAlignFormat,"Edit Staff",2);
        System.out.format(leftAlignFormat,"Edit Cinema Room",3);
        System.out.format("+--------------------+---------+%n");
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
    public void listStaffs(){
        StaffManagement staffManagement = new StaffManagement();
        String leftAlignFormat = "| %-147s |%n";
        System.out.format("+-----------------------------------------------------------------------------------------------------------------------------------------------------+%n");
        System.out.format("|                                                               CURRENT STAFF LIST                                                                    |%n");
        System.out.format("+-----------------------------------------------------------------------------------------------------------------------------------------------------+%n");
        for (int i = 0; i < staffManagement.listStaff.size(); i++) {
            System.out.format(leftAlignFormat,"StaffID:"+staffManagement.listStaff.get(i).getId()+", StaffName:"+ staffManagement.listStaff.get(i).getName()+
                    ", Gender:"+staffManagement.listStaff.get(i).getGender()+", Address:"+staffManagement.listStaff.get(i).getAddress()+
                    ", PhoneNumber:"+staffManagement.listStaff.get(i).getPhoneNumber()+", Mission:"+staffManagement.listStaff.get(i).getMission()+
                    ", OverTime: "+staffManagement.listStaff.get(i).getOverTime()+", Rank: "+staffManagement.listStaff.get(i).getRank());
        }
        System.out.format("+-----------------------------------------------------------------------------------------------------------------------------------------------------+%n");
    }
}
