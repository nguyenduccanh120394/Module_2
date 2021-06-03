import java.util.Scanner;

public class SelectionSortbyStep {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter size");
        int size = scanner.nextInt();
        int [] arr = new int[size];
        System.out.println("Enter element of Array:");
        for (int i = 0; i < arr.length ; i++) {
            System.out.println("Enter element "+i+" :");
            arr[i]=scanner.nextInt();
        }
        System.out.println("Array before Sort");
        for (int i = 0; i < arr.length ; i++) {
            System.out.print(arr[i] +" ");
        }
        System.out.println();
        sort(arr);
        System.out.println("Array after sort : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    static void sort(int[]list){
        for (int i = 0; i <list.length ; i++) {
            int min=list[i];
            int indexMin= i;

            for (int j = i+1; j < list.length ; j++) {
                if (min > list[j]) {
                    min = list[j];
                    indexMin = j;
                }
            }if (indexMin!=i){
                    list[indexMin]=list[i];
                    list[i]=min;
                }
            System.out.println("Array sort "+(i+1)+" time");
            for (int k = 0; k < list.length; k++) {
                System.out.print(list[k]+" ");
            }
            System.out.println();
        }
    }
}
