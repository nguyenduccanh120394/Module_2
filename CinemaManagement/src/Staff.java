public class Staff {
    private static final String RANK_A = "A";
    private static final String RANK_B = "B";
    private static final String RANK_C = "C";
    private static final int BASIC_SALARY_RANK_A = 6500000;
    private static final int BASIC_SALARY_RANK_B = 6000000;
    private static final int BASIC_SALARY_RANK_C = 5500000;
    private static final int SUPPORT_SALARY = 1000000;
    private static final int HOURLY_WAGES_OVT = 50000;

    private String id;
    private String name;
    private String gender;
    private String address;
    private String phoneNumber;
    private int overTime;
    private String rank;
    private int totalSalary;

    public Staff() {
    }

    public Staff(String id, String name, String gender, String address, String phoneNumber, int overTime,String rank) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.address = address;
        this.phoneNumber = phoneNumber;
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
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public int getTotalSalary() {
        if (rank.equals(RANK_A)){
            this.totalSalary = BASIC_SALARY_RANK_A + overTime*HOURLY_WAGES_OVT +SUPPORT_SALARY;
        }else if (rank.equals(RANK_B)){
            this.totalSalary = BASIC_SALARY_RANK_B + overTime*HOURLY_WAGES_OVT +SUPPORT_SALARY;
        }else if (rank.equals(RANK_C)){
            this.totalSalary = BASIC_SALARY_RANK_C + overTime*HOURLY_WAGES_OVT +SUPPORT_SALARY;
        }
        return totalSalary;
    }


    public void setTotalSalary(int totalSalary) {
        this.totalSalary = totalSalary;
    }

    @Override
    public String toString() {
        return "Staff{ ID: "+id+", NAME: "+name +", GENDER: "+getGender()+", ADDRESS: "+address+", PHONE NUMBER: "+phoneNumber+
                ", RANK: "+rank+", TOTAL SALARY: "+getTotalSalary()+'}';
    }
}
