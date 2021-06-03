import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Scanner scanner = new Scanner(System.in);
        ManagementPerson managementPerson = new ManagementPerson();
        while (true) {
            System.out.println("======Menu=====");
            System.out.println("1: Thêm người");
            System.out.println("2: Hiển thị danh sách người");
            System.out.println("3: Tìm kiếm thông tin người");
            System.out.println("4: Xóa thông tin người theo id");
            System.out.println("5: Sửa thông tin người theo id");
            System.out.println("6: Sắp xếp học sinh");
            System.out.println("7: exit");
            int choice = -1;
            while (choice == -1) {
                try {
                    choice = scanner.nextInt();
                } catch (InputMismatchException e) {
                    System.out.println("Nhập vào số đi :))))))");
                } finally {
                    scanner.nextLine();
                }
            }
            switch (choice) {
                case 1:
                    System.out.println("Nhập vào thông tin người");
                    managementPerson.add(inputPerson());
                    break;
                case 2:
                    System.out.println(managementPerson.display());
                    break;
                case 3:
                    System.out.println("Nhập thông cần tìm!");
                    int idFind = scanner.nextInt();
                    Person personFind = managementPerson.getPersonList().get(managementPerson.findById(idFind));
                    System.out.println(personFind);
                    break;
                case 5:
                    System.out.println("Nhập thông cần sửa!");
                    Person editPerson = inputPerson();
                    managementPerson.edit(editPerson.getId(), editPerson);
                    break;
                case 4:
                    System.out.println("Nhập thông cần xoá!");
                    int id = scanner.nextInt();
                    managementPerson.remove(id);
                    break;
                default:
                    System.exit(0);
            }
        }
    }

    public static Person inputPerson() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào mã:");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.println("Nhập vào tên:");
        String name = sc.nextLine();
        System.out.println("Nhập vào tuổi:");
        int age = sc.nextInt();
        return new Person(id, name, age);
    }
}
