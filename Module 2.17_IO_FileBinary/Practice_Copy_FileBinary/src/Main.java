import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter File source");
        File fileSource = new File(scanner.nextLine());
        System.out.println("Enter File dest");
        File fileDest = new File(scanner.nextLine());
        CopyFile copyFile = new CopyFile();
        try {
            copyFile.copyFileUsingStream(fileSource,fileDest);
            System.out.println("Finished!");
        } catch (FileNotFoundException e) {
            System.out.println("Khong the copy");;
        }
    }
}
