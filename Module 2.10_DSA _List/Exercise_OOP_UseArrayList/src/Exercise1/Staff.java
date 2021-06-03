package Exercise1;

public class Staff extends Officer{
    private int job;

    public Staff() {
    }

    public Staff(int job) {
        this.job = job;
    }

    public Staff(String name, int age, String gender, String address, int job) {
        super(name, age, gender, address);
        this.job = job;
    }

    public int getJob() {
        return job;
    }

    public void setJob(int job) {
        this.job = job;
    }

    @Override
    public String toString() {
        return "Staff{ name : " + getName() + ", age: " + getAge() + ", gender: "
                + getGender() +", address: " + getAddress() + ", job: " + job + '}';
    }
}
