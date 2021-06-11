package controller;

import model.CinemaRoom;
import model.Film;
import model.MovieSchedule;
import model.Staff;
import service.*;

import java.util.Scanner;
public class Login {
    static CustomerMangement customerMangement = new CustomerMangement();
    public static String inPutId(){
        Scanner scanner = new Scanner(System.in);
        System.out.format("+------------------------+%n");
        System.out.format("|----------LOGIN---------|%n");
        System.out.format("|         ENTER ID:      |%n");
        System.out.format("+------------------------+%n");
        System.out.print("ID: ");
        String id = scanner.nextLine();
        return id;
    }
    public static String inPutPassWord(){
        Scanner scanner = new Scanner(System.in);
        System.out.format("+------------------------+%n");
        System.out.format("|     ENTER PASSWORD:    |%n");
        System.out.format("+------------------------+%n");
        System.out.print("PASSWORD: ");
        String passWord=scanner.nextLine();
        return passWord;
    }
    public static boolean checkIdCustomer(String id,String passWord){
        for (int i = 0; i < customerMangement.getCustomerList().size(); i++) {
            if (customerMangement.getCustomerList().get(i).getIdLogin().equals(id)&&customerMangement.getCustomerList().get(i).getPassWord().equals(passWord)){
                return true;
            }
        }
        return false;
    }
    public static void logIn(){
        final String ID_ADMIN="admin";
        final String PASSWORD_ADMIN="admin";
        Scanner scanner = new Scanner(System.in);
        Input input = new Input();
        Menu menu = new Menu();
        String id;
        String passWord;
        do {
            id = inPutId();
            passWord = inPutPassWord();
            if (id.equals("admin")&&passWord.equals("admin")){
                System.out.println("Function Selection");
                int choice;
                do {
                    menu.menuAdmin();
                    choice = scanner.nextInt();
                    if (choice<=0||choice>5){
                        System.out.println("Enter your choice 1 to 5");
                    }else {
                        switch (choice){
                            case 1:
                                int type;
                                do {
                                    menu.menuAddAdmin();
                                    System.out.println("Enter additional type");
                                    type= scanner.nextInt();
                                    if (type<=0||type>5){
                                        System.out.println("Enter type 1 to 5");
                                    }else {
                                        switch (type){
                                            case 1:
                                                Film film = input.inputFilm();
                                                FilmManagement filmManagement = new FilmManagement();
                                                filmManagement.addFilm(film);
                                                break;
                                            case 2:
                                                MovieScheduleManagement movieScheduleManagement = new MovieScheduleManagement();
                                                menu.menuInputMovieSchedule();
                                                System.out.println("Enter Premiere Date:");
                                                scanner.nextLine();
                                                String movieDay = scanner.nextLine();
                                                System.out.println("Enter Movie Shift:");
                                                String movieShift = scanner.nextLine();
                                                menu.listFilm();
                                                System.out.println("Enter Movie ID:");
                                                String idMovie = scanner.nextLine();
                                                MovieSchedule movieSchedule = new MovieSchedule(movieDay,movieShift,idMovie);
                                                movieScheduleManagement.addMovieSchedule(movieSchedule,idMovie);
                                                System.out.println("Finish");
                                                break;
                                            case 3:
                                                input.inputStaff();
                                                break;
                                            case 4:
//                                                 CinemaRoomManagement cinemaRoomManagement = new CinemaRoomManagement();
//                                                 CinemaRoom cinemaRoom1 = new CinemaRoom("R02","1","1","S02");
//                                                 CinemaRoom cinemaRoom2 = new CinemaRoom("R02","1","1","S04");
//                                                 cinemaRoomManagement.add(cinemaRoom1);
//                                                 cinemaRoomManagement.add(cinemaRoom2);
//                                                 for (CinemaRoom item:cinemaRoomManagement.getListCinemaRoom()){
//                                                     System.out.println(item);
//                                                 }
                                                break;
                                            case 5:
                                                break;
                                        }
                                    }
                                }while (type>0||type<6);
                                break;
                            case 2:
                                int option;
                                do {
                                    menu.menuEditAdmin();
                                    System.out.println("Enter Edit type");
                                    option = scanner.nextInt();
                                    if (option<=0||option>4){
                                        System.out.println("Enter 1 to 4");
                                    }else {
                                        switch (option){
                                            case 1:
                                                FilmManagement filmManagement = new FilmManagement();
                                                menu.menuEditAdmin();
                                                menu.listFilm();
                                                System.out.println("Enter ID U want Edit:");
                                                scanner.nextLine();
                                                id = scanner.nextLine();
                                                Film film = input.inputFilm();
                                                filmManagement.editFilm(film,id);
                                                break;
                                            case 2:
                                                StaffManagement staffManagement = new StaffManagement();
                                                menu.menuEditStaff();
                                                menu.listStaffs();
                                                System.out.println("Enter Staff ID:");
                                                scanner.nextLine();
                                                id =scanner.nextLine();
                                                Staff staff = input.inputStaff();
                                                staffManagement.edit(staff,id);
                                                break;
                                            case 3:
                                                break;
                                        }
                                    }
                                }while (option>0||option<5);
                                break;
                        }
                    }
                }while (choice>0||choice<6);
            }else if (checkIdCustomer(id,passWord)){
                System.out.println(true);
                int choice;
                do {
                    menu.menuCustomer();
                    choice = scanner.nextInt();
                    if (choice<=0||choice>5){
                        System.out.println("Enter your choice 1 to 5");
                    }else {
                        switch (choice){
                            case 1:
                                System.out.println("SEARCH");
                                break;
                        }
                    }
                }while (choice>0||choice<6);
            }else {
                System.err.println("Enter Error!");
            }
        }while (id!=ID_ADMIN&&passWord!=PASSWORD_ADMIN||checkIdCustomer(id,passWord)==false);
    }
    public static void nonMember(){
        Menu menu = new Menu();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Function Selection");
        int choice;
        do {
            menu.menuNonMember();
            choice = scanner.nextInt();
            if (choice<=0||choice>4){
                System.out.println("Enter your choice 1 to 4");
            }else {
                switch (choice){
                    case 1:
                        System.out.println("SEARCH");
                        break;
                    case 2:
                        System.out.println("DISPLAY");
                        break;
                    case 3:
                        System.out.println("LOGIN");
                        logIn();
                        break;
                    case 4:
                        System.out.println("REGISTER");
                        customerMangement.registration();
                        logIn();
                        break;
                }
            }
        }while (choice<=0||choice>4);
    }
}
