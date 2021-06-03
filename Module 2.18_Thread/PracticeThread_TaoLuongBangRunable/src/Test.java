public class Test {
    public static void main(String[] args) {
        System.out.println("Main running...........");

        RunAbleDemo runAbleDemo = new RunAbleDemo("Thread_1_HR_Database");
        runAbleDemo.setPriority(Thread.MAX_PRIORITY);
        runAbleDemo.start();
        try {
            runAbleDemo.join();
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        RunAbleDemo runAbleDemo2 = new RunAbleDemo("Thread_2_HR_Database");
        runAbleDemo2.setPriority(Thread.NORM_PRIORITY);
        runAbleDemo2.start();
    }
}
