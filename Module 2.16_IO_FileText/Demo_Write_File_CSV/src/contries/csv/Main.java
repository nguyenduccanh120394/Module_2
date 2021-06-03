package contries.csv;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    private static final String COMMA_DELIMITER = ",";
    private static final String NEW_LINE_SEPARATOR = "\n";
    private static final String FILE_HEADER = "id,code,name";

    public static void main(String[] args) {
        String filePath = "contries.csv";
        try {
            writeCsvFile(filePath);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    static List<Country> add(){
        List<Country>list= new ArrayList<>();
        Country country1= new Country(1,"HN","Ha Noi");
        Country country2= new Country(1,"NB","Ninh Binh");
        Country country3= new Country(1,"BN","Bac Ninh");
        Country country4= new Country(1,"HP","Hai Phong");
        list.add(country1);
        list.add(country2);
        list.add(country3);
        list.add(country4);
        return list;
    }
    static void writeCsvFile(String filePath)throws IOException {
        FileWriter fileWriter = null;
        List<Country> list = add();
        try {
            fileWriter = new FileWriter(filePath);
            fileWriter.append(FILE_HEADER);
            fileWriter.append(NEW_LINE_SEPARATOR);
            for (Country item : list) {
                fileWriter.append(String.valueOf(item.getId()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(item.getCode());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(item.getName());
                fileWriter.append(NEW_LINE_SEPARATOR);
            }
        } catch (IOException e) {
            System.out.println("Not Found");
        } finally {
                fileWriter.close();

        }
    }
}
