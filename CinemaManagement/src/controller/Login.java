package controller;
import static service.CustomerMangement.checkIdCustomer;
import static service.Input.inPutId;
import static service.Input.inPutPassWord;

public class Login {
    public static void logIn(){
        final String ID_ADMIN="admin";
        final String PASSWORD_ADMIN="admin";
        Admin admin = new Admin();
        Member member = new Member();
        String id = inPutId();
        String passWord = inPutPassWord();
        if (id.equals(ID_ADMIN)&&passWord.equals(PASSWORD_ADMIN)){
                System.out.println("Logged in successfully");
                admin.mngAdmin();
        }else if (checkIdCustomer(id,passWord)){
                member.mngMember();
        }else {
                System.err.println("Error Login wrong ID or Password");
                System.out.println();
                System.out.println("Please log in again!");
                logIn();
        }
    }
}
