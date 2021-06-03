import java.util.Scanner;
public class Engineer extends Staff{
    private String trainingIndustry;
    public Engineer() {}
    public Engineer(String trainingIndustry) {
        this.trainingIndustry = trainingIndustry;
    }
    public Engineer(String name, int age, String gender, String address, String trainingIndustry) {
        super(name, age, gender, address);
        this.trainingIndustry = trainingIndustry;
    }
    public String getTrainingIndustry() {
        return trainingIndustry;
    }
    public void setTrainingIndustry(String trainingIndustry) {
        this.trainingIndustry = trainingIndustry;
    }
    @Override
    public String toString() {
        return "Engineer{ Name :"+getName()+", Age: "+getAge()+", Gender: "+getGender()+", Address: "+getAddress()+
                ", trainingIndustry: " + trainingIndustry + '}' ;
    }

//    public void add() {
//        Scanner scanner = new Scanner(System.in);
//        super.add();
//
//
//    }
}

