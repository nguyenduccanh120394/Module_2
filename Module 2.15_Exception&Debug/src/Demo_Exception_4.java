public class Demo_Exception_4 {
    public static void main(String[] args) {
        try {
            int sum = 2+3;
            System.out.println(sum);
        }finally {
            int total = 2+5;
            System.out.println(total);
        }
        System.out.println("Finished!");
    }
}
