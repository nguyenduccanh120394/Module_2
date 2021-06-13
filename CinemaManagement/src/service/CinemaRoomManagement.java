package service;

import model.CinemaRoom;

import java.util.ArrayList;
import java.util.List;

public class CinemaRoomManagement {
    FileMangement fileMangement = new FileMangement();
    List<CinemaRoom>listCinemaRoom ;
    public CinemaRoomManagement(){
        try {
            listCinemaRoom=fileMangement.readFromFileCinemaRoom("dataCinemaRoom.csv");
        }catch (Exception e){
            listCinemaRoom= new ArrayList<>();
        }
    }
    public List<CinemaRoom> getListCinemaRoom(){
        return listCinemaRoom;
    }
    public void add(CinemaRoom cinemaRoom){
        listCinemaRoom.add(cinemaRoom);
    }
}
