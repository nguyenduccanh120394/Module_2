public class Test {
    public static void main(String[] args) throws InterruptedException {
        NumberGenerator numberGenerator1 = new NumberGenerator("1");
        NumberGenerator numberGenerator2 = new NumberGenerator("2");
        Thread thread1 = new Thread(numberGenerator1);
        thread1.setPriority(Thread.MAX_PRIORITY);
        thread1.start();
        thread1.join();
        Thread thread2 = new Thread(numberGenerator2);
        thread2.setPriority(Thread.MIN_PRIORITY);
        thread2.start();
    }
}
