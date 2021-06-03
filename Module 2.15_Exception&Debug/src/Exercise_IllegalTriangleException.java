import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercise_IllegalTriangleException extends Throwable {
    public static void main(String[] args) throws Exercise_IllegalTriangleException {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Enter a");
            double a = scanner.nextDouble();
            System.out.println("Enter b");
            double b =scanner.nextDouble();
            System.out.println("Enter c");
            double c = scanner.nextDouble();
            checkTriangle(a,b,c);
        }catch (InputMismatchException e){
            System.out.println(e +" Day khong phai tam giac");
        }
    }

    static void checkTriangle(double a,double b, double c) throws Exercise_IllegalTriangleException{
        if (a+b>c&&a>0&&b>0&&c>0||b+c>a&&a>0&&b>0&&c>0||c+a>b&&a>0&&b>0&&c>0){
            System.out.println(" Day la tam giac");
        }else {
            throw new InputMismatchException();
        }
    }


}
