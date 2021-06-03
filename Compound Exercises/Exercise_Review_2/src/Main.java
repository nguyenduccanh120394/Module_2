import java.awt.*;
import java.util.Collection;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentManagement studentManagement = new StudentManagement();
        FileMangement fileMangement = new FileMangement();
        ValidateCheck validateCheck=new ValidateCheck();
        System.out.println("Enter your choice: ");
        while (true){
            menu();
            int choice=-1;
            while (choice==-1){
                try {
                    choice= scanner.nextInt();
                    if (choice<=0||choice>9){
                        System.out.println("Enter 1 to 9 !!!");
                    }
                }catch (InputMismatchException exception){
                    System.out.println("Enter wrong data type ( Enter number 1 to 9 )!!!");
                }finally {
                    scanner.nextLine();
                }
                switch (choice){
                    case 1:
                        System.out.println("Add Student:");
                        System.out.println("[Id type : Cxxxx[G|H|I|K]xx ]\n[Date of birth type: DD-MM-YYYY ]\n[Email type: tên.họ@codegym.vn ]");
                        Student student = validateCheck.input();
                        studentManagement.add(student);
                        break;
                    case 2:
                        System.out.println("Edit Student by ID:");
                        System.out.println("Enter Id u want edit:");
                        String id = scanner.nextLine();
                        studentManagement.editById(id);
                        break;
                    case 3:
                        System.out.println("Delete Student:");
                        System.out.println("Enter Id u want delete");
                        id = scanner.nextLine();
                        List<Student>trash= studentManagement.deleteById(id);
                        fileMangement.writeToFile("Trash.csv",trash);
                        break;
                    case 4:
                        System.out.println("Search Student by :");
                        System.out.println("a.ID     b.Khoang tuoi");
                        String type =scanner.nextLine();
                        switch (type){
                            case "a":
                                System.out.println("Enter ID:");
                                id = scanner.nextLine();
                                int index = studentManagement.findById(id);
                                System.out.println("Information Student u want search is: ");
                                studentManagement.disPlay(index);
                                break;
                            case "b":
                                System.out.println("Search from:");
                                int aboutThis = scanner.nextInt();
                                System.out.println("Search to:");
                                int aboutThat = scanner.nextInt();
                                studentManagement.searchAboutAge(aboutThis,aboutThat);
                                break;
                        }

                        break;
                    case 5:
                        System.out.println("Display Student list:");
                        studentManagement.disPlay();
                        break;
                    case 6:
                        System.out.println("Sort Student list by:");
                        studentManagement.sort();
                        break;
                    case 7:
                        System.out.println("Write to File:");
                        break;
                    case 8:
                        System.out.println("Read from File:");
                        break;
                    case 9:
                        System.out.println("Exit");
                        System.exit(0);
                        break;
                }
            }
        }
    }
    static void menu(){
        System.out.println("=====================Menu===================");
        System.out.println("[1.Add       ]    [2.Edit     ]   [3.Delete]");
        System.out.println("[4.Search    ]    [5.Display  ]   [6.Sort  ]");
        System.out.println("[7.Write File]    [8.Read File]   [9.Exit  ]");
        System.out.println("============================================");
    }

}
