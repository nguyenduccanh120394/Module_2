import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class ExtendedExercises2 {
    public static void main (String[ ] args) throws InputMismatchException {
        Scanner sc = new Scanner(System.in);
        int n = 0;
        try {
            System.out.print("Nhập số phẩn tử của mảng: ");
            n = sc.nextInt();
            int array[] = new int[n];

            for (int i = 0; i < n; i++) {
                System.out.print("Nhập phần tử thứ " + i + ": ");
                array[i] = sc.nextInt();
                if (array[i] == 100) {
                    break;
                }
            }

            System.out.println("\nCác phần tử bạn nhập là: ");
            for (int i = 0; i < n; i++) {
                System.out.print(array[i] + "\t");
            }

        } catch (Exception ex) {
            System.out.print("error");
        }
    }
    }
