import java.util.Scanner;

public class InsertionSort {
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
    static void sort(int[]arr){
        int pos,x;
        for (int i = 0; i < arr.length; i++) {
            x= arr[i];
            pos=i;
            while (pos>0 && arr[pos]<arr[pos-1]){
                    int temp=arr[pos];
                    arr[pos]=arr[pos-1];
                    arr[pos-1]=temp;
                    pos--;
            }
                    arr[pos]=x;
            System.out.println("Array sort "+i+" times:");
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[j]+" ");
            }
            System.out.println();
        }

    }
}
