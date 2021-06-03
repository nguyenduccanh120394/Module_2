import java.io.*;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;

public class CopyFile {
    public void copyFileUsingStream(File source, File dest)throws FileNotFoundException{
        InputStream is = null;
        OutputStream os = null;
        try {
            is = new FileInputStream(source) ;
            os = new FileOutputStream(dest);
            byte[]bytes= new byte[1024];
            int length;
            while ((length=is.read(bytes))>0){
                os.write(bytes,0,length);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                is.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    public void copyFileUsingJava7Files(File source,File dest)throws IOException{
        Files.copy(source.toPath(), dest.toPath(), StandardCopyOption.REPLACE_EXISTING);
    }
}
