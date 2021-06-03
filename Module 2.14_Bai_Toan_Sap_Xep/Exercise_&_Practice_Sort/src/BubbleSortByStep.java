import java.util.Scanner;

public class BubbleSortByStep {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter size Array:");
        int size =scanner.nextInt();
        int [] arr = new int[size];
        System.out.println("Enter element Array");
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter element "+i);
            arr[i]= scanner.nextInt();
        }
        System.out.println("Your Array before sort is: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(+arr[i]+ " ");
        }
        System.out.println();
        System.out.println("-----------------------------");
        sort(arr);
        System.out.println("Your Array after sort is: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(+arr[i]+ " ");
        }
    }
    static void sort(int [] arr){
        boolean needNextPass=true;

        for (int i = 0; i < arr.length&&needNextPass; i++) {
            needNextPass=false;
            for (int j = arr.length -1 ; j > i ; j--) {
                if (arr[j]<arr[j-1]){
                    int temp = arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;

                    needNextPass= true;
                }
            }
            if (needNextPass==false){
                System.out.println("Array need sort");
                break;
            }
            System.out.println("Array after sort " +i+" times");
            for (int k = 0; k < arr.length ; k++) {
                System.out.print(arr[k]);
            }
            System.out.println("");
        }
    }
}
