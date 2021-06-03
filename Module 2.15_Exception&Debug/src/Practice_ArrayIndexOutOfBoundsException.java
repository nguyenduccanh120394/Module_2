import java.util.Scanner;

public class Practice_ArrayIndexOutOfBoundsException {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] arr = creatRandom();
        try {
            System.out.println("Nhap n");
            int n = scanner.nextInt();
            System.out.println(arr[n]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Loi nhap phan tu ngoai mang "+e.getMessage());
        }
        System.out.println("Test Finish!");

    }
    static int[] creatRandom(){
        int [] arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i]= (int) Math.round(Math.random()*100);
        }
        return arr;
    }
}

