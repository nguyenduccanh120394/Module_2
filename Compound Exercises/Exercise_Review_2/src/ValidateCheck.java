import java.util.Scanner;

public class ValidateCheck {
    static Student input(){
        Validate checkvl = new Validate();
        StudentManagement studentManagement = new StudentManagement();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter id:");
        String id;
        boolean checkID;
        boolean checkIDs;
        do {
            id = scanner.nextLine();
            checkID = checkvl.validateId(id);
            checkIDs=checkvl.checkID(id);
            if (checkID==false){
                System.out.println("Enter wrong data type !! Enter again (Cxxxx[G|H|I|K]xx)");
            }else if (checkIDs==false){
                System.out.println("ID đã tồn tại!!!");
            }
        }while (checkID==false||checkIDs==false);
        System.out.println("Enter name:");
        String name = scanner.nextLine();
        System.out.println("Enter date of birth:");
        String dateOfBirth;
        boolean checkDate;
        do {
            dateOfBirth=scanner.nextLine();
            checkDate=checkvl.validateDate(dateOfBirth);
            if (checkDate==false){
                System.out.println("Enter wrong data type !! Enter again (DD-MM-YYYY)");
            }
        }while (checkDate==false);
        System.out.println("Enter gender:");
        String gender = scanner.nextLine();
        System.out.println("Enter address:");
        String address =scanner.nextLine();
        System.out.println("Enter email:");
        String email;
        boolean checkEmail ;
        do {
            email= scanner.nextLine();
            checkEmail = checkvl.validateEmail(email);
            if (checkEmail==false){
                System.out.println("Enter wrong data type !! Enter again (tên.họ@codegym.vn)");
            }
        }while (checkEmail==false);
        System.out.println("Enter average score:");
        float averageScore = scanner.nextFloat();
        Student student = new Student(id,name,dateOfBirth,gender,address,email,averageScore);
        return student;
    }
}
