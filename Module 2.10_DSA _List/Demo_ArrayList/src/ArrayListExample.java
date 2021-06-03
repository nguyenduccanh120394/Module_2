import java.util.ArrayList;
import java.util.List;
public class ArrayListExample<list1> {
    private static final int NUM_OF_ELEMENT = 5;

    public static void main(String[] args) {
    //add:
        List<String> list1 = new ArrayList<>();
        for (int i = 0; i < NUM_OF_ELEMENT; i++) {
            list1.add("0"+i);
        }
        System.out.print("Init list1= ");
        printData(list1);
        System.out.println("");
    //addAll:
        List<String> list2 = new ArrayList<>();
        list2.addAll(list1);
        for (int i = 5; i >0 ; i--) {
            list2.add("0"+i);}
        list2.add("0"+3);
        System.out.print("List2 After add :  ");
        printData(list2);
    //IndexOf:
        System.out.println("list2.indexOf(03) = "+list2.indexOf("03"));
        System.out.println("list2.indexOf(06) = "+list2.indexOf("06"));
    //LastIndexOf:
        System.out.println("list2.LastIndexOf(03): "+list2.lastIndexOf("03"));
        String [] arr = new String[list2.size()];
        list2.toArray(arr);
        System.out.println("Index 03 : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
            }
        }
    public static void printData(List<String> list){
        for (String item:list){
            System.out.print(item + " ");
        }
    }
}
