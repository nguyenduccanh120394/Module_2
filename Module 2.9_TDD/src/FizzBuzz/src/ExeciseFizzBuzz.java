import java.util.Scanner;

public class ExeciseFizzBuzz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number: ");
        int number;
        do {
            number = scanner.nextInt();
            if (number<0){
                System.out.println("Enter Number (Number > 0)");
            }else {
                    if (number%3==0){
                        System.out.println("Fizz");
                    }else if (number%5==0){
                        System.out.println("Buzz");
                    }else if (number%5==0 && number%3==0){
                        System.out.println("FizzBuzz");
                    }else {
                        System.out.println(number);
                    }
                }
        }while (number<0);

    }
}
