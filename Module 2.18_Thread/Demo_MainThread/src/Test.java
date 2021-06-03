public class Test {
    public static void main(String[] args) {
        Thread thread=Thread.currentThread();
        System.out.println("Name is: "+thread.getName());
        thread.setName("Name");
        System.out.println("new name: "+thread.getName());
        System.out.println("Do uu tien: "+thread.getPriority());
        thread.setPriority(Thread.MAX_PRIORITY);
        System.out.println("Do uu tien: "+thread.getPriority());
    }
}
