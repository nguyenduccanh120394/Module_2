import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        StudentManagement studentManagement = new StudentManagement();
        Scanner scanner = new Scanner(System.in);
        Map<Integer,Student> student = new HashMap<>();
        System.out.println("Enter your choice:");
        int choice;
        do {
            menu();
            choice = scanner.nextInt();
            if (choice<=0||choice>6){
                System.out.println("Enter your choice: (0<N<6)");
            }else {
                switch (choice){
                    case 1:
                        System.out.println("1.Add Student");
                        System.out.println("Enter Id");
                        int id = scanner.nextInt();
                        System.out.println("Enter Name");
                        scanner.nextLine();
                        String name = scanner.nextLine();
                        System.out.println("Enter Age");
                        int age = scanner.nextInt();
                        System.out.println("Enter level");
                        int level = scanner.nextInt();
                        Student student1 = new Student(id,name,age,level);
                        studentManagement.addS(id,student1);
                        studentManagement.disPlay();
                        break;
                    case 2:
                        System.out.println(".Edit Student");
                        System.out.println("Enter ID u want edit: ");
                        id = scanner.nextInt();
                        System.out.println("Enter new Name");
                        scanner.nextLine();
                        name = scanner.nextLine();
                        System.out.println("Enter new Age");
                        age = scanner.nextInt();
                        System.out.println("Enter new level");
                        level = scanner.nextInt();
                        Student student2 = new Student(id,name,age,level);
                        studentManagement.edit(id,student2);
                        studentManagement.disPlay();
                        break;
                    case 3:
                        System.out.println("Search Student");
                        System.out.println("Enter id u want search:");
                        id =scanner.nextInt();
                        System.out.println("Information Student u want search is :");
                        System.out.println( studentManagement.find(id));
                        break;
                    case 4:
                        System.out.println(".Delete Student");
                        System.out.println("Enter id u want delete:");
                        id =scanner.nextInt();
                        studentManagement.delete(id);
                        break;
                    case 5:
                        System.out.println(".Sort List Student");
                        studentManagement.sort();
                        studentManagement.disPlay();
                        break;
                    case 6:
                        System.out.println(".Display List Student");
                        studentManagement.disPlay();
                        break;
                }
            }
        }while (choice>=0||choice<=6);
    }
    public static void menu(){
        System.out.println("Menu");
        System.out.println("1.Add Student");
        System.out.println("2.Edit Student");
        System.out.println("3.Search Student");
        System.out.println("4.Delete Student");
        System.out.println("5.Sort List Student");
        System.out.println("6.Display List Student");

    }
}
