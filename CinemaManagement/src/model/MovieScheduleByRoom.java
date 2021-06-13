package model;

public class MovieScheduleByRoom extends MovieSchedule {
    private String codeRoom;
    private String idMovie;
    public MovieScheduleByRoom(String movieDay, String movieShift, String idMovie,String codeRoom) {
        super(movieDay, movieShift);
        this.codeRoom=codeRoom;
        this.idMovie=idMovie;
    }

    public String getCodeRoom() {
        return codeRoom;
    }

    public void setCodeRoom(String codeRoom) {
        this.codeRoom = codeRoom;
    }

    public String getIdMovie(String idMovie) {
        for (int i = 0; i < filmManagement.getListFilm().size(); i++) {
            if (filmManagement.getListFilm().get(i).getIdFilm().equals(idMovie));
            return filmManagement.getListFilm().get(i).getName();
        }
        return "Not Found";
    }

    public void setIdMovie(String idMovie) {
        this.idMovie = idMovie;
    }

    @Override
    public String toString() {
        return "MovieScheduleByRoom{ Room ID:" +codeRoom+", Movie Day:"+getMovieDay()+", Movie Shift:"+getMovieShift()+
                ", Movie :"+getIdMovie(idMovie)+'}';
    }
}
