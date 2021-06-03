package Exercise1;

public class Engineer extends Officer{
    private String brand;

    public Engineer() {
    }

    public Engineer(String brand) {
        this.brand = brand;
    }

    public Engineer(String name, int age, String gender, String address, String brand) {
        super(name, age, gender, address);
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Engineer{ name : " + getName() + ", age: " + getAge() + ", gender: "
                + getGender() +", address: " + getAddress() + ", brand: " + brand + '}';
    }
}
