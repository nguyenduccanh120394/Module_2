package model;

import service.MovieScheduleManagement;

public class Film {
        private final String CATEGORY01_ACTION = "Hành Động";
        private final String CATEGORY02_HORROR = "Kinh Dị";
        private final String CATEGORY03_SCIENCE_FICTION = "Khoa Học";
        private final String CATEGORY04_CLASSIC = "Kinh Điển";
        private final String CATEGORY05_ROMANTIC = "Lãng Mạn";
        private final String CATEGORY06_DOCUMENTARY = "Tài Liệu";
        private final String CATEGORY07_SPORT = "Thể Thao";
        private final String CATEGORY08_MENTALITY = "Tâm lý";
        private final String CATEGORY09_HOLLYWOOD = "Hollywood";
        private final String CATEGORY10_COMEDY = "Hài";
        private final String CATEGORY11_MUSIC = "Phim Âm Nhạc";
        private final String CATEGORY12_FAMILY = "Gia Đình";
        private final String CATEGORY13_CRIME = "Tội Phạm";
        private final String CATEGORY14_CARTOON = "Hoạt Hình";

        private final String COUNTRY1_VN = "Việt Nam";
        private final String COUNTRY2_USA = "Mỹ";
        private final String COUNTRY3_JP = "Nhật Bản";
        private final String COUNTRY4_KR = "Hàn Quốc";
        private final String COUNTRY5_CN = "Trung Quốc";
        private final String COUNTRY6_TL = "Thái Lan";

        private String idFilm;
        private String name;
        private String showTime;
        private String directors;
        private String actor;
        private int yearOfManufacture;
        private String country;
        private String category;
        private String content;
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
                if (country.equals("1")){
                        this.country=COUNTRY1_VN;
                }else if (country.equals("2")){
                        this.country=COUNTRY2_USA;
                }else if (country.equals("3")) {
                        this.country = COUNTRY3_JP;
                }    else if (country.equals("4")) {
                        this.country = COUNTRY4_KR;
                }else if (country.equals("5")) {
                        this.country = COUNTRY5_CN;
                }else if (country.equals("6")) {
                        this.country = COUNTRY6_TL;
                }
                return country;
        }

        public void setCountry(String country) {
                this.country = country;
        }

        public String getCategory() {
                if (category.equals("1")){
                        this.category=CATEGORY01_ACTION;
                }else if (category.equals("2")){
                        this.category=CATEGORY02_HORROR;
                }else if (category.equals("3")){
                        this.category=CATEGORY03_SCIENCE_FICTION;
                }else if (category.equals("4")){
                        this.category=CATEGORY04_CLASSIC;
                }else if (category.equals("5")){
                        this.category=CATEGORY05_ROMANTIC;
                }else if (category.equals("6")){
                        this.category=CATEGORY06_DOCUMENTARY;
                }else if (category.equals("7")){
                        this.category=CATEGORY07_SPORT;
                }else if (category.equals("8")){
                        this.category=CATEGORY08_MENTALITY;
                }else if (category.equals("9")){
                        this.category=CATEGORY09_HOLLYWOOD;
                }else if (category.equals("10")){
                        this.category=CATEGORY10_COMEDY;
                }else if (category.equals("11")){
                        this.category=CATEGORY11_MUSIC;
                }else if (category.equals("12")){
                        this.category=CATEGORY12_FAMILY;
                }else if (category.equals("13")){
                        this.category=CATEGORY13_CRIME;
                }else if (category.equals("14")){
                        this.category=CATEGORY14_CARTOON;
                }
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

        @Override
        public String toString() {
                return "model.Film{" +
                        "idFilm='" + idFilm + '\'' +
                        ", name='" + name + '\'' +
                        ", showTime='" + showTime + '\'' +
                        ", directors='" + directors + '\'' +
                        ", actor='" + actor + '\'' +
                        ", yearOfManufacture=" + yearOfManufacture +
                        ", country='" + country + '\'' +
                        ", category='" + category + '\'' +
                        ", content='" + content + '\'' +
                        '}';
        }
}


