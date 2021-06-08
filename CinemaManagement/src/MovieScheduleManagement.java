import java.util.ArrayList;
import java.util.List;

public class MovieScheduleManagement {
    List<MovieSchedule>movieScheduleList;
    public MovieScheduleManagement(){
        movieScheduleList= new ArrayList<>();
    }
    public List<MovieSchedule> getMovieScheduleList(){
        return movieScheduleList;
    }
}
