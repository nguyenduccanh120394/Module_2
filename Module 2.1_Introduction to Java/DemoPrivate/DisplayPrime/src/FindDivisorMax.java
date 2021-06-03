import java.util.Scanner;

public class FindDivisorMax {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number a: ");
        int a = input.nextInt();
        a= Math.abs(a);
        System.out.println("Enter number b: ");
        int b = input.nextInt();
        b= Math.abs(b);
        if (a==0||b==0) {
            System.out.println("No gretest common factor: ");
        }else {
            while (a!=b){
                if (a>b){
                    a=a-b;
                }else {
                    b=b-a;
                }
            }
            System.out.println("Divisor Max is : "+a);
        }

    }
}
