import java.util.Scanner;

public class Demott {
    public static void main(String[] args){
    float width;
    float height;

    Scanner scaner  = new Scanner(System.in);

    System.out.println("Enter width : ");
    width = scaner.nextFloat();
    System.out.println("Enter height : ");
    height = scaner.nextFloat();
    float area = width*height;
    System.out.println("Enter area : "+area);
    }

}
