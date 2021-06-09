public class Menu {
    public static void menuAdmin(){
        String leftAlignFormat = "| %-12s | %-7d |%n";
        System.out.format("+--------------+---------+%n");
        System.out.format("|     MENU MANAGEMENT    |%n");
        System.out.format("+--------------+---------+%n");
        System.out.format("| Function     |Selection|%n");
        System.out.format("+--------------+---------+%n");
        System.out.format(leftAlignFormat,"ADD",1);
        System.out.format(leftAlignFormat,"EDIT",2);
        System.out.format(leftAlignFormat,"DELETE",3);
        System.out.format(leftAlignFormat,"SEARCH",4);
        System.out.format(leftAlignFormat,"SORT",5);
        System.out.format("+--------------+---------+%n");
    }
    public static void menuCustomer(){
        String leftAlignFormat = "| %-12s | %-7d |%n";
        System.out.format("+--------------+---------+%n");
        System.out.format("|       MENU MEMBER      |%n");
        System.out.format("+--------------+---------+%n");
        System.out.format("| Function     |Selection|%n");
        System.out.format("+--------------+---------+%n");
        System.out.format(leftAlignFormat,"SEARCH",1);
        System.out.format(leftAlignFormat,"ADD TO CART",2);
        System.out.format(leftAlignFormat,"DEL FR CART",3);
        System.out.format(leftAlignFormat,"PAY",4);
        System.out.format("+--------------+---------+%n");
    }
    public static void menuNonMember(){
        String leftAlignFormat = "| %-12s | %-7d |%n";
        System.out.format("+--------------+---------+%n");
        System.out.format("|     MENU NON-MEMBER    |%n");
        System.out.format("+--------------+---------+%n");
        System.out.format("| Function     |Selection|%n");
        System.out.format("+--------------+---------+%n");
        System.out.format(leftAlignFormat,"SEARCH",1);
        System.out.format(leftAlignFormat,"DISPLAY",2);
        System.out.format(leftAlignFormat,"LOGIN",3);
        System.out.format(leftAlignFormat,"REGISTER",4);
        System.out.format("+--------------+---------+%n");
    }
    public void startMenu(){
        String leftAlignFormat = "| %-18s | %-7d |%n";
        System.out.format("+--------------------+---------+%n");
        System.out.format("|         CINEMA CENTER        |%n");
        System.out.format("+--------------------+---------+%n");
        System.out.format("| Function           |Selection|%n");
        System.out.format("+--------------------+---------+%n");
        System.out.format(leftAlignFormat,"Create new account",1);
        System.out.format(leftAlignFormat,"Login",2);
        System.out.format(leftAlignFormat,"Skip",3);
        System.out.format("+--------------------+---------+%n");
    }
    public void menuRegister(){
        String leftAlignFormat = "| %-18s |%n";
        System.out.format("+--------------------+%n");
        System.out.format(leftAlignFormat,"REGISTER");
        System.out.format("+--------------------+%n");

    }
    public void menuLogin(){
        String leftAlignFormat = "| %-18s |%n";
        System.out.format("+--------------------+%n");
        System.out.format(leftAlignFormat,"LOGIN");
        System.out.format("+--------------------+%n");

    }
}
