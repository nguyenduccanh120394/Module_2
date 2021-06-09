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
                                System.out.println("Add");
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
