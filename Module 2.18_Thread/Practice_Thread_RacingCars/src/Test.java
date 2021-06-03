public class Test {
    public static void main(String[] args) {
        Car car1 = new Car("Wave");
        Car car2 = new Car("SH");
        Car car3 = new Car("Lead");
        Thread thread1 = new Thread(car1);
        Thread thread2 = new Thread(car2);
        Thread thread3 = new Thread(car3);
        thread1.start();
        thread2.start();
        thread3.start();
    }
}
