package controller;

import service.CustomerMangement;
import service.Menu;

import java.util.Scanner;

import static controller.Login.logIn;

public class NonMember {

    public static void nonMember(){
        CustomerMangement customerMangement = new CustomerMangement();
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
