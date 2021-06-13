package service;

import model.MovieSchedule;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileMovieSchedule {
    public void writeToFileMovieSchedule(String path, List<MovieSchedule> movieScheduleList, String idMovie){
        FileWriter fileWriter;
        BufferedWriter bw = null;
        try {
            fileWriter =  new FileWriter("dataMovieSchedule.csv");
            bw = new BufferedWriter(fileWriter);
            bw.write("Movie Day,Movie Shift,Movie ID\n");
            for (int i = 0; i < movieScheduleList.size(); i++) {
                bw.write(movieScheduleList.get(i).getMovieDay()+","+movieScheduleList.get(i).getMovieShift()+","+movieScheduleList.get(i).getIdMovie(idMovie)+"\n");
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
        List<MovieSchedule>scheduleList= new ArrayList<>();
        FileReader fileReader;
        BufferedReader br = null;
        try {
            fileReader = new FileReader(path);
            br = new BufferedReader(fileReader);
            String line = br.readLine();
            while ((line=br.readLine())!=null){
                String[]str = line.split(",");
                scheduleList.add(new MovieSchedule(str[1],str[2],str[3]));
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
        return scheduleList;
    }
}
