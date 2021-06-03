import java.util.Comparator;

public class Staff implements Comparator<Staff> {
    private int id;
    private String name;
    private int age;
    private String phoneNumber;
    private String email;
    private int basicSalary;
    public Staff() {
    }

    public Staff(int id, String name, int age, String phone, String email,int basicSalary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.phoneNumber = phone;
        this.email = email;
        this.basicSalary=basicSalary;
    }
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id=id;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age=age;
    }
    public  String getPhoneNumber(){
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email=email;
    }

    public int getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(int basicSalary) {
        this.basicSalary = basicSalary;
    }


    @Override
    public String toString() {
        return "Staff{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", email='" + email + '\'' +
                ", basicSalary=" + basicSalary +
                '}';
    }

    @Override
    public int compare(Staff o1, Staff o2) {
        return 0;
    }
}
