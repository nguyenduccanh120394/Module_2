import java.util.Scanner;

public class Demo_Exception_throw_1 extends Throwable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap age");
        int age = scanner.nextInt();
        validate(age);
    }
    public static void validate(int age){
        if (age<18){
            throw new NullPointerException("Not valid");
        }else {
            System.out.println("Welcome");
        }
    }
}
