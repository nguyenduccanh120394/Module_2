public class InterfaceResizeableTest {
    public static void main(String[] args) {
        Shape[] shape =  new Shape[3];
        shape[0]=new Circle("black",true,2);
        shape[1]=new Rectangle(2,3);
        shape[2]=new Square("red",true,2);
        for (Shape newshape:shape){
            System.out.println(newshape.toString()+" have Area after resize is: "+ newshape.resize(5));
        }
    }
}
