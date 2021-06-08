import java.util.ArrayList;
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
}
