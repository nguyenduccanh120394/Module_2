public class Test {
    public static void main(String[] args) {
     OptimizedPrimeFactorization opf = new OptimizedPrimeFactorization();

        Thread thread1 = new Thread(){
         public void run(){
             System.out.println("Cach toi uu: "+opf.run(101));
         }
        } ;
     LazyPrimeFactorization lpf = new LazyPrimeFactorization();
        Thread thread2 = new Thread(){
            public void run(){
                System.out.println("Cac k toi uu : "+lpf.run(101));
            }
        };
        thread1.start();
        thread2.start();

    }
}
