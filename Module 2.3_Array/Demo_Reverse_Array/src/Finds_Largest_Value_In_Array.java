import java.util.Scanner;

public class Finds_Largest_Value_In_Array {
    public static void main(String[] args) {
        int [] array;
        int size;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Enter a size");
            size = scanner.nextInt();
            if (size>20)
                System.out.println("Kích thước không được vướt quá 20");
        } while (size>20);
        array = new int[size];
        int i = 0;
        while (i<array.length){
            System.out.println("Enter element "+ (i+1)+":");
            array[i]=scanner.nextInt();
            i++;
        }
        System.out.print("Property list: ");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }
        int max = array[0];
        int index = 1;
        for (int j = 0; j < array.length; j++) {
            if (array[j]>max){
                max = array[j];
                index = j+1;
            }
        }
        System.out.println("Arr co gia tri max la :"+max+"tai vi tri"+index);

    }
}
