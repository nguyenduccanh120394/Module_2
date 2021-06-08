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
        System.out.format("|      MENU CUSTOMER     |%n");
        System.out.format("+--------------+---------+%n");
        System.out.format("| Function     |Selection|%n");
        System.out.format("+--------------+---------+%n");
        System.out.format(leftAlignFormat,"SEARCH",1);
        System.out.format(leftAlignFormat,"ADD TO CART",2);
        System.out.format(leftAlignFormat,"DEL FR CART",3);
        System.out.format(leftAlignFormat,"PAY",4);
        System.out.format("+--------------+---------+%n");
    }
}
