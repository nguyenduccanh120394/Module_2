public class MyThread1 extends Thread{
    Table table;
    public MyThread1(Table table) {
        this.table=table;
    }
    public void run(){
        table.printTable(5);
    }
}
