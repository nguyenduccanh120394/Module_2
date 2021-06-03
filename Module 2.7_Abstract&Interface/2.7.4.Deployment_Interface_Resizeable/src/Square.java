public class Square extends Shape {
    private double side;

    public Square(){}
    public Square(double side){
        this.side = side;
    }

    public Square(String color, boolean filled, double side) {
        super(color, filled);
        this.side = side;

    }

    public double getSide() {
        return side;
    }
    public void setSide(double side) {
        this.side = side;
    }

    public double getArea(){
        return side*side
                ;
    }
    @Override
    public String toString() {
        return "Square{ " +
                "side= " + side +
                '}'+super.toString();
    }

    @Override
    public double resize(double percent) {
        return (getArea()+getArea()*percent/100);
    }
}
