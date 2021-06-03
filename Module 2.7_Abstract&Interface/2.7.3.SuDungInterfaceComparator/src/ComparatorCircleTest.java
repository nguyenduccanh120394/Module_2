import java.util.Arrays;
import java.util.Comparator;

public class ComparatorCircleTest {
    public static void main(String[] args) {
        Circle [] circle = new Circle[3];
        circle[0]= new Circle(3.5);
        circle[1]= new Circle(1.1);
        circle[2]= new Circle(2,"yellow",false);
        System.out.println("Before Sort: ");
        for (Circle circle1:circle){
            System.out.println(circle1);
        }
        Comparator comparatorCircle =  new ComparatorCircle();
        Arrays.sort(circle,comparatorCircle);
        System.out.println("After Sort");
        for (Circle circle1:circle){
            System.out.println(circle1);
        }
        }
    }
