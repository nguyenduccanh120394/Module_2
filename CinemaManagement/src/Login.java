import java.util.ArrayList;
import java.util.List;
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
        System.out.println(customerMangement.getCustomerList());
        for (int i = 0; i < customerMangement.getCustomerList().size(); i++) {
            if (customerMangement.getCustomerList().get(i).getIdLogin().equals(id)&&customerMangement.getCustomerList().get(i).getPassWord().equals(passWord)){
                return true;
            }
        }
        return false;
    }
    public static void logIn(){
        Scanner scanner = new Scanner(System.in);
        Menu menu = new Menu();
        String id = inPutId();
        String passWord = inPutPassWord();
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
                                System.out.println("Add");
                        }
                    }
                }while (choice>0&&choice<6);
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
                }while (choice>0&&choice<6);
            }else {
                System.out.println("Nhap sai");
            }
        }

}
