public class TestThread {
    public static void main(String[] args) throws InterruptedException {
        OddThread oddThread = new OddThread();
        EvenThread evenThread = new EvenThread();
        Thread threadOdd = new Thread(oddThread);
        Thread threadEven = new Thread(evenThread);
        threadOdd.start();
        threadOdd.wait(10000);
        threadEven.start();

    }
}
