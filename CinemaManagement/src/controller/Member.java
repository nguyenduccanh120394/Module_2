package controller;

import model.Customer;
import service.Menu;

import java.util.Scanner;

public class Member extends Customer {
    public Member(){}

    public Member(String name, String phoneNumber, String email, String idLogin, String passWord, String dateOfBirth, String gender, String area) {
        super(name, phoneNumber, email, idLogin, passWord, dateOfBirth, gender, area);
    }
    public void mngMember(){
        Menu menu = new Menu();
        Scanner scanner = new Scanner(System.in);
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
    }
}
