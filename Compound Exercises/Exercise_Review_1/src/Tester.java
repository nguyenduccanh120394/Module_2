public class Tester extends Staff{
    private int foundError;
    private int salaryTester;
    public Tester(){
    }

    public Tester(int foundError) {
        this.foundError = foundError;
    }

    public Tester(int id, String name, int age, String phone, String email, int basicSalary, int foundError) {
        super(id, name, age, phone, email, basicSalary);
        this.foundError = foundError;
        this.salaryTester=getBasicSalary()+foundError*50000;
    }

    public int getFoundError() {
        return foundError;
    }

    public void setFoundError(int foundError) {
        this.foundError = foundError;
    }

    public int getSalaryTester() {
        return getBasicSalary()+getFoundError()*50000;
    }

    public void setSalaryTester(int salaryTester) {
        this.salaryTester = salaryTester;
    }

    @Override
    public String toString() {
        return "Tester{ Staff ID: "+getId()+", Name: "+getName()+", Age: "+getAge()
                +", Phone: "+getPhoneNumber()+" Email: "+getEmail()+
                ", Basic Salary: "+getBasicSalary()+", Error number found: "+foundError+", Total Salary : "+salaryTester+" }";
    }
}
