public class MoveablePoint extends Point{
    private float xSpeed;
    private float ySpeed;
    public MoveablePoint(){}
    public MoveablePoint(float xSpeed,float ySpeed){
        this.xSpeed=xSpeed;
        this.ySpeed=ySpeed;
    }
    public MoveablePoint(float x, float y,float xSpeed,float ySpeed ){
        super(x,y);
        this.xSpeed=xSpeed;
        this.ySpeed=ySpeed;
    }
    public float getxSpeed() {
        return xSpeed;
    }
    public float getySpeed() {
        return ySpeed;
    }
    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }
    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }
    public void setSpeed(float xSpeed,float ySpeed){
    this.xSpeed=xSpeed;
    this.ySpeed=ySpeed;
    }
    public float[] getSpeed(){
        float[] Array= new float[2];
        Array[0]=this.xSpeed;
        Array[1]=this.ySpeed;
        return Array;
    }

    @Override
    public String toString() {
        return "( "+getX()+" , "+getY()+" ) "+" , "+"speed= "+"( "+xSpeed+" , "+ySpeed+" )";
    }

}
