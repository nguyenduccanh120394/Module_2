import java.util.Scanner;

public class Staff {
    private static final String RANK_A = "A";
    private static final String RANK_B = "B";
    private static final String RANK_C = "C";
    private static final int BASIC_SALARY_RANK_A = 6500000;
    private static final int BASIC_SALARY_RANK_B = 6000000;
    private static final int BASIC_SALARY_RANK_C = 5500000;
    private static final int SUPPORT_SALARY = 1000000;
    private static final int HOURLY_WAGES_OVT = 50000;
    private static final String MISSION_CINEMA_STAFF = "Cinema Staff";
    private static final String MISSION_TICKER_SELLER = "Ticker Seller";

    private String id;
    private String name;
    private String gender;
    private String address;
    private String phoneNumber;
    private String mission;
    private int overTime;
    private String rank;


    public Staff() {
    }

    public Staff(String id, String name, String gender, String address, String phoneNumber, String mission, int overTime, String rank) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.mission = mission;
        this.overTime = overTime;
        this.rank = rank;


    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        if (gender.equals("1")){
            this.gender="Male";
        }else if (gender.equals("2")){
            this.gender="Female";
        }
        return gender;
    }

    public static String getMissionCinemaStaff() {
        return MISSION_CINEMA_STAFF;
    }

    public static String getMissionTickerSeller() {
        return MISSION_TICKER_SELLER;
    }

    public String getMission() {
        if (mission.equals("1")){
            this.mission = MISSION_TICKER_SELLER;
        }else if (mission.equals("2")){
            this.mission = MISSION_CINEMA_STAFF;
        }
        return mission;
    }

    public static String getRankA() {
        return RANK_A;
    }

    public static String getRankB() {
        return RANK_B;
    }

    public static String getRankC() {
        return RANK_C;
    }

    public static int getBasicSalaryRankA() {
        return BASIC_SALARY_RANK_A;
    }

    public static int getBasicSalaryRankB() {
        return BASIC_SALARY_RANK_B;
    }

    public static int getBasicSalaryRankC() {
        return BASIC_SALARY_RANK_C;
    }

    public static int getSupportSalary() {
        return SUPPORT_SALARY;
    }

    public static int getHourlyWagesOvt() {
        return HOURLY_WAGES_OVT;
    }

    public void setMission(String mission) {
        this.mission = mission;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }


    public int getOverTime() {
        return overTime;
    }

    public void setOverTime(int overTime) {
        this.overTime = overTime;
    }

    public String getRank() {
        if (this.rank.equals("1")){
            this.rank=RANK_A;
        }else if (this.rank.equals("2")){
            this.rank=RANK_B;
        }else if (this.rank.equals("3")){
            this.rank=RANK_C;
        }
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

//    public int getTotalSalary(String rank) {
//        if (rank.equals(RANK_A)){
//            totalSalary = 6500000+overTime*50000;
//        }else if (rank.equals(RANK_B)){
//
//            totalSalary = 6000000+overTime*50000;
//        }else if (rank.equals(RANK_C)){
//            totalSalary = 5500000+overTime*50000;
//        }
//        return totalSalary;
//    }


    @Override
    public String toString() {
        return "Staff{ ID: "+id+", NAME: "+name +", GENDER: "+getGender()+", ADDRESS: "+address+", PHONE NUMBER: "+phoneNumber
        +", MISSION: "+getMission()+", RANK: "+getRank()+'}';
    }
}
