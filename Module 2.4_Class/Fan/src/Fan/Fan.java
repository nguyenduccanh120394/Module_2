package Fan;
import java.util.Scanner;
public class Fan {
       private int SLOW ;
       private int MEDIA ;
       private int FAST ;
       private int speed ;
       private boolean on ;
       private double radius;
       private String color ;
    public Fan(){
        System.out.println(" This is my Fan");
     }

    public Fan( int speed, boolean on, double radius, java.lang.String color) {
        this.SLOW = SLOW;
        this.MEDIA = MEDIA;
        this.FAST = FAST;
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }

    public int getSLOW() {
        return 1;
    }
    public int getMEDIA(){
        return 2;
    }
    public int getFAST() {
        return 3;
    }
    public int getSpeed(){
        return getSLOW();
    }
    public boolean getOn(){
        return false;
    }
    public double getRadius(){
        return 5;
    }
    public String getColor(){
        return "blue";
    }

    public void setSLOW(int SLOW) {
        this.SLOW = SLOW;
    }
    public void setMEDIA(int MEDIA) {
        this.MEDIA = MEDIA;
    }
    public void setFAST(int FAST) {
        this.FAST = FAST;
    }
    public void setSpeed(int speed) {
        this.speed = speed;
    }
    public void setOn(boolean true) {
        this.on = true;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public void setColor(java.lang.String color) {
        this.color = color;
    }

    public String toString(){
        if (getOn()==false){
            System.out.println("Fan is off");
            System.out.println("Speed is : "+setSpeed());
            System.out.println("Color is : "+getColor());
            System.out.println("Radius is : "+getRadius());
        }else {
            System.out.println("Fan is on");
            System.out.println("Speed is : "+getSpeed());
            System.out.println("Color is : "+getColor());
            System.out.println("Radius is : "+getRadius());
        }
    }
}
class Display{
    public static void main(String[] args) {
    Fan fan1 = new Fan(setSpeed(int getFast),setOn())
    }
}
