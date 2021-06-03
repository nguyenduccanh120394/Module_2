public class Demo_Exception_2 {
    public static void main(String[] args) {
    try{
        try {
            int zero = 0;
            int average = 10/zero;
            System.out.println("Average="+average);
        }catch (ArithmeticException exception){
            System.out.println(exception);
        }
            int [] arr = new int[5];
            arr[5]=4;
        System.out.println(arr[5]);
    }catch (ArrayIndexOutOfBoundsException exception){
        System.out.println(exception);
    }
        System.out.println("Finished!");
    }
}
