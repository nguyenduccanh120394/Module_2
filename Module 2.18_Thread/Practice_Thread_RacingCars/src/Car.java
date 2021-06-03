import java.util.Random;

public class Car implements Runnable{
    public static int DISTANCE = 1000;
    public static int STEP = 2;

     private String name;

     public Car(String name){
         this. name = name;
     }

    @Override
    public void run() {
    int diaDiemHienTai = 0;
    long startTime=System.currentTimeMillis();
    while (diaDiemHienTai<DISTANCE){
       try {
           Random random = new Random();
           int speed = random.nextInt(20);
           diaDiemHienTai+=speed;
           String log = "|";
           int phanTramQuangDuongDiDuoc = (diaDiemHienTai/DISTANCE)*100;
           for (int i = 0; i < DISTANCE; i+=STEP) {
               if (phanTramQuangDuongDiDuoc<i){
                   log+="=";
               }else if (phanTramQuangDuongDiDuoc>=i&&phanTramQuangDuongDiDuoc<i+STEP){
                   log+="o";
               }else {
                   log+="-";
               }
           }
           log+="|";
           System.out.println("Car" + this.name + ": " + log + " " + Math.min(DISTANCE, diaDiemHienTai) + "KM");
            Thread.sleep(1000);
       } catch (InterruptedException e) {
           System.out.println("Car" + this.name + " broken...");
           break;
       }
        long endTime = System.currentTimeMillis();
        System.out.println("Car" + this.name + " Finish in " + (endTime - startTime) / 1000 + "s");
    }
    }

}
