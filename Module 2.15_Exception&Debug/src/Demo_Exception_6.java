public class Demo_Exception_6 {
    public static void main(String[] args) {
        try {
            int [] arr = new int[5];
            arr[5]=0;
            System.out.println(arr[5]);
        }catch (ArithmeticException e){
            System.out.println(e);
        }catch (NullPointerException e){
            System.out.println(e);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
        finally {
            try {
                int a=0;
                int result = 10/a;
                System.out.println(result);
            }catch (ArithmeticException e){
                System.out.println(e);
            }
            System.out.println("Finished");
        }
        System.out.println("Finished");
    }
}
