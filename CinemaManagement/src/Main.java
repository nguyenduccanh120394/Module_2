import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Login login =new Login();
        CustomerMangement customerMangement = new CustomerMangement();
        System.out.println("Do you already have an account?");
        System.out.println("1.Create new account   2.Login");
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
                        break;
                }
                break;
            case 2:
                login.logIn();
                break;
        }
    }
}
