public class CinemaTicket {
    private String idTicket;
    private String movie;
    private int priceTicket;
    private String roomCode;
    private int seating;
    private String movieDay;
    private String movieShift;
    private String tickerSeller;

    public CinemaTicket() {
    }

    public CinemaTicket(String idTicket, String movie, int priceTicket, String roomCode, int seating, String movieDay, String movieShift, String tickerSeller) {
        this.idTicket = idTicket;
        this.movie = movie;
        this.priceTicket = priceTicket;
        this.roomCode = roomCode;
        this.seating = seating;
        this.movieDay = movieDay;
        this.movieShift = movieShift;
        this.tickerSeller = tickerSeller;
    }

    public String getIdTicket() {
        return idTicket;
    }

    public void setIdTicket(String idTicket) {
        this.idTicket = idTicket;
    }

    public String getMovie() {
        return movie;
    }

    public void setMovie(String movie) {
        this.movie = movie;
    }

    public int getPriceTicket() {
        return priceTicket;
    }

    public void setPriceTicket(int priceTicket) {
        this.priceTicket = priceTicket;
    }

    public String getRoomCode() {
        return roomCode;
    }

    public void setRoomCode(String roomCode) {
        this.roomCode = roomCode;
    }

    public int getSeating() {
        return seating;
    }

    public void setSeating(int seating) {
        this.seating = seating;
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

    public String getTickerSeller() {
        return tickerSeller;
    }

    public void setTickerSeller(String tickerSeller) {
        this.tickerSeller = tickerSeller;
    }
}
