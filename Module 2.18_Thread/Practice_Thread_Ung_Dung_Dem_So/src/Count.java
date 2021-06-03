public class Count implements Runnable  {
    private Thread myThread;
    public Count(){
        myThread = new Thread(this,"my runable Thread");
        System.out.println("my threaad cread "+myThread);
        myThread.start();
    }
    public Thread getMyThread(){
        return myThread;
    }
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Print the count : "+i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Luong gian doan");
            }
            System.out.println("Success!");
        }
    }
}
