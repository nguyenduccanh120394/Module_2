public class TestInterfaceColorable {
    public static void main(String[] args) {
        Shape[] shape = new Shape[2];
        shape[0]= new Square("black",true,3);
        shape[1]= new Rectangle("red",false,2,1);
        for (Shape shape1:shape){
            if (shape1 instanceof Square){
                System.out.println(shape1.howToColor());
            }
        }
    }
}
