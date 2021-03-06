import java.util.Scanner;

public class Employee extends Staff {
    private String job;

    public Employee() {
    }

    public Employee(String job) {
        this.job = job;
    }

    public Employee(String name, int age, String gender, String address, String job) {
        super(name, age, gender, address);
        this.job = job;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "job='" + job + '\'' +
                '}'+super.toString();
    }

}
