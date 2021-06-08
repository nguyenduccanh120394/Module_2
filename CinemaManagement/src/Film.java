public class Film {

        private String idFilm;
        private String name;
        private String showTime;
        private String directors;
        private String actor;
        private int yearOfManufacture;
        private String country;
        private String category;
        private String content;
        private String thoiGianCongChieu;
        MovieScheduleManagement movieScheduleManagement = new MovieScheduleManagement();


        public Film() {
        }

        public Film(String idFilm, String name, String showTime, String directors, String actor, int yearOfManufacture, String country, String category, String content) {
                this.idFilm = idFilm;
                this.name = name;
                this.showTime = showTime;
                this.directors = directors;
                this.actor = actor;
                this.yearOfManufacture = yearOfManufacture;
                this.country = country;
                this.category = category;
                this.content = content;
        }

        public String getIdFilm() {
                return idFilm;
        }

        public void setIdFilm(String idFilm) {
                this.idFilm = idFilm;
        }

        public String getName() {
                return name;
        }

        public void setName(String name) {
                this.name = name;
        }

        public String getShowTime() {
                return showTime;
        }

        public void setShowTime(String showTime) {
                this.showTime = showTime;
        }

        public String getDirectors() {
                return directors;
        }

        public void setDirectors(String directors) {
                this.directors = directors;
        }

        public String getActor() {
                return actor;
        }

        public void setActor(String actor) {
                this.actor = actor;
        }

        public int getYearOfManufacture() {
                return yearOfManufacture;
        }

        public void setYearOfManufacture(int yearOfManufacture) {
                this.yearOfManufacture = yearOfManufacture;
        }

        public String getCountry() {
                return country;
        }

        public void setCountry(String country) {
                this.country = country;
        }

        public String getCategory() {
                return category;
        }

        public void setCategory(String category) {
                this.category = category;
        }

        public String getContent() {
                return content;
        }

        public void setContent(String content) {
                this.content = content;
        }

        public String getThoiGianCongChieu() {
                for (int i = 0; i <movieScheduleManagement.movieScheduleList.size() ; i++) {
                        if (this.idFilm.equals(movieScheduleManagement.movieScheduleList.get(i).getIdMovie())) ;
                        return movieScheduleManagement.movieScheduleList.get(i).getMovieDay()+"-"+
                                movieScheduleManagement.movieScheduleList.get(i).getMovieShift();
                }

                return "Movie showtimes not found";
        }

        public void setThoiGianCongChieu(String thoiGianCongChieu) {
                this.thoiGianCongChieu = thoiGianCongChieu;
        }

        @Override
        public String toString() {
                return "Film{" +
                        "" +
                        "OfManufacture=" + yearOfManufacture +
                        ", country='" + country + '\'' +
                        ", category='" + category + '\'' +
                        ", content='" + content + '\'' +
                        '}';
        }
}


