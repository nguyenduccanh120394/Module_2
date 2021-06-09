import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Login login =new Login();
        Menu menu = new Menu();
        CustomerMangement customerMangement = new CustomerMangement();
        menu.startMenu();
        int choice = scanner.nextInt() ;
        switch (choice){
            case 1:
                customerMangement.registration();
                System.out.println("Create success!!");
                System.out.println("1.Login        2.Create new acc");
                int choose=scanner.nextInt();
                switch (choose){
                    case 1:
                        login.logIn();
                        break;
                    case 2:
                        customerMangement.registration();
                        break;
                }
                break;
            case 2:
                login.logIn();
                break;
            case 3:
                login.nonMember();
                break;
        }
    }
}
