import java.util.Scanner;
public class CheckPrime {
    public static void main(String[] args) {
    System.out.println("Enter number");
    Scanner scanner = new Scanner(System.in);
    int number = scanner.nextInt();
    if (number<2){
        System.out.println("Number í not Prime");
    }else{
        int i= 2 ;
        boolean check = true;
            while (i<=Math.sqrt(number)){
                if (number%i==0){
                    check=false;
                    break;
                }
                i++;
            }
        if (check){
            System.out.println(number+"is a prime");
        }else{
            System.out.println(number+"is not a prime");
        }
    }
    }
}
