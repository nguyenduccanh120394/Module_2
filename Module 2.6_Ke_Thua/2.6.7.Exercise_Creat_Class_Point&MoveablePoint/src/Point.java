import java.lang.reflect.Array;

public class Point {
    private float x;
    private float y;
    public Point(){}
    public Point(float x, float y){
        this.x=x;
        this.y=y;
    }
    public float getX() {
        return x;
    }
    public float getY() {
        return y;
    }
    public void setX(float x) {
        this.x = x;
    }
    public void setY(float y) {
        this.y = y;
    }
    public void setXY(float x, float y){
        this.x = x;
        this.y = y;
    }
    public float[] getXY(){
        float[] Array = new float[2];
        Array[0]=this.x;
        Array[1]=this.y;
        return Array;
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
