import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    StaffManagement staffManagement = new StaffManagement();
        Staff staff1 = new Developer(2,"Nguyễn Văn Bảo",25,"0366254789","Bao196@gmail.com",13000000,20);
        Staff staff2 = new Developer(5,"Nguyễn Bảo Bình",26,"0366254987","NamDev@gmail.com",15000000,30);
        Staff staff3 = new Developer(3,"Lê Văn Long",22,"0366254653","LongDev@gmail.com",10000000,10);
        Staff staff4 = new Developer(1,"Nguyễn Bảo Bình",24,"0366254111","BìnhDev@gmail.com",12000000,20);
        Staff staff5 = new Tester(8,"Nguyễn Đức Tùng",24,"0366254222","TùngTT@gmail.com",12500000,15);
        Staff staff6 = new Tester(7,"Lê Đức Chiến",26,"0366254333","ChiếnTT@gmail.com",12200000,25);
        Staff staff7 = new Tester(4,"Nguyễn Đức Bình",25,"0366254001","BìnhTT@gmail.com",12300000,30);
        staffManagement.addStaff(staff1);
        staffManagement.addStaff(staff2);
        staffManagement.addStaff(staff3);
        staffManagement.addStaff(staff4);
        staffManagement.addStaff(staff5);
        staffManagement.addStaff(staff6);
        staffManagement.addStaff(staff7);
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            menu();
            System.out.println("Enter your choice: ");
            choice=scanner.nextInt();
            if (choice<=0||choice>8){
                System.out.println("Enter 1 to 7");
            }else {
                switch (choice){
                    case 1:
                        System.out.println("Add Staff");
                        System.out.println("Please choose again:");
                        System.out.println("a.Add Developer");
                        System.out.println("b.Add Tester");
                        scanner.nextLine();
                        String type=scanner.nextLine();
                        switch (type){
                            case "a":
                                System.out.println("Enter id:");
                                int id = scanner.nextInt();
                                System.out.println("Enter name:");
                                scanner.nextLine();
                                String name= scanner.nextLine();
                                System.out.println("Enter age: ");
                                int age = scanner.nextInt();
                                System.out.println("Enter Phone number:");
                                scanner.nextLine();
                                String phoneNumber= scanner.nextLine();
                                System.out.println("Enter Email: ");
                                String email=scanner.nextLine();
                                System.out.println("Enter Basic Slary :");
                                int basicSlary = scanner.nextInt();
                                System.out.println("Enter Overtime hours :");
                                float overTime = scanner.nextFloat();
                                Developer developer = new Developer(id,name,age,phoneNumber,email,basicSlary,overTime);
                                staffManagement.addStaff(developer);
                                staffManagement.displayList();
                                break;
                            case "b":
                                System.out.println("Enter id:");
                                id =scanner.nextInt();
                                System.out.println("Enter name:");
                                scanner.nextLine();
                                name= scanner.nextLine();
                                System.out.println("Enter age: ");
                                age = scanner.nextInt();
                                System.out.println("Enter Phone number:");
                                scanner.nextLine();
                                phoneNumber= scanner.nextLine();
                                System.out.println("Enter Email: ");
                                email=scanner.nextLine();
                                System.out.println("Enter Basic Slary :");
                                basicSlary = scanner.nextInt();
                                System.out.println("Enter found error in month :");
                                int foundError = scanner.nextInt();
                                Tester tester = new Tester(id,name,age,phoneNumber,email,basicSlary,foundError);
                                staffManagement.addStaff(tester);
                                staffManagement.displayList();
                                break;
                            default:
                                if (type!="a"&&type!="b"){
                                    System.out.println("Enter a & b");
                                }
                        }
                        break;
                    case 2:
                        System.out.println("=====Staff List=====");
                        System.out.println("Please choose again:");
                        System.out.println("a.Display Dev list");
                        System.out.println("b.Display Tester list");
                        System.out.println("c.Display Staff list");
                        scanner.nextLine();
                        String choose = scanner.nextLine();
                        switch (choose){
                            case "a":
                                List<Developer>listDev= staffManagement.displayDevList();
                                System.out.println("Developer list : ");
                                for (int i = 0; i < listDev.size(); i++) {
                                    System.out.println(listDev.get(i));
                                }
                                break;
                            case "b":
                                List<Tester>listTes=staffManagement.displayTesterList();
                                System.out.println("Tester list : ");
                                for (int i = 0; i < listTes.size(); i++) {
                                    System.out.println(listTes.get(i));
                                }
                                break;
                            case "c":
                                staffManagement.displayList();
                                System.out.println("====================");
                                break;
                        }
                        break;
                    case 3:
                        System.out.println("Please choose again:");
                        System.out.println("a.Search By ID:");
                        System.out.println("b.Search By Name:");
                        System.out.println("c.Search By Email:");
                        System.out.println("d.Search By Basic Salary:");
                        scanner.nextLine();
                        String pick = scanner.nextLine();
                        switch (pick){
                            case "a":
                                System.out.println("Search By ID");
                                System.out.println("Enter ID U want search:");
                                int id = scanner.nextInt();
                                int index = staffManagement.searchById(id);
                                System.out.println("The employee information you want to find is: ");
                                staffManagement.displayIndex(index);
                                break;
                            case "b":
                                System.out.println("Search By Name");
                                System.out.println("Enter Name U want search:");
                                String name = scanner.nextLine();
                                List<Staff> listName= staffManagement.searchByName(name);
                                System.out.println("The employee information you want to find is: ");
                                staffManagement.displayListName(listName);
                                break;
                            case "c":
                                System.out.println("Search By Email");
                                System.out.println("Enter email u want Search: ");
                                String email = scanner.nextLine();
                                index=staffManagement.searchByEmail(email);
                                System.out.println("The employee information you want to find is: ");
                                staffManagement.displayIndex(index);
                                break;
                            case "d":
                                break;
                        }
                        break;
                    case 4:
                        System.out.println("Enter the location you want to delete: ");
                        int index = scanner.nextInt();
                        System.out.println("The Location u want delete is");
                        staffManagement.displayIndex(index);
                        staffManagement.delete(index);
                        break;
                    case 5:
                        System.out.println("Please choose again:");
                        System.out.println("a.Edit Developer");
                        System.out.println("b.Edit Tester");
                        scanner.nextLine();
                        String edit =scanner.nextLine();
                        switch (edit){
                            case "a":
                                System.out.println("Enter id:");
                                int id = scanner.nextInt();
                                index = staffManagement.searchById(id);
                                System.out.println("Developer infomation u want edit is:");
                                staffManagement.displayIndex(index);
                                System.out.println("Enter new name:");
                                scanner.nextLine();
                                String name= scanner.nextLine();
                                System.out.println("Enter new age: ");
                                int age = scanner.nextInt();
                                System.out.println("Enter new Phone number:");
                                scanner.nextLine();
                                String phoneNumber= scanner.nextLine();
                                System.out.println("Enter new Email: ");
                                String email=scanner.nextLine();
                                System.out.println("Enter new Basic Slary :");
                                int basicSlary = scanner.nextInt();
                                System.out.println("Enter new Overtime hours :");
                                float overTime = scanner.nextFloat();
                                Developer developerNew=new Developer(id,name,age,phoneNumber,email,basicSlary,overTime);
                                staffManagement.edit(id,developerNew);
                                staffManagement.displayList();
                                break;
                            case "b":
                                System.out.println("Enter id:");
                                id = scanner.nextInt();
                                index = staffManagement.searchById(id);
                                System.out.println("Tester infomation u want edit is:");
                                staffManagement.displayIndex(index);
                                System.out.println("Enter new name:");
                                scanner.nextLine();
                                name= scanner.nextLine();
                                System.out.println("Enter new age: ");
                                age = scanner.nextInt();
                                System.out.println("Enter new Phone number:");
                                scanner.nextLine();
                                phoneNumber= scanner.nextLine();
                                System.out.println("Enter new Email: ");
                                email=scanner.nextLine();
                                System.out.println("Enter new Basic Slary :");
                                basicSlary = scanner.nextInt();
                                System.out.println("Enter new Overtime hours :");
                                int foundError = scanner.nextInt();
                                Tester testerNew =new Tester(id,name,age,phoneNumber,email,basicSlary,foundError);
                                staffManagement.edit(id,testerNew);
                                staffManagement.displayList();
                                break;
                            }
                        break;
                    case 6:
                        System.out.println("Sort Staff list");
                        System.out.println("Please choose again:");
                        System.out.println("a.Sort by Name:");
                        System.out.println("b.Sort by Basic Salary:");
                        scanner.nextLine();
                        String sortBy = scanner.nextLine();
                        switch (sortBy){
                            case "a":
                                System.out.println("List before sort:================");
                                staffManagement.displayList();
                                Collections.sort(staffManagement.staffList, new Comparator<Staff>() {
                                    @Override
                                    public int compare(Staff o1, Staff o2) {
                                        if(o1.getName().compareTo(o2.getName())==0)
                                            return o1.getAge()-o2.getAge();
                                        return o1.getName().compareTo(o2.getName());
                                    }
                                });
                                System.out.println("List after sort:================");
                                staffManagement.displayList();
                                break;
                            case "b":
                                System.out.println("List before sort:================");
                                staffManagement.displayList();
                                Collections.sort(staffManagement.staffList, new Comparator<Staff>() {
                                    @Override
                                    public int compare(Staff o1, Staff o2) {
                                        return o1.getBasicSalary()-o2.getBasicSalary();
                                    }
                                });
                                break;
                        }
                        break;
                    case 7:
                        System.out.println("Hiển thị danh sách nhân viên có lương dưới mức trung bình của công ty");
                        System.out.println("Please choose again:");
                        System.out.println("a.By Developer:");
                        System.out.println("b.By Tester:");
                        scanner.nextLine();
                        String displayBy= scanner.nextLine();
                        switch (displayBy){
                            case "a":
                                System.out.println("By Dev");
                                System.out.println("Danh sách nhân viêc có mức lương dưới mức trung bình là:");
                                staffManagement.displaySalaryDev();
                                break;
                            case "b":
                                break;
                        }
                        break;
                    case 8:
                        System.exit(0);
                        break;
                }
            }
        }while (choice>0&&choice<=8);
    }
    static void menu(){
        System.out.println("==================MENU==================");
        System.out.println("1.Add Staff (By Dev or Tester) ");
        System.out.println("2.Display Staff list (Dev list, Tester list, All Staff) ");
        System.out.println("3.Search Staff (By Id or Name or Email or Basic Salary)");
        System.out.println("4.Delete Staff (By Id)");
        System.out.println("5.Edit Staff list (By Id)");
        System.out.println("6.Sort Staff list (By Name or Basic Salary)");
        System.out.println("7.Hiển thị danh sách nhân viên có mức lương dưới mức trung bình:(By Dev or Tester) ");
        System.out.println("8.Exit ");
        System.out.println("========================================");
    }
}
