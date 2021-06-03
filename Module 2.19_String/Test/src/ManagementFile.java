
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ManagementFile {
    public static String sourceFile = "data.csv";

    public static void writeToFile(List<Person> personList, String path) throws IOException {
        FileOutputStream writeData = new FileOutputStream(path);
        ObjectOutputStream writeStream = new ObjectOutputStream(writeData);
        writeStream.writeObject(personList);
        writeStream.flush();
        writeStream.close();
    }

    public static List<Person> readFromFile(String path) throws IOException, ClassNotFoundException {
        FileInputStream readData = new FileInputStream(path);
        ObjectInputStream readStream = new ObjectInputStream(readData);
        List<Person> people2 = (ArrayList<Person>) readStream.readObject();
        readStream.close();
        return people2;
    }


}
