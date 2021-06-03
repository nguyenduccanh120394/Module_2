public class RunAbleDemo extends Thread implements Runnable{
    private Thread thread;
    private String name;

    public RunAbleDemo(String name) {
        this.name = name;
        System.out.println("Name: "+name );
    }

    @Override
    public synchronized void run() {
        System.out.println("Running"+name);
        for (int i = 4; i >0 ; i--) {
            System.out.println("name: "+name +"Element"+ i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("Thread " + name + " interrupted.");
            }
            System.out.println("Thread " + name + " exit"+i);
        }
    }
    public void start(){
        System.out.println("Start"+name);
        if (thread==null){
            thread= new Thread(this,name);
            thread.start();
        }
    }
}
