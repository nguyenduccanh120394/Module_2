public class Customer {
    private String name;
    private String phoneNumber;
    private String email;
    private String idLogin;
    private String passWord;
    private String dateOfBirth;
    private String gender;
    private String area;

    public Customer() {
    }

    public Customer(String name, String phoneNumber, String email, String idLogin, String passWord, String dateOfBirth, String gender, String area) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.idLogin = idLogin;
        this.passWord = passWord;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.area = area;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getIdLogin() {
        return idLogin;
    }

    public void setIdLogin(String idLogin) {
        this.idLogin = idLogin;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", email='" + email + '\'' +
                ", idLogin='" + idLogin + '\'' +
                ", passWord='" + passWord + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", gender='" + gender + '\'' +
                ", area='" + area + '\'' +
                '}';
    }
}
