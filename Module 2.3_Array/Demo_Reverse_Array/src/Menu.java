import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        int choice;

        int[] arr=new int[100];
        int size=0;

        Scanner sc=new Scanner(System.in);
        do{
            menu();
            System.out.print("Nhap lua chon: ");
            choice=sc.nextInt();
            switch (choice){
                case 1:
                    size=inputSize();
                    inputArray(arr,size);
                    break;
                case 2:
                    displayArray(arr,size);
                    break;
                case 3:
                    System.out.println("3. Tìm số chẵn lớn nhất trong mảng");
                    break;
                case 11:
                    System.exit(0);
                    break;
            }

        }while(choice>=1&&choice<=11);
    }
    static void menu(){
        System.out.println("\n========MENU===========");
        System.out.println("1. Nhập mảng có kích thước N (0<N<100)");
        System.out.println("2. Hiển thị mảng vừa nhập");
        System.out.println("3. Tìm số chẵn lớn nhất trong mảng");
        System.out.println("11. Thoat");

    }
    static int inputSize(){
        int N;
        Scanner sc=new Scanner(System.in);
        do {
            System.out.println("Nhap kich thuoc cua mang(0<N<100): ");
            N = sc.nextInt();
        }while(N<=0||N>=100);
        return N;
    }
    static void inputArray(int[] arr, int N){
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap mang gom N phan tu: ");
        for(int i=0;i<N;i++){
            System.out.print("arr["+i+"]=");
            arr[i]=sc.nextInt();
        }
    }
    static void displayArray(int[] arr, int N){
        System.out.println("Mang la: ");
        for(int i=0;i<N;i++){
            System.out.print(arr[i]+"  ");
        }
    }

}