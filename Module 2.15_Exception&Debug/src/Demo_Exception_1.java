import java.util.Scanner;
public class Demo_Exception_1 {
    public static void main(String[] args) {
       try{
            int zero = 0;
            int average = 10/zero;
            System.out.println("Average = " + average);
       }
       catch (ArithmeticException ex){
           System.out.println(ex);
       }
        System.out.println("Finished!");
    }
}
