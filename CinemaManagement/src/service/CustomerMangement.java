package service;
import model.Customer;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CustomerMangement {
         FileMangement fileMangement = new FileMangement();
         private static List<Customer>customerList;
    public CustomerMangement(){
        try {
            customerList= fileMangement.readFromFileCustomer("dataCustomer.csv");
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            customerList =new ArrayList<>();
        }
    }

    public List<Customer> getCustomerList(){
        try {
             customerList=fileMangement.readFromFileCustomer("dataCustomer.csv");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return customerList;
    }

    public void registration(){
        Menu menu = new Menu();
        menu.menuRegister();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Name:");
        String name= scanner.nextLine();
        System.out.println("Enter Phone Number:");
        String phoneNumber= scanner.nextLine();
        System.out.println("Enter Email:");
        String email= scanner.nextLine();
        System.out.println("Enter ID Login:");
        String idLogin= scanner.nextLine();
        System.out.println("Enter Password:");
        String passWord= scanner.nextLine();
        System.out.println("Enter Date of Birth:");
        String dateOfBirth= scanner.nextLine();
        System.out.println("Enter Gender:");
        String gender= scanner.nextLine();
        System.out.println("Enter Area:");
        String area= scanner.nextLine();
        Customer customer = new Customer(name,phoneNumber,email,idLogin,passWord,dateOfBirth,gender,area);
        customerList.add(customer);
        fileMangement.writeToFileCustomer("dataCustomer.csv",customerList);
    }

    public static boolean checkIdCustomer(String id,String passWord){
        for (int i = 0; i <customerList.size() ; i++) {
            if (customerList.get(i).getIdLogin().equals(id)&&customerList.get(i).getPassWord().equals(passWord)){
                return true;
            }
        }
        return false;
    }
}
