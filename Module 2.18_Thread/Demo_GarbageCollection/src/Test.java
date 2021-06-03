public class Test {
    public void finalize(){
        System.out.println("object is garbage collected");
    }

    public static void main(String[] args) {
        Test test1= new Test();
        Test test2= new Test();
        test1=null;
        test2=null;
        System.gc();
    }
}
