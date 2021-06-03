import java.util.InputMismatchException;
import java.util.Scanner;

public class ExtendedExercises {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Enter a");
            float a = scanner.nextFloat();
            System.out.println("Enter b");
            float b = scanner.nextFloat();
            chia(a,b);
        }catch (InputMismatchException e){
            System.out.println("Loi nhap sai kieu du lieu: "+e.getMessage());
        }catch (ArithmeticException e){
            System.out.println("Loi nhap so bi chia = 0");
        }
    }
    public static void chia(float a, float b)throws InputMismatchException{
        float result = a/b;
        if (b!=0){
        System.out.println("Result = "+result);
        }else {
            throw new ArithmeticException();
        }
    }

}
