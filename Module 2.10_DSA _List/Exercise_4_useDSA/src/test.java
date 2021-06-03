import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        KhuPho khuPho = new KhuPho();
        Scanner scanner = new Scanner(System.in);
                System.out.println("Enter choice:");
                System.out.println("1.Add Family");
                System.out.println("2.Display:");
                int choice=scanner.nextInt();
                switch (choice){
                    case 1:
                        System.out.println("Enter name:");
                        scanner.nextLine();
                        String name = scanner.nextLine();
                        System.out.println("Enter age:");
                        int age = scanner.nextInt();
                        System.out.println("Enter job:");
                        scanner.nextLine();
                        String job = scanner.nextLine();
                        System.out.println("Enter passport:");
                        String passport = scanner.nextLine();
                        System.out.println("Enter apartment number: ");
                        int soNha= scanner.nextInt();
                        Nguoi nguoi = new  Nguoi(name,age,job,passport);
                        List<Nguoi>person = new ArrayList<>();
                        person.add(nguoi);
                        HoGiaDinh hoGiaDinh = new HoGiaDinh(person,soNha);
                        List<HoGiaDinh> danhsach = new ArrayList<>();
                        danhsach.add(hoGiaDinh);
                        for (int i = 0; i < danhsach.size(); i++) {
                            System.out.println("Family "+(i+1)+" "+danhsach.get(i));
                        }
                        break;
                    case 2:
                        break;
                }
            }
}
