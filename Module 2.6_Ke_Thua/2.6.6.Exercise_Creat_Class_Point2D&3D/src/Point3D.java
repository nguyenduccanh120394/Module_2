import java.lang.reflect.Array;

public class Point3D extends Point2D {
    private float z;
    public Point3D(){};
    public Point3D(float x,float y, float z){
        super(x,y);
        this.z=z;
    }
    public float getZ() {
        return z;
    }
    public void setZ(float z) {
        this.z = z;
    }
    public void setXYZ (float x, float y, float z){
        setX(x);
        setY(y);
        this.z=z;
    }
    public float[] getXYZ(){
        float [] Array = new float[3];
        Array[0]=getX();
        Array[1]=getY();
        Array[3]=this.z;
        return Array;
    }

    @Override
    public String toString() {
        return "Point3D{" +"x = "+getX()+"y = "+getY()+
                "z = " + z +
                '}';
    }
}
