import java.util.Scanner;

public class RegularExpressionTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Class name");
        String regex = scanner.nextLine();
        RegularExpression regularExpression = new RegularExpression();
        boolean result = regularExpression.validate(regex);
        System.out.println("Class name "+regex+" is "+result);
    }
}
