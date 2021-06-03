public class Circle extends Shape {
    private double radius;
    public Circle(){};
    public Circle(double radius){
        this.radius= radius;
    }
    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea(){
        return Math.PI*radius*radius;
    }

    public String toString() {
        return "Circle{ " +
                "radius = " + radius +
                '}'+super.toString();
    }
    @Override
    public double resize(double percent) {
        return +(getArea()+getArea()*percent/100);
    }

}
