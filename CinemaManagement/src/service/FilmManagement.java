package service;

import model.Film;
import service.FileMangement;

import java.util.List;

public class FilmManagement {
    FileMangement fileMangement = new FileMangement();
    List<Film> listFilm;
    public FilmManagement(){
        listFilm = fileMangement.readFromFileFilm("dataFilm.csv");
    }
    public List<Film> getListFilm(){
        return listFilm;
    }
    public void addFilm(Film film){
        listFilm.add(film);
        fileMangement.writeToFileFilm("dataFilm.csv",listFilm);
    }
    public void disPlayListFilm(){
        for (Film item: listFilm){
            System.out.println(item);
        }
        System.out.println("");
    }
    public int checkIndex(String id){
        for (int i = 0; i < listFilm.size(); i++) {
            if (listFilm.get(i).getIdFilm().equals(id)){
                return i;
            }
        }
        return -1;
    }
    public void editFilm(Film film,String id){
        int index = checkIndex(id);
        if (index == -1){
            System.out.println("Not Found");
        }else {
            listFilm.set(index,film);
            fileMangement.writeToFileFilm("dataFilm.csv",listFilm);
        }
    }
}
