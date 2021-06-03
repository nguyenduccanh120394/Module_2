public class Display {
    public static void main(String[] args) {
        Circle circle = new Circle();
        double area = circle.getArea();
        System.out.println("Area Circle is: "+area);
        Cylinder cylinder = new Cylinder(5);
        double areaCylinder = cylinder.getArea()* cylinder.getHeight();
        System.out.println("Area Cylinder is :"+areaCylinder);
    }
}
