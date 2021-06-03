import java.util.InputMismatchException;
import java.util.Scanner;

public class Practice_NumberFormatException {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("====Caculator=====");
        int a,b;
        try {
            System.out.println("Enter a: ");
            a = scanner.nextInt();
            System.out.println("Enter b: ");
            b = scanner.nextInt();
            System.out.println("Nhap phep tinh:");
            scanner.nextLine();
            String choice =scanner.nextLine();
            switch (choice){
                case "+":
                    cong(a,b);
                    break;
                case "/":
                    chia(a,b);
                    break;
            }
            }catch (InputMismatchException e){
            System.out.println("Loi nhap sai kieu du lieu "+e.getMessage());
            }
    }
    static void cong(int a, int b){
        int result = a+b;
        System.out.println(result);
    }
    static void chia(int a,int b){
        float result =a/b;
        System.out.println(result);
    }

}
