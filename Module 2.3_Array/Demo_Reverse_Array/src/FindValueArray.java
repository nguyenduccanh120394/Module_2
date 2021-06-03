import java.util.Scanner;

public class FindValueArray {
    public static void main(String[] args) {
        String[] array = {"Christian", "Michael", "Camila", "Sienna",
                "Tanya", "Connor", "Zachariah", "Mallory", "Zoe", "Emily"};
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a name's student: ");
        String input_name = input.nextLine();
        boolean isExits = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(input_name)){
                System.out.println("Position of the students in the list " + input_name + " is: " + (i + 1));
                isExits = true;
                break;
            }
        }
        if (!isExits){
            System.out.println("Not found" + input_name + " in the list.");
        }

    }
}
