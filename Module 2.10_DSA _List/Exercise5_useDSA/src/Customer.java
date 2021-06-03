public class Customer {
    private String name;
    private int age;
    private String passport;

    public Customer(){

    }
    public Customer(String name, int age, String passport){
        this.name = name;
        this.age= age;
        this.passport= passport;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPassport() {
        return passport;
    }

    public void setPassport(String passport) {
        this.passport = passport;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", passport='" + passport + '\'' +
                '}';
    }
}
