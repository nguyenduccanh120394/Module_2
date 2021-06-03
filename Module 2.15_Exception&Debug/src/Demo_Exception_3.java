public class Demo_Exception_3 {
    public static void main(String[] args) {
        try {
            int [] arr = new int[5];
            arr[5]=5;
            System.out.println(arr[5]);

            int zero = 0;
            int averager=10/zero;
            System.out.println(averager);

            String obj = null;
            System.out.println(obj.length());
        }catch (ArithmeticException exception){
            System.out.println(exception);
        }catch (ArrayIndexOutOfBoundsException ex){
            System.out.println(ex);
        }catch (NullPointerException e){
            System.out.println(e);
        }
        System.out.println("Finished!");
    }
}
