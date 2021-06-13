package service;
import model.Film;
import java.util.ArrayList;
import java.util.List;

public class FilmManagement{
    FileFilmManagement file = new FileFilmManagement();
    List<Film> listFilm;
    public FilmManagement(){
        try {
            listFilm = file.readFromFileFilm("dataFilm.csv");
        }catch (Exception e){
            listFilm = new ArrayList<>();
        }

    }
    public List<Film> getListFilm(){
        return listFilm;
    }
    public void addFilm(Film film){
        listFilm.add(film);
        file.writeToFileFilm("dataFilm.csv",listFilm);
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
            file.writeToFileFilm("dataFilm.csv",listFilm);
        }
    }
    public boolean onlyIDFilm(String id){
        for (int i = 0; i < listFilm.size(); i++) {
            if (listFilm.get(i).getIdFilm().equals(id)){
                return false;
            }
        }
        return true;
    }
    public void delete(String id){
        int index=checkIndex(id);
        if (index==-1){
            System.out.println("Not Found");
        }else {
            listFilm.remove(index);
            file.writeToFileFilm("dataFilm.csv",listFilm);
        }
    }

    public List<Film> searchByCountry(String country){
        List<Film>filmListLikeCountry = new ArrayList<>();
        for (int i = 0; i < listFilm.size(); i++) {
            if (listFilm.get(i).getCountry().equals(country)){
                filmListLikeCountry.add(listFilm.get(i));
            }
        }
        return filmListLikeCountry;
    }
    public List<Film> searchByName(String name){
        List<Film>filmListSameName = new ArrayList<>();
        for (int i = 0; i < listFilm.size(); i++) {
            if (listFilm.get(i).getName().equals(name)){
                filmListSameName.add(listFilm.get(i));
            }
        }
        return filmListSameName;
    }
}
