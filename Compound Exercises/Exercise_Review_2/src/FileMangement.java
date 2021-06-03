import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileMangement {
    public static final String FILE_HEADER = "Id,Name,Date of Birth,Gender,Address,Email,Average Score"+"\n";
    private static final String COMMA_DELIMITER = ",";
    public void writeToFile(String path, List<Student>list){
        FileWriter fileWriter = null;
        BufferedWriter bw = null;
        try {
            fileWriter= new FileWriter(path) ;
            bw= new BufferedWriter(fileWriter);
            bw.write(FILE_HEADER);
            for (int i = 0; i < list.size(); i++) {
                bw.write(list.get(i).getId()+","+list.get(i).getName()+","+list.get(i).getDateOfBirth()+
                        ","+list.get(i).getGender()+","+list.get(i).getAddress()+","+list.get(i).getEmail()+
                        ","+list.get(i).getAverageScore()+"\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                bw.close();
                fileWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    public static List<Student> readFromFile(String path) throws IOException {
        List<Student> people = new ArrayList<>();
        FileReader fr = new FileReader(path);
        BufferedReader br = new BufferedReader(fr);
        String content = br.readLine();
        while ((content = br.readLine())!=null){
            String[] values = content.split(",");
            people.add(new Student(values[0],values[1],values[2],values[3],values[4],values[5],Float.parseFloat(values[6])));
        }
        return people;
    }
//    public List<Student> readFromFile(String path) throws IOException {
//        List<Student>list=new ArrayList<>();
//        FileReader fileReader ;
//        BufferedReader br=null;
//        try {
//            String line;
//            String lines;
//            fileReader = new FileReader(path);
//            br = new BufferedReader(fileReader);
//            while ((line= br.readLine())!=null){
//                list.add(parseCsvLine(line));
//            }
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }finally {
//            try {
//                    if (br!=null){
//                        br.close();
//                    }
//            } catch (IOException crunchifyException) {
//                crunchifyException.printStackTrace();
//            }
//        }
//        return list;
//    }
//    public Student parseCsvLine(String csvLine){
//        List<String>listString= new ArrayList<>();
//        if(csvLine!=null){
//            String[]splitData=csvLine.split(COMMA_DELIMITER);
//            for (int i = 0; i < splitData.length; i++) {
//                listString.add(splitData[i]);
//            }
//        }
//        Student student = new Student(listString.get(0),listString.get(1),listString.get(2),listString.get(3),
//                    listString.get(4),listString.get(5),Float.parseFloat(listString.get(6)));
//        return student;
//    }
}
