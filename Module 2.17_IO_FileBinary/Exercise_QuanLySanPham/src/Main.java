import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ProductManagement productManagement = new ProductManagement();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            productManagement.menu();
            int choice = -1;
            while (choice == -1) {
                try {
                    choice = scanner.nextInt();
                    if (choice<=0||choice>6){
                        System.out.println("Enter 1 to 6");
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Enter Number");
                } finally {
                    scanner.nextLine();
                }
            }
            switch (choice) {
                case 1:
                    System.out.println("Add");
                    Product product = productManagement.inPut();
                    productManagement.add(product);
                    break;
                case 3:
                    System.out.println("Delete");
                    System.out.println("Enter id");
                    int id = scanner.nextInt();
                    productManagement.deleteById(id);
                    break;
                case 4:
                    System.out.println("Search");
                    System.out.println("Enter Id");
                    id = scanner.nextInt();
                    int index = productManagement.findById(id);
                    Product product1 = productManagement.getList().get(index);

                    System.out.println(product1);
                    break;
                case 5:
                    System.out.println("DisPlay");
                    productManagement.disPlay();
                    break;
                default:
                    System.exit(0);
            }
        }
    }
}