import java.lang.reflect.Array;
import java.util.Arrays;

public class ComparableCircleTest {
    public static void main(String[] args) {
       ComparableCircle[] circles = new ComparableCircle[3];
       circles[0]= new ComparableCircle(3.6);
       circles[1]= new ComparableCircle(2);
       circles[2]= new ComparableCircle(2,"black",false);
        System.out.println("Before Sort");
        for (ComparableCircle circle : circles){
            System.out.println(circle);
        }
        Arrays.sort(circles);
        System.out.println("After Sort");
        for (ComparableCircle circle: circles){
            System.out.println(circle);
        }
    }

}