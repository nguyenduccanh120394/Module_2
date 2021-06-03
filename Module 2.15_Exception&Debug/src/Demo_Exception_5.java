public class Demo_Exception_5 {
    public static void main(String[] args) {
       try {
           int [] arr = new int[5];
           arr [5] = 5;
       }catch (NullPointerException e){
           System.out.println(e);
       }
        System.out.println("Finished!");


    }
}
