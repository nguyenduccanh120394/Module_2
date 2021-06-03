import java.util.Scanner;

public class PhoneNumberCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter phone number");
        String regex = scanner.nextLine();
        PhoneNumber phoneNumber = new PhoneNumber();
        boolean result = phoneNumber.validate(regex);
        System.out.println("Phone number: "+regex+" is "+result);
    }
}
