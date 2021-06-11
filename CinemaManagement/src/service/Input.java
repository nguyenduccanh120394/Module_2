package service;

import model.CinemaRoom;
import model.Film;
import model.Staff;

import java.util.Scanner;

public class Input {
    Menu menu = new Menu();
    Scanner scanner = new Scanner(System.in);
    FileMangement fileMangement = new FileMangement();
    public Film inputFilm(){
        menu.menuInputFilm();
        System.out.println("Enter Film ID : ");
        String idFilm = scanner.nextLine();
        System.out.println("Enter Film Name: ");
        String name = scanner.nextLine();
        System.out.println("Enter Show Time: ");
        String showTime = scanner.nextLine();
        System.out.println("Enter Directors: ");
        String directors = scanner.nextLine();
        System.out.println("Enter Actor: ");
        String actor = scanner.nextLine();
        System.out.println("Enter Year Of Manufacture: ");
        int yearOfManufacture = scanner.nextInt();
        menu.menuCountry();
        System.out.println("Enter Country: ");
        scanner.nextLine();
        String country = scanner.nextLine();
        menu.menuCategory();
        System.out.println("Enter Category: ");
        String category = scanner.nextLine();
        System.out.println("Enter Content: ");
        String content = scanner.nextLine();
        Film film = new Film(idFilm,name,showTime,directors,actor,yearOfManufacture,country,category,content);
        return film;
    }
    public Staff inputStaff(){
        StaffManagement staffManagement = new StaffManagement();
        Staff staff = new Staff();
        menu.menuInputStaff();
        System.out.println("Enter Staff ID:");
        String id = scanner.nextLine();
        System.out.println("Enter Staff Name:");
        String name = scanner.nextLine();
        menu.menuGender();
        System.out.println("Enter Staff gender:");
        String gender = scanner.nextLine();
        System.out.println("Enter Address:");
        String address = scanner.nextLine();
        System.out.println("Phone Number:");
        String phoneNumber = scanner.nextLine();
        menu.menuMission();
        System.out.println("Enter Mission");
        String mission = scanner.nextLine();
        System.out.println("Enter Over Time of Staff:");
        int overTime = scanner.nextInt();
        menu.menuRank();
        System.out.println("Enter Rank of Staff:");
        scanner.nextLine();
        String rank = scanner.nextLine();
        Staff staff1= new Staff(id,name,gender,address,phoneNumber,mission,overTime,rank);
        staffManagement.add(staff1);
        return staff1;
    }
    public CinemaRoom inputCinemaRoom(){
        CinemaRoomManagement cinemaRoomManagement = new CinemaRoomManagement();
        menu.menuInputCinemaRoom();
        System.out.println("Enter Room Name:");
        String roomCode = scanner.nextLine();
        menu.menuKindOfRoom();
        System.out.println("Enter Kind of Room:");
        String kindOfRoom = scanner.nextLine();
        menu.menuStatus();
        System.out.println("Enter Status:");
        String status = scanner.nextLine();
        menu.menuStafflist();
        System.out.println("Enter Staff of Room");
        String idStaff= scanner.nextLine();
        CinemaRoom cinemaRoom1 = new CinemaRoom(roomCode,kindOfRoom,status,idStaff);
        return cinemaRoom1;
    }
}
