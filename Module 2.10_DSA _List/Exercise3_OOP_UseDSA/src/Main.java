import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        ExamineeManagement examineeManagement = new ExamineeManagement();
        Scanner scanner = new Scanner(System.in);
        Examinee_A examineeA1 =new Examinee_A(1,"Canh","Ha Noi",2);
        Examinee_A examineeA2 =new Examinee_A(4,"Canh","Ninh Binh",3);
        Examinee_A examineeA3 =new Examinee_A(6,"Bao","Thai Nguyen",2);
        Examinee_A examineeA4 =new Examinee_A(2,"Nam","Thai Nguyen",1);
        Examinee_A examineeA5 =new Examinee_A(5,"Nam","Thai Nguyen",2);
        Examinee_A examineeA6 =new Examinee_A(3,"Bao","Thai Nguyen",1);
        examineeManagement.addE(examineeA1);
        examineeManagement.addE(examineeA2);
        examineeManagement.addE(examineeA3);
        examineeManagement.addE(examineeA4);
        examineeManagement.addE(examineeA5);
        examineeManagement.addE(examineeA6);
        System.out.println("Enter your choice: ");
        int choice;
        do {
            menu();
            choice = scanner.nextInt();
            if (choice<=0||choice>6){
                System.out.println("Enter choice only about 1 to 4");
            }else {
                switch (choice){
                    case 1:
                        System.out.println("Add Examinee:");
                        System.out.println("Enter Object U want add");
                        menu1();
                        String type = scanner.next();
                        switch (type){
                            case "a":
                                System.out.println("Enter SBD:");
                                int SBD= scanner.nextInt();
                                System.out.println("Enter Name:");
                                scanner.nextLine();
                                String name=scanner.nextLine();
                                System.out.println("Enter Address: ");
                                String address = scanner.nextLine();
                                System.out.println("Enter priority: ");
                                int priority = scanner.nextInt();
                                Examinee_A examineeA =new Examinee_A(SBD,name,address,priority);
                                examineeManagement.addE(examineeA);
                                examineeManagement.disPlay();
                                break;
                            case "b":
                                System.out.println("Enter SBD:");
                                SBD= scanner.nextInt();
                                System.out.println("Enter Name:");
                                scanner.nextLine();
                                name=scanner.nextLine();
                                System.out.println("Enter Address: ");
                                address = scanner.nextLine();
                                System.out.println("Enter priority: ");
                                priority = scanner.nextInt();
                                Examinee_B examineeB =new Examinee_B(SBD,name,address,priority);
                                examineeManagement.addE(examineeB);
                                examineeManagement.disPlay();
                                break;
                            case "c":
                                System.out.println("Enter SBD:");
                                SBD= scanner.nextInt();
                                System.out.println("Enter Name:");
                                scanner.nextLine();
                                name=scanner.nextLine();
                                System.out.println("Enter Address: ");
                                address = scanner.nextLine();
                                System.out.println("Enter priority: ");
                                priority = scanner.nextInt();
                                Examinee_C examineeC =new Examinee_C(SBD,name,address,priority);
                                examineeManagement.addE(examineeC);
                                examineeManagement.disPlay();
                                break;
                            case "d":
                                System.exit(1);
                                break;
                            default:
                                if (type!="a"&&type!="b"&&type!="c"&&type!="d"){
                                    System.out.println(" U only enter type is a , b ,c ");
                                }
                        }
                        break;
                    case 2:
                        System.out.println("Display list Examinee");
                        examineeManagement.disPlay();
                        break;
                    case 3:
                        System.out.println("Find Examinee by SBD or Name");
                        System.out.println("Do you want to search by: ");
                        System.out.println("1. By SBD:");
                        System.out.println("2. By Name: ");
                        int chosse = scanner.nextInt();
                        switch (chosse) {
                            case 1:
                                System.out.println("Enter SBD u want find :");
                                int SBD = scanner.nextInt();
                                int indexS = examineeManagement.findBySBD(SBD);
                                System.out.println("Information u want find is: ");
                                examineeManagement.disPlay(indexS);
                            break;
                            case 2:
                                System.out.println("Enter Name u want find :");
                                scanner.nextLine();
                                String name = scanner.nextLine();
                                System.out.println("Information u want find is: ");
                                examineeManagement.findByName(name);


                            break;
                            default:
                                if (chosse!=1&&chosse!=2){
                                    System.out.println("U only enter about 1 to 2");
                                }
                        }
                        break;
                    case 4:
                        System.out.println("Delete Examinee");
                        System.out.println("Enter SBD U want delete: ");
                        int SBD = scanner.nextInt();
                        examineeManagement.delete(SBD);
                        examineeManagement.disPlay();
                        break;
                    case 5:
                        System.out.println("Edit Examinee: ");
                        System.out.println("Enter SBD U want Edit: ");
                        SBD = scanner.nextInt();
                        int indexS = examineeManagement.findBySBD(SBD);
                        System.out.println("Information u want edit is: ");
                        examineeManagement.disPlay(indexS);
                        System.out.println("Enter name u want edit:");
                        scanner.nextLine();
                        String name=scanner.nextLine();
                        System.out.println("Enter Address: ");
                        String address = scanner.nextLine();
                        System.out.println("Enter priority: ");
                        int priority = scanner.nextInt();
                        System.out.println("Enter Khối thi U want edit: ");
                        System.out.println("Enter a if U want edit is Examinee_A: ");
                        System.out.println("Enter b if U want edit is Examinee_B: ");
                        System.out.println("Enter c if U want edit is Examinee_C: ");
                        scanner.nextLine();
                        String khoi =scanner.nextLine();
                        switch (khoi){
                            case "a":
                                Examinee_A examineeA = new Examinee_A(SBD,name,address,priority);
                                examineeManagement.edit(SBD,examineeA);
                                break;
                            case "b":
                                Examinee_B examineeB = new Examinee_B(SBD,name,address,priority);
                                examineeManagement.edit(SBD,examineeB);
                                break;
                            case "c":
                                Examinee_C examineeC= new Examinee_C(SBD,name,address,priority);
                                examineeManagement.edit(SBD,examineeC);
                                break;
                            default:
                                if (khoi!="a"&&khoi!="b"&&khoi!="c"){
                                    System.out.println("U only enter a , b , c ");
                                }
                        }
                        examineeManagement.disPlay();
                        break;
                    case 6:
                        System.out.println("U want sort by :");
                        System.out.println("a.By SBD");
                        System.out.println("b.By Name");
                        scanner.nextLine();
                        String sortBy = scanner.nextLine();
                        switch (sortBy){
                            case "a":
                                System.out.println("List before sort is:");
                                examineeManagement.sort();
                                examineeManagement.disPlay();
                                break;
                            case "b":
                                System.out.println();
                                break;
                            default:
                                if (sortBy!="a"&&sortBy!="b"){
                                    System.out.println("Enter only a or b");
                                }
                        }
                        break;
                }
            }

        }while (choice>0&&choice<=6);
    }
    public static void menu(){
        System.out.println("====Menu====");
        System.out.println("1.Add Examinee");
        System.out.println("2.Display list Examinee");
        System.out.println("3.Find Examinee by SBD or Name");
        System.out.println("4.Delete Examinee");
        System.out.println("5.Edit Examinee");
        System.out.println("6.Sort Examinee");

    }
    public static void menu1(){
        System.out.println("====Menu====");
        System.out.println("a.Add Examinee_A");
        System.out.println("b.Add Examinee_B");
        System.out.println("c.Add Examinee_C");
        System.out.println("d.Exit Program");
    }
}
