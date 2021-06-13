package service;

import model.Staff;
import service.FileMangement;

import java.util.ArrayList;
import java.util.List;

import static model.Staff.*;

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
        try {
            listStaff = fileMangement.readFromFileStaff("dataStaff.csv");
        }catch (Exception e){
            listStaff = new ArrayList<>();
        }
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
    public String getStaffAreActiveAt(List<Staff>staffListCinemaoom){
        CinemaRoomManagement cinemaRoomManagement = new CinemaRoomManagement();
        String roomCode = null;
        for (int i = 0; i < staffListCinemaoom.size(); i++) {
            if (staffListCinemaoom.get(i).getId().equals(cinemaRoomManagement.listCinemaRoom.get(i).getStaff())){
                roomCode = cinemaRoomManagement.getListCinemaRoom().get(i).getRoomCode();
            }else {
                roomCode = "Inactive at room";
            }

        }
        return roomCode;
    }
    public int checkIndex(String id){
        for (int i = 0; i < listStaff.size(); i++) {
            if (listStaff.get(i).getId().equals(id)){
                return i;
            }
        }
        return -1;
    }
    public void edit(Staff staff,String id){
        int index = checkIndex(id);
        if (index == -1) {
            System.out.println("Not Found");
        }else {
            listStaff.set(index,staff);
            fileMangement.writeToFileStaff("dataStaff.csv",listStaff);
        }
    }
    public boolean onlyID(String id){
        for (int i = 0; i < getListStaff().size(); i++) {
            if (getListStaff().get(i).getId().equals(id)){
                return false;
            }
        }
        return true;
    }
    public boolean checkIDOnList(String id){
        for (int i = 0; i < getListStaff().size(); i++) {
            if (getListStaff().get(i).getId().equals(id)){
                return true;
            }
        }
        return false;
    }
    public void delete(String id){
        int index = checkIndex(id);
        if (index ==-1){
            System.out.println("Not Found");
        }else {
            getListStaff().remove(index);
            fileMangement.writeToFileStaff("dataStaff.csv",getListStaff());
        }
    }
    public int chekIndexStaff(String id){
        for (int i = 0;  i < getListStaff().size(); i++) {
            if (getListStaff().get(i).getId().equals(id)){
                return i;
            }
        }
        return -1;
    }
    public List<Staff> seachStaffByName(String name){
        List<Staff>staffListByName = new ArrayList<>();
        for (int i = 0; i < getListStaff().size(); i++) {
            if (getListStaff().get(i).getName().contains(name)){
                staffListByName.add(getListStaff().get(i));
            }
        }
        return staffListByName;
    }
    public List<Staff> getListStaffTicket(String MISSION_TICKER_SELLER){
        List<Staff>listStaffTicket = new ArrayList<>();
        for (int i = 0; i < getListStaff().size(); i++) {
            if (getListStaff().get(i).getMission().equals(MISSION_TICKER_SELLER)){
                listStaffTicket.add(getListStaff().get(i));
            }
        }
        return listStaffTicket;
    }
    public int getTotalSalary(Staff staff){
        int totalSalary = 0;
        if (staff.getRank().equals(getRankA())){
            totalSalary = getBasicSalaryRankA()+staff.getOverTime()*getHourlyWagesOvt();
        }else if (staff.getRank().equals(getRankB())){
            totalSalary = getBasicSalaryRankB()+staff.getOverTime()*getHourlyWagesOvt();
        }else if (staff.getRank().equals(getRankC())){
            totalSalary = getBasicSalaryRankC()+staff.getOverTime()*getHourlyWagesOvt();
        }
        return totalSalary;
    }

}
