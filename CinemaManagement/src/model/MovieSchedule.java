package model;

import service.FilmManagement;

public class MovieSchedule {
    FilmManagement filmManagement = new FilmManagement();
    private String movieDay;
    private String movieShift;
    private String idMovie;

    public MovieSchedule(String movieDay, String movieShift, String idMovie) {
        this.movieDay = movieDay;
        this.movieShift = movieShift;
        this.idMovie = idMovie;

    }

    public String getMovieDay() {
        return movieDay;
    }

    public void setMovieDay(String movieDay) {
        this.movieDay = movieDay;
    }

    public String getMovieShift() {
        return movieShift;
    }

    public void setMovieShift(String movieShift) {
        this.movieShift = movieShift;
    }

    public String getIdMovie(String idMovie) {
        for (int i = 0; i < filmManagement.getListFilm().size(); i++) {
            if (filmManagement.getListFilm().get(i).getIdFilm().equals(idMovie));
            return filmManagement.getListFilm().get(i).getName();
        }
        return "Not Found";
    }

    public void setMovie(String movie) {
        this.idMovie = idMovie;
    }

    @Override
    public String toString() {
        return "model.MovieSchedule{" +
                "movieDay: " + movieDay + '\'' +
                ", movieShift: " + movieShift + '\'' +
                ", idMovie: " + idMovie + '\'' +
                '}';
    }
}
