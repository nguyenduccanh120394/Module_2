import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Management staff = new Management();
        menu();
        System.out.println("Enter your choice :");
        int choice;
        do {
            choice = scanner.nextInt();
            menu();
            if (choice<=0){
                System.out.println("Enter your choice (0<choise<5)");
            }else {
                switch (choice){
                    case 1:
                        System.out.println("1.Add Staff");
                        System.out.println("Type a to add Engineer ");
                        System.out.println("Type b to add Employee ");
                        System.out.println("Type c to add Worker ");
                        String type = scanner.next();
                        switch (type){
                            case "a":
                                System.out.println("Enter Information ");
                                System.out.println("Enter name :");
                                scanner.nextLine();
                                String name = scanner.nextLine();
                                System.out.println("Enter age : ");
                                int age = scanner.nextInt();
                                System.out.println("Enter gender : ");
                                scanner.nextLine();
                                String gender = scanner.nextLine();
                                System.out.println("Enter address : ");
                                String address = scanner.nextLine();
                                System.out.println("Enter training industry : ");
                                String trainingIndustry = scanner.nextLine();
                                Engineer engineer= new Engineer(name,age,gender,address,trainingIndustry);
                                staff.addS(engineer);
                                staff.display();
                                break;
                            case "b":
                                Employee employee= new Employee();

                                staff.addS(employee);
                                break;
                            case "c":
                                Worker worker = new Worker();

                                staff.addS(worker);
                                break;
                            default:
                                if (type!="a" && type!="b" && type!="c"){
                                    System.out.println("Enter type (a,b,c)");
                                }
                                menu();
                        }
                        break;
                    case 2:
                        System.out.println("2.Find Staff by name");
                        scanner.nextLine();
                        System.out.println("Enter Name u want search");
                        String findbyname = scanner.next();
                        scanner.nextLine();
                        int index = staff.find(findbyname);
                        System.out.println("Location of Engineer u want search : "+index);
                        System.out.println("Information Engineer u want search : "+staff.getDanhsach()[index]);
                        break;
                    case 3:
                        System.out.println("3.Display Staff list");
                        staff.display();
                        break;
                    case 4:
                        System.out.println("4.Exit");
                        System.exit(0);
                        break;
                }
            }menu();
        }while (choice>=1&&choice<=4);


    }
    static void menu(){
        System.out.println("Menu");
        System.out.println("1.Add Staff");
        System.out.println("2.Find Staff by name");
        System.out.println("3.Display Staff list");
        System.out.println("4.Exit");
        System.out.println("---------------------");
    }

}
