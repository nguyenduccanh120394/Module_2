import java.util.ArrayList;
import java.util.List;

public class CustomerManagement {
    private List<Customer>customerList=null;
    private float numberOfRentalDays;
    private final int GRADE_A = 500;
    private final int GRADE_B = 300;
    private final int GRADE_C = 100;
    public CustomerManagement(){
        customerList=new ArrayList<>();
    }

    public CustomerManagement(List<Customer> customerList, float numberOfRentalDays) {
        this.customerList = customerList;
        this.numberOfRentalDays = numberOfRentalDays;
    }

    public List<Customer> getCustomerList() {
        return customerList;
    }

    public void setCustomerList(List<Customer> customerList) {
        this.customerList = customerList;
    }

    public float getNumberOfRentalDays() {
        return numberOfRentalDays;
    }

    public void setNumberOfRentalDays(float numberOfRentalDays) {
        this.numberOfRentalDays = numberOfRentalDays;
    }

    public void addCustomer(Customer customer){
        customerList.add(customer);

    }

    @Override
    public String toString() {
        return "CustomerManagement{" +
                "customerList=" + customerList +
                ", numberOfRentalDays=" + numberOfRentalDays +
                ", GRADE_A=" + GRADE_A +
                ", GRADE_B=" + GRADE_B +
                ", GRADE_C=" + GRADE_C +
                '}';
    }
}
