import java.io.File;
import java.io.IOException;
import java.util.List;

public class Demo_WriteATextFile3 {
    public static void main(String[] args) throws IOException {
        File f = new File("foo.txt");f.createNewFile();
        File dir = new File("Books");dir.mkdir();

        if (dir.isDirectory()){
            String[] dirContents = dir.list();
            for (int i = 0; i < dirContents.length; i++) {
                System.out.println(dirContents[i]);
            }
        }
        System.out.println(dir.getAbsolutePath());
        f.delete();



    }
}
