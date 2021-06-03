public class NumberGenerator implements Runnable{
    private int name;
    public NumberGenerator(String name ){
        this.name=name.hashCode();
    }
    @Override
    public synchronized void run() {
        for (int i = 0; i < 11; i++) {
            System.out.println("Number elenment "+ name +" : "+i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
