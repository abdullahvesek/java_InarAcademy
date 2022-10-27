package Chapter_09;

public class Fan {
    final static int SLOW=1;
    final static int MEDIUM=2;
    final static int FAST=3;

    public int getSpeed() {
        return speed;
    }

    private int speed=SLOW;

    public boolean isOn() {
        return on;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    private boolean on=false;
    private double radius=5;
    private String color="blue";

    Fan(){
    }
   public String toString(){
        if (isOn()==true){
            return (getSpeed()+"  "+getColor()+" "+getRadius());
        }
        else
            return (getColor()+"  "+getRadius()+" \n"+" fan is off" );

    }

    public static void main(String[] args) {
        Fan fan1=new Fan();
        fan1.setColor("yellow");
        fan1.setSpeed(FAST);
        fan1.setRadius(10);
        fan1.setOn(true);
        Fan fan2=new Fan();
        fan2.setSpeed(MEDIUM);
        fan2.setColor("blue");
        fan2.setRadius(5);
        fan2.setOn(false);

        System.out.println( fan1.toString());
        System.out.println( fan2.toString());
    }

}
