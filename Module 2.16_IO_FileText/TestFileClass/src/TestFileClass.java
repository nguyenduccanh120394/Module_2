import java.io.File;
import java.io.IOException;

public class TestFileClass {
    public static void main(String[] args) throws IOException {
        File file = new File("Hello.txt");
        file.createNewFile();
        File file1 = new File("Hello2");
        file1.mkdir();
        System.out.println("Does is exits"+file.exists());
        System.out.println("The file has "+file.length()+" byte");
        System.out.println("The file has "+file1.length()+" byte");
        System.out.println("Can be read "+file.canRead());
        System.out.println("Can be read "+file1.canRead());
        System.out.println("Can be written "+file.canWrite());
        System.out.println("Can be written "+file1.canWrite());
        System.out.println("Is it directory "+file.isDirectory());
        System.out.println("Is it directory "+file1.isDirectory());
        System.out.println("Is it Absolute "+file.isAbsolute());
        System.out.println("Is it Absolute "+file1.isAbsolute());
        System.out.println("is it hidden? "+file.isHidden());
        System.out.println("is it hidden? "+file1.isHidden());
        System.out.println("Absolute path is "+file.getAbsolutePath());
        System.out.println("Absolute path is "+file1.getAbsolutePath());
        System.out.println("Last modified on "+new java.util.Date(file.lastModified()));
        System.out.println("Last modified on "+new java.util.Date(file1.lastModified()));

    }
}
