
public class OptimizedPrimeFactorization implements Runnable{
    public static boolean run(int a) {
        for (int i = 2; i <=Math.sqrt(a) ; i++) {
            if (a % i==0){
                return false;
            }
        }
        return true;
    }
    @Override
    public void run() {

    }
}
