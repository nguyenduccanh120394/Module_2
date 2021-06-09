import java.io.*;
import java.util.ArrayList;
import java.util.List;
// List<Student> students=(List<Student>)ois.readObject();
public class FileMangement {
    public void writeToFileStaff(String path, List<Staff>staffList){

        FileWriter fileWriter;
        BufferedWriter bw = null;
        try {
             fileWriter = new FileWriter(path);
             bw = new BufferedWriter(fileWriter);
            for (int i = 0; i < staffList.size(); i++) {
             bw.write(staffList.get(i).getId()+","+staffList.get(i).getName()+","+staffList.get(i).getGender()+","+staffList.get(i).getAddress()+","+
                     staffList.get(i).getPhoneNumber()+","+staffList.get(i).getOverTime()+","+staffList.get(i).getRank()+"\n");
            }

            } catch (IOException exception) {
            exception.printStackTrace();
        }finally {
            try {
                bw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }
    public List<Staff> readFromFileStaff(String path){
        List<Staff> staffList = new ArrayList<>();
        FileReader fileReader;
        BufferedReader br = null;
        try {
            String line = null;
            fileReader = new FileReader(path);
            br = new BufferedReader(fileReader);
            while ((line= br.readLine())!=null){
               String[] str = line.split(",");
                staffList.add(new Staff(str[0],str[1],str[2],str[3],str[4],str[5],Integer.parseInt(str[6]),str[7]));
                }
            } catch (FileNotFoundException fileNotFoundException) {
            fileNotFoundException.printStackTrace();
        } catch (IOException exception) {
            exception.printStackTrace();
        }

        return staffList;
    }
    public void writeToFileFilm(String path,List<Film>listFilm){
        FileWriter fileWriter ;
        BufferedWriter bw = null;
        try {
            fileWriter= new FileWriter(path);
            bw = new BufferedWriter(fileWriter);
            for (int i = 0; i < listFilm.size(); i++) {
                bw.write(listFilm.get(i).getIdFilm()+","+listFilm.get(i).getName()+","+listFilm.get(i).getShowTime()+","+listFilm.get(i).getDirectors()+","+
                        listFilm.get(i).getActor()+","+listFilm.get(i).getYearOfManufacture()+","+listFilm.get(i).getCountry()+","+listFilm.get(i).getCategory()+","+
                        listFilm.get(i).getContent()+"\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                bw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
    public List<Film> readFromFileFilm(String path){
            List<Film>filmList= new ArrayList<>();
            FileReader fileReader ;
            BufferedReader br = null;
            try {
                String line = null;
               fileReader= new FileReader(path);
               br = new BufferedReader(fileReader);
               while ((line= br.readLine())!=null){
                   String[]str= line.split(",");
                    filmList.add(new Film(str[0],str[1],str[2],str[3],str[4],Integer.parseInt(str[5]),str[6],str[7],str[8]));
               }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
                e.printStackTrace();
            }
        return filmList;
    }
    public void writeToFileMovieSchedule(String path, List<MovieSchedule>movieScheduleList){
        FileWriter fileWriter;
        BufferedWriter bw = null;
        try {
            fileWriter =  new FileWriter(path);
            bw = new BufferedWriter(fileWriter);
            for (int i = 0; i < movieScheduleList.size(); i++) {
                bw.write(movieScheduleList.get(i).getMovieDay()+","+movieScheduleList.get(i).getMovieShift()+","+movieScheduleList.get(i).getIdMovie()+"\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                bw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    public List<MovieSchedule> readFromFileMovieSchedule(String path){
        List<MovieSchedule>movieScheduleList= new ArrayList<>();
        FileReader fileReader ;
        BufferedReader br = null;
        try {
            String line = null;
            fileReader = new FileReader(path);
            br = new BufferedReader(fileReader);
            while ((line=br.readLine())!=null){
                String[]str=line.split(",");
                movieScheduleList.add(new MovieSchedule(str[1],str[2],str[3]));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return movieScheduleList;
    }
    public void writeToFileCustomer(String path, List<Customer>customerList) {
        FileWriter fileWriter;
        BufferedWriter bw = null;
        try {
            fileWriter = new FileWriter(path);
            bw = new BufferedWriter(fileWriter);
            for (int i = 0; i < customerList.size(); i++) {
                bw.write(customerList.get(i).getName() + "," + customerList.get(i).getPhoneNumber() + "," + customerList.get(i).getEmail() + "," + customerList.get(i).getIdLogin() + "," +
                        customerList.get(i).getPassWord() + "," + customerList.get(i).getDateOfBirth() + "," + customerList.get(i).getGender() + "," + customerList.get(i).getArea() + "\n");
            }
        } catch (IOException exception) {
            exception.printStackTrace();
        } finally {
            try {
                bw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
        public List<Customer> readFromFileCustomer(String path) throws IOException {
            List<Customer>customers= new ArrayList<>();
            FileReader fileReader ;
            BufferedReader br = null;
                String line = null;
                fileReader = new FileReader(path);
                br = new BufferedReader(fileReader);
                while ((line=br.readLine())!=null){
                    String[]str=line.split(",");
                    customers.add(new Customer(str[0],str[1],str[2],str[3],str[4],str[5],str[6],str[7]));
                }
            return customers;
        }
}
