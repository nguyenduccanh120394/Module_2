public class Developer extends Staff{
    private float overTime;
    private int salaryDev;


    public Developer(float overTime,int salaryDev) {
        this.overTime = overTime;
        this.salaryDev=salaryDev;
    }

    public Developer(int id, String name, int age, String phoneNumber, String email, int basicSalary , float overTime) {
        super(id, name, age, phoneNumber, email, basicSalary);
        this.overTime = overTime;
        this.salaryDev= (int) (getBasicSalary()+getOverTime()*50000);

    }

    public double getOverTime() {
        return overTime;
    }

    public void setOverTime(float overTime) {
        this.overTime = overTime;
    }

    public int getSalaryDev() {
        return (int) (getBasicSalary()+overTime*200000);
    }

    public void setSalaryDev(int salaryDev) {
        this.salaryDev = salaryDev;
    }

    @Override
    public String toString() {
        return "Developer{ Staff ID: "+getId()+", Name: "+getName()+", Age: "+getAge()
                +", Phone: "+getPhoneNumber()+" Email: "+getEmail()+
                ", Basic Salary: "+getBasicSalary()+", Overtime Hours: "+overTime+",Total Salary : "+getSalaryDev() +" }";
    }
}
