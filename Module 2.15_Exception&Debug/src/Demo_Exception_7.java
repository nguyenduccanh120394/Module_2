public class Demo_Exception_7 {
    public static void main(String[] args) {
        try {
            int a = 0;
            int result = 10 / a;
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println(e);
        } finally {
            System.out.println("Next");
        }
        System.out.println("Finished!");

    }
}
