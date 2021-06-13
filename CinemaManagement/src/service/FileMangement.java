package service;
import model.*;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
public class FileMangement {
    public void writeToFileStaff(String path, List<Staff>staffList){

        FileWriter fileWriter;
        BufferedWriter bw = null;
        try {
             fileWriter = new FileWriter(path);
             bw = new BufferedWriter(fileWriter);
             bw.write("Staff ID,Staff Name,Staff Gender,Staff Address,Staff PhoneNumber,Staff Mission,OverTime Of Staff,Staff Rank\n");
            for (int i = 0; i < staffList.size(); i++) {
             bw.write(staffList.get(i).getId()+","+staffList.get(i).getName()+","+staffList.get(i).getGender()+","+staffList.get(i).getAddress()+","+
                     staffList.get(i).getPhoneNumber()+","+staffList.get(i).getMission()+","+staffList.get(i).getOverTime()+","+staffList.get(i).getRank()+"\n");
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
            fileReader = new FileReader(path);
            br = new BufferedReader(fileReader);
            String line = br.readLine();
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

    public List<MovieSchedule> readFromFileMovieSchedule(String path){
        List<MovieSchedule>movieScheduleList= new ArrayList<>();
        FileReader fileReader ;
        BufferedReader br = null;
        try {
            fileReader = new FileReader(path);
            br = new BufferedReader(fileReader);
            String line = br.readLine();
            while ((line=br.readLine())!=null){
                String[]str=line.split(",");
                movieScheduleList.add(new MovieSchedule(str[0],str[1],str[2]));
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
    public void writeToFileCinemaRoom(String path, List<CinemaRoom>cinemaRoomList,String idStaff){

        FileWriter fileWriter;
        BufferedWriter bw = null;
        try {
            fileWriter = new FileWriter("dataCinemaRoom.csv");
            bw = new BufferedWriter(fileWriter);
            bw.write("Room Code,Kind Of Room,Staff Of Room\n");
            for (int i = 0; i < cinemaRoomList.size(); i++) {
                bw.write(cinemaRoomList.get(i).getRoomCode()+","+cinemaRoomList.get(i).getKindOfRoom()+","+cinemaRoomList.get(i).getStaff(idStaff)+"\n");
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
    public List<CinemaRoom> readFromFileCinemaRoom(String path){
        List<CinemaRoom> cinemaRoomList = new ArrayList<>();
        FileReader fileReader;
        BufferedReader br = null;
        try {
            fileReader = new FileReader(path);
            br = new BufferedReader(fileReader);
            String line = br.readLine();
            while ((line= br.readLine())!=null){
                String[] str = line.split(",");
                cinemaRoomList.add(new CinemaRoom(str[0],str[1],str[2]));
            }
        } catch (FileNotFoundException fileNotFoundException) {
            fileNotFoundException.printStackTrace();
        } catch (IOException exception) {
            exception.printStackTrace();
        }

        return cinemaRoomList;
    }
 }

