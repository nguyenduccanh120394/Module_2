package service;
import model.CinemaRoom;
import model.Film;

import java.util.Scanner;

public class Input {
    static Menu menu = new Menu();
    Scanner scanner = new Scanner(System.in);
    FileMangement fileMangement = new FileMangement();
    Validate validate = new Validate();
    public CinemaRoom inputCinemaRoom(){
        CinemaRoomManagement cinemaRoomManagement = new CinemaRoomManagement();
        menu.menuInputCinemaRoom();
        System.out.println("Enter Room Name:");
        String roomCode = scanner.nextLine();
        menu.menuKindOfRoom();
        System.out.println("Enter Kind of Room:");
        String kindOfRoom = scanner.nextLine();
        menu.menuStafflist();
        System.out.println("Enter Staff of Room");
        String idStaff= scanner.nextLine();
        CinemaRoom cinemaRoom1 = new CinemaRoom(roomCode,kindOfRoom,idStaff);
        cinemaRoomManagement.add(cinemaRoom1);
        fileMangement.writeToFileCinemaRoom("dataCinemaRoom.csv",cinemaRoomManagement.listCinemaRoom,idStaff);
        return cinemaRoom1;
    }
    public static String inPutId(){
        Scanner scanner = new Scanner(System.in);
        menu.menuLoginID();
        System.out.print("ID: ");
        String id = scanner.nextLine();
        return id;
    }
    public static String inPutPassWord(){
        Scanner scanner = new Scanner(System.in);
        menu.menuLoginPassWord();
        System.out.print("PASSWORD: ");
        String passWord=scanner.nextLine();
        return passWord;
    }
    public Film inputFilm(){
        menu.menuInputFilm();
        String idFilm ;
        do {
            System.out.println("Enter Film ID by form CNxx ( Ex:CN01 ): ");
            idFilm = scanner.nextLine();
        }while (!Validate.validate(idFilm,Validate.getFilmIdRegex()));
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
}
