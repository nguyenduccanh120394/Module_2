import static java.lang.Math.sqrt;

public class LazyPrimeFactorization implements Runnable{

    public boolean run(int a) {
        for (int i = 2; i < a; i++) {
            if (a % i == 0)
                return false;
        }
        return true;
    }
    @Override
    public void run(){
    }
}
