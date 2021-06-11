package service;

import model.MovieSchedule;
import service.FileMangement;

import java.util.ArrayList;
import java.util.List;

public class MovieScheduleManagement {
    List<MovieSchedule>movieScheduleList;
    FileMangement fileMangement = new FileMangement();
    public MovieScheduleManagement(){
        try {
            movieScheduleList=fileMangement.readFromFileMovieSchedule("dataMovieSchedule.csv") ;
        }catch (Exception e){
            e.getMessage();
        }finally {
            movieScheduleList= new ArrayList<>();
        }
    }
    public List<MovieSchedule> getMovieScheduleList(){
        return movieScheduleList;
    }
    public void addMovieSchedule(MovieSchedule movieSchedule,String idMovie){
        movieScheduleList.add(movieSchedule);
        fileMangement.writeToFileMovieSchedule("dataMovieSchedule.csv",movieScheduleList,idMovie);
    }
    public void checkIndex(){

    }
}
