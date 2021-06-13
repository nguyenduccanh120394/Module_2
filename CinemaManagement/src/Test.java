import model.Film;
import service.FilmManagement;
import service.Menu;
import service.Validate;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Menu menu = new Menu();
        Scanner scanner = new Scanner(System.in);
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

    }
}
