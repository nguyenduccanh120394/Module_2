import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Customer>customers= new ArrayList<>();
        Customer customer1 = new Customer("Canh", 27, "013049073");
        customers.add(customer1);
        Customer customer2 = new Customer("Canh", 27, "013049073");
        customers.add(customer2);
        Customer customer3 = new Customer("Canh", 27, "013049073");
        customers.add(customer3);
        CustomerManagement customerManagement =
                new CustomerManagement(customers, 3);
        System.out.println(customerManagement);
    }
}
