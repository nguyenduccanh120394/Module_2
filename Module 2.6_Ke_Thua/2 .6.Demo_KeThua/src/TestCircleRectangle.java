public class TestCircleRectangle {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        circle.setFilled("black");
        System.out.println("A circle " + circle.toString());
        System.out.println("The radius is " + circle.getRadius());
        System.out.println("The area is " + circle.getArea());
        System.out.println("The diameter is " + circle.getDiameter());
    }
}
