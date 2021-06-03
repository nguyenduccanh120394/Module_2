public class ShapeTest {
    public static void main(String[] args) {
        Shape shape = new Shape();
        System.out.println(shape);

        shape = new Shape("red",false);
        System.out.println(shape );

        Circle circle = new Circle();
        double Perimeter = circle.getPerimeter();
        System.out.println("Perimeter is: "+Perimeter);
        double Area = circle.getArea();
        System.out.println("Area is: "+Area);
        System.out.println(circle);
        circle = new Circle(10);
        System.out.println(circle);

        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle);
        double perimeter = rectangle.getPerimeter();
        System.out.println("Perimeter is: "+perimeter);
        double area = rectangle.getArea();
        System.out.println("Area is: "+area);
        rectangle = new Rectangle(10,11);
        System.out.println(rectangle);

        Square square = new Square();
        System.out.println(square);
        square = new Square(3);
        double areaAquare=square.getArea();
        System.out.println(" Area is :" +areaAquare);

    }
}
