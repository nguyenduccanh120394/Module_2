import java.util.Comparator;
public class ComparatorCircle extends Circle implements Comparator<Circle> {
    public ComparatorCircle(){}
    public ComparatorCircle( double radius){
        super(radius);
    }
    public ComparatorCircle(double radius , String color, boolean filled){
        super(radius,color,filled)  ;
    }
    @Override
    public int compare(Circle o1, Circle o2) {
        if (o1.getRadius() > o2.getRadius()){
            return 1;
        } else if (o1.getRadius() < o2.getRadius()) {
            return -1;
        }else {
            return 0;
        }
    }
}

