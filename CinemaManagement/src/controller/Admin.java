package controller;
import model.Film;
import model.Staff;
import service.*;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Admin {
    private String name;
    public Admin(){
    }
    public Admin(String name){
        this.name= name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void mngAdmin(){
        FilmManagement filmManagement = new FilmManagement();
        Menu menu = new Menu();
        final String COUNTRY1_VN = "Việt Nam";
        final String COUNTRY2_USA = "Mỹ";
        final String COUNTRY3_JP = "Nhật Bản";
        final String COUNTRY4_KR = "Hàn Quốc";
        final String COUNTRY5_CN = "Trung Quốc";
        final String COUNTRY6_TL = "Thái Lan";
        Scanner scanner = new Scanner(System.in);
        while (true){
            menu.menuTotalManagement();
            System.out.println("Choose from 1 to 8");
            int choice=-1;
            while (choice == -1){
                try {
                    choice= scanner.nextInt();
                    if (choice<=0||choice>9){
                        System.out.println("Enter from 1 to 8");
                    }
                }catch (InputMismatchException exception){
                    System.out.println("Enter wrong data type ( Enter number 1 to 8 )!!!");
                }finally {
                    scanner.nextLine();
                }
                switch (choice){
                    case 1:
                            Validate validate = new Validate();
                            StaffManagement staffManagement2 = new StaffManagement();
                            System.out.println("Choose from 1 to 8");
                            int option1;
                            while (true){
                                menu.menuStaffManagement();
                                option1=scanner.nextInt();
                                switch (option1) {
                                    case 1:
                                        StaffManagement staffManagement = new StaffManagement();
                                        menu.menuInputStaff();
                                        String id ;
                                        do {
                                            id = scanner.nextLine();
                                            if (validate.validate(id,Validate.getStaffIdRegex())==false){
                                                System.out.println("Enter ID by Form :Sxx , Ex: S01");
                                            }else if (staffManagement.onlyID(id)==false){
                                                System.out.println("ID already exists --> Please re-Enter:");
                                            }
                                        }while (validate.validate(id,Validate.getStaffIdRegex())==false||staffManagement.onlyID(id)==false);
                                        System.out.println("Enter Staff Name:");
                                        String name = scanner.nextLine();
                                        menu.menuGender();
                                        System.out.println("Enter Staff gender:");
                                        String gender = scanner.nextLine();
                                        System.out.println("Enter Address:");
                                        String address = scanner.nextLine();
                                        System.out.println("Enter a 10 or 11 digit phone number");
                                        String phoneNumber;
                                        do {
                                            phoneNumber = scanner.nextLine();
                                            if (!validate.validate(phoneNumber,Validate.getNumberPhoneRegex())){
                                                System.err.println("Enter wrong Data type");
                                            }
                                        }while (validate.validate(phoneNumber,Validate.getNumberPhoneRegex())==false);
                                        menu.menuMission();
                                        System.out.println("Enter Mission");
                                        String  mission = scanner.nextLine();
                                        System.out.println("Enter Over Time of Staff:");
                                        int overTime = -1 ;
                                        while (overTime==-1){
                                            try {
                                                overTime= scanner.nextInt();
                                            }catch (InputMismatchException exception){
                                                System.err.println("Enter wrong Data type");
                                            }finally {
                                                scanner.nextLine();
                                            }
                                        }
                                        menu.menuRank();
                                        System.out.println("Enter Rank of Staff:");
                                        String rank= scanner.nextLine();
                                        Staff staff1= new Staff(id,name,gender,address,phoneNumber,mission,overTime,rank);
                                        staffManagement.add(staff1);
                                        break;
                                    case 2:
                                        menu.menuEditStaff();
                                        System.out.println("Enter ID U want Edit:");
                                        scanner.nextLine();
                                        String idEdit;
                                        do {
                                            idEdit = scanner.nextLine();
                                            if (!staffManagement2.checkIDOnList(idEdit)){
                                                System.out.println("Not Found");
                                            }
                                        }while (!staffManagement2.checkIDOnList(idEdit));
                                        do {
                                            System.out.println("Enter ID new:");
                                            id = scanner.nextLine();
                                            if (!validate.validate(id,Validate.getStaffIdRegex())){
                                                System.out.println("Enter ID by Form :Sxx , Ex: S01");
                                            }
                                        }while (!validate.validate(id,Validate.getStaffIdRegex()));
                                        System.out.println("Enter Staff Name new:");
                                        name = scanner.nextLine();
                                        menu.menuGender();
                                        System.out.println("Enter Staff gender new:");
                                        gender = scanner.nextLine();
                                        System.out.println("Enter Address new:");
                                        address = scanner.nextLine();
                                        System.out.println("Enter a 10 or 11 digit phone number");
                                        do {
                                            phoneNumber = scanner.nextLine();
                                            if (!validate.validate(phoneNumber,Validate.getNumberPhoneRegex())){
                                                System.err.println("Enter wrong Data type");
                                            }
                                        }while (validate.validate(phoneNumber,Validate.getNumberPhoneRegex())==false);
                                        menu.menuMission();
                                        System.out.println("Enter Mission new");
                                        mission = scanner.nextLine();
                                        System.out.println("Enter Over Time of Staff:");
                                        overTime = -1 ;
                                        while (overTime==-1){
                                            try {
                                                overTime= scanner.nextInt();
                                            }catch (InputMismatchException exception){
                                                System.err.println("Enter wrong Data type");
                                            }finally {
                                                scanner.nextLine();
                                            }
                                        }
                                        menu.menuRank();
                                        System.out.println("Enter Rank of Staff new:");
                                        rank= scanner.nextLine();
                                        Staff staff2= new Staff(id,name,gender,address,phoneNumber,mission,overTime,rank);
                                        staffManagement2.edit(staff2,idEdit);
                                        break;
                                    case 3:
                                        menu.menuDelStaff();
                                        String idDel;
                                        System.out.println("Enter ID U Want Delete");
                                        scanner.nextLine();
                                        do {
                                            idDel = scanner.nextLine();
                                            if (!staffManagement2.checkIDOnList(idDel)){
                                                System.out.println("Not Found");
                                            }
                                        }while (!staffManagement2.checkIDOnList(idDel));
                                        System.out.println("Do you really want to delete?");
                                        System.out.println("1.OK                  2.CANCEL");
                                        int choose = scanner.nextInt();
                                        switch (choose){
                                            case 1:
                                                staffManagement2.delete(idDel);
                                                System.out.println("Successful delete");
                                                break;
                                            case 2:
                                                System.out.println("Cancel successfully");
                                                break;
                                        }
                                        break;
                                    case 4:
                                        menu.menuFindStaff();
                                        System.out.println("You want to search by");
                                        int type =-1;
                                        while (type==-1){
                                            try {
                                                type= scanner.nextInt();
                                                if (type<=0||type>4){
                                                    System.out.println("Enter 1 to 4");
                                                }
                                            }catch (InputMismatchException exception){
                                                System.out.println("Enter wrong Data type");
                                            }finally {
                                                scanner.nextLine();
                                            }
                                        }
                                        switch (type){
                                            case 1:
                                                System.out.println("------SEARCH BY ID-----");
                                                System.out.println("Enter ID you want search:");
                                                scanner.nextLine();
                                                String idSearch = scanner.nextLine();
                                                if (!staffManagement2.checkIDOnList(idSearch)){
                                                    System.out.println("Not Found");
                                                }else {
                                                    Staff staff = staffManagement2.getListStaff().get(staffManagement2.chekIndexStaff(idSearch));
                                                    menu.disPlayStaffbyID(staff);
                                                }
                                                break;
                                            case 2:
                                                System.out.println("------SEARCH BY NAME-----");
                                                System.out.println("Enter Name you want search:");
                                                String nameSearch = scanner.nextLine();
                                                List<Staff> list= staffManagement2.seachStaffByName(nameSearch);
                                                menu.disPlayStaffbyName(list);
                                                break;
                                            case 3:
                                                System.out.println("------SEARCH BY MISSION-----");
                                                menu.menuMission();
                                                System.out.println("Enter Mission:");
                                                int missionSearch =-1 ;
                                                while (missionSearch==-1){
                                                    try {
                                                        missionSearch=scanner.nextInt();
                                                        if (missionSearch<=0||missionSearch>2){
                                                            System.out.println("Enter 1 to 2");
                                                        }
                                                    }catch (InputMismatchException exception){
                                                        System.out.println("Enter wrong Data type");
                                                    }finally {
                                                        scanner.nextLine();
                                                    }
                                                }
                                                switch (missionSearch){
                                                    case 1:
                                                        System.out.println("You choose the Ticket Salesman");
                                                        List<Staff>staffList=staffManagement2.getListStaffTicket("Ticker Seller");
                                                        menu.disPlayStaffbyName(staffList);
                                                        break;
                                                    case 2:
                                                        System.out.println("You choose the Cinema Staff");
                                                        List<Staff>staffList1=staffManagement2.getListStaffTicket("Cinema Staff");
                                                        menu.disPlayStaffbyName(staffList1);
                                                        break;
                                                }
                                                break;
                                        }
                                        break;
                                    case 5:
                                        menu.disPlayStaffbyName(staffManagement2.getListStaff());
                                        break;
                                    case 6:
                                        System.out.println("------STAFF SALARY SEARCH------");
                                        System.out.println("Enter ID you want search:");
                                        scanner.nextLine();
                                        String idSearch = scanner.nextLine();
                                        if (!staffManagement2.checkIDOnList(idSearch)){
                                            System.out.println("Not Found");
                                        }else {
                                            Staff staff = staffManagement2.getListStaff().get(staffManagement2.chekIndexStaff(idSearch));
                                            menu.disPlayStaffbyID(staff);
                                            System.out.println("Total Salary is: "+staffManagement2.getTotalSalary(staff));
                                        }
                                        break;
                                    case 7:
                                        mngAdmin();
                                        break;
                                    case 8:
                                        System.exit(0);
                                        break;
                                }
                            }
                    case 2:
                        int option2;
                        while (true){
                            menu.menuFilmManagement();
                            System.out.println("Choose from 1 to 7");
                            option2=scanner.nextInt();
                            switch (option2) {
                                case 1:
                                    System.out.println("------ADD FILM TO LIST------");
                                    menu.menuInputFilm();
                                    String idFilm ;
                                    scanner.nextLine();
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
                                    filmManagement.addFilm(film);
                                    break;
                                case 2:
                                    System.out.println("------UPDATE FILM------");
                                    String idUd ;
                                    scanner.nextLine();
                                    do {
                                        System.out.println("Enter ID Film u want update:");
                                       idUd = scanner.nextLine();
                                       if (filmManagement.onlyIDFilm(idUd)){
                                           System.out.println("Not Found");
                                       }
                                    }while (filmManagement.onlyIDFilm(idUd));
                                    Input input = new Input();
                                    Film film1= input.inputFilm();
                                    filmManagement.editFilm(film1,idUd);
                                    break;
                                case 3:
                                    System.out.println("------DELETE FILM------");
                                    System.out.println("Enter ID Film U want Delete:");
                                    String idDel;
                                    scanner.nextLine();
                                    do {
                                        System.out.println("Enter ID Film u want delete:");
                                        idDel = scanner.nextLine();
                                        if (filmManagement.onlyIDFilm(idDel)){
                                            System.out.println("Not Found");
                                        }
                                    }while (filmManagement.onlyIDFilm(idDel));
                                    System.out.println("Do you really want to delete");
                                    System.out.println("1.OK                  2.CANCEL");
                                    int choose1=scanner.nextInt();
                                    switch (choose1){
                                        case 1:
                                            filmManagement.delete(idDel);
                                            System.out.println("Successful delete");
                                            break;
                                        case 2:
                                            System.out.println("Cancel successfully");
                                            break;
                                    }
                                    break;
                                case 4:
                                    menu.findFilm();
                                    System.out.println("You want to search movies by:");
                                    int choose=-1;
                                    while (choose==-1){
                                        try {
                                            choose=scanner.nextInt();
                                            if (choose<=0||choose>4){
                                                System.out.println("Enter from 1 to 4");
                                            }
                                        }catch (InputMismatchException exception){
                                            System.out.println("Enter wrong Data type");
                                        }finally {
                                            scanner.nextLine();
                                        }
                                    }
                                    switch (choose){
                                        case 1:
                                            menu.menuCountry();
                                            System.out.println("Enter the country you want to find");
                                            int searchbycountry=-1;
                                            while (searchbycountry==-1){
                                                try {
                                                    searchbycountry=scanner.nextInt();
                                                    if (searchbycountry<=0||searchbycountry>6){
                                                        System.out.println("Enter 1 to 6");
                                                    }
                                                }catch (InputMismatchException exception){
                                                    System.out.println("Enter wrong Data type");
                                                }finally {
                                                    scanner.nextLine();
                                                }
                                            }
                                            switch (searchbycountry){
                                                case 1:
                                                    List<Film>listFilmSameCountry1 = filmManagement.searchByCountry(COUNTRY1_VN);
                                                    menu.disPlayFilm(listFilmSameCountry1);
                                                    break;
                                                case 2:
                                                    List<Film>listFilmSameCountry2 = filmManagement.searchByCountry(COUNTRY2_USA);
                                                    menu.disPlayFilm(listFilmSameCountry2);
                                                    break;
                                                case 3:
                                                    List<Film>listFilmSameCountry3 = filmManagement.searchByCountry(COUNTRY3_JP);
                                                    menu.disPlayFilm(listFilmSameCountry3);
                                                    break;
                                                case 4:
                                                    List<Film>listFilmSameCountry4 = filmManagement.searchByCountry(COUNTRY4_KR);
                                                    menu.disPlayFilm(listFilmSameCountry4);
                                                    break;
                                                case 5:
                                                    List<Film>listFilmSameCountry5 = filmManagement.searchByCountry(COUNTRY5_CN);
                                                    menu.disPlayFilm(listFilmSameCountry5);
                                                    break;
                                                case 6:
                                                    List<Film>listFilmSameCountry6 = filmManagement.searchByCountry(COUNTRY6_TL);
                                                    menu.disPlayFilm(listFilmSameCountry6);
                                                    break;
                                        }

                                            break;
                                        case 2:
                                            System.out.println("---------SEARCH BY NAME---------");
                                            System.out.println("Enter Name Film U want to find:");
                                            String nameSearch = scanner.nextLine();
                                            List<Film>filmListSameName= filmManagement.searchByName(nameSearch);
                                            menu.disPlayFilm(filmListSameName);
                                            break;
                                        case 3:
                                            System.out.println("------SEARCH BY CATEGORY------");
                                            break;
                                        case 4:
                                            System.out.println("------SEARCH BY ACTOR------");
                                            break;
                                    }
                                    break;
                                case 5:
                                    break;
                                case 6:
                                    break;
                                case 7:
                                    break;
                            }
                        }
                    case 3:
                        System.out.println("Choose from 1 to 7");
                        int option3;
                        while (true){
                            menu.menuFilmManagement();
                            option3=scanner.nextInt();
                            switch (option3) {
                                case 1:
                                    break;
                                case 2:
                                    break;
                                case 3:
                                    break;
                                case 4:
                                    break;
                                case 5:
                                    break;
                                case 6:
                                    break;
                                case 7:
                                    break;
                            }
                        }
                    case 4:
                        System.out.println("Choose from 1 to 7");
                        int option4;
                        while (true){
                            menu.menuFilmManagement();
                            option4=scanner.nextInt();
                            switch (option4) {
                                case 1:
                                    break;
                                case 2:
                                    break;
                                case 3:
                                    break;
                                case 4:
                                    break;
                                case 5:
                                    break;
                                case 6:
                                    break;
                                case 7:
                                    break;
                            }
                        }
                    case 5:
                        System.out.println("Choose from 1 to 7");
                        int option5;
                        while (true){
                            menu.menuFilmManagement();
                            option5=scanner.nextInt();
                            switch (option5) {
                                case 1:
                                    break;
                                case 2:
                                    break;
                                case 3:
                                    break;
                                case 4:
                                    break;
                                case 5:
                                    break;
                                case 6:
                                    break;
                                case 7:
                                    break;
                            }
                        }
                    case 6:
                        System.out.println("Choose from 1 to 7");
                        int option6;
                        while (true){
                            menu.menuFilmManagement();
                            option6=scanner.nextInt();
                            switch (option6) {
                                case 1:
                                    break;
                                case 2:
                                    break;
                                case 3:
                                    break;
                                case 4:
                                    break;
                                case 5:
                                    break;
                                case 6:
                                    break;
                                case 7:
                                    break;
                            }
                        }
                    case 7:
                        break;
                    case 8:
                        break;
                    case 9:
                        break;
                }
            }
        }
    }
}
