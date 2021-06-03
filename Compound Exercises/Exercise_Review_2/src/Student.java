import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Year;
import java.util.Calendar;
import java.util.Comparator;
import java.util.Date;

public class Student implements Comparable<Student> {
    private String id ;
    private String name;
    private String dateOfBirth;
    private String gender;
    private String address;
    private String email;
    private float averageScore;
    private int age;

    public Student() {
    }

    public Student(String id,String name, String dateOfBirth,String gender,String address, String email, float averageScore) {
        this.id=id;
        this.name=name;
        this.dateOfBirth=dateOfBirth;
        this.gender=gender;
        this.address=address;
        this.email=email;
        this.averageScore=averageScore;

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

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public int getAge() {
        int yearNow = Year.now().getValue();
        String [] content = dateOfBirth.split("/");
        int year = Integer.parseInt(content[2]);
        int age = yearNow -year;
        return age;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public float getAverageScore() {
        return averageScore;
    }

    public void setAverageScore(float averageScore) {
        this.averageScore = averageScore;
    }

    @Override
    public String toString() {
        return "Student{" +
                "Id: " + id + '\'' +
                ", Name: " + name + '\'' +
                ", Age: " + getAge() + '\'' +
                ", Gender: " + gender + '\'' +
                ", Address: " + address + '\'' +
                ", Email:  " + email + '\'' +
                ", AverageScore: " + averageScore +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        return 0;
    }
}
