package Chapter_10;

public class Circle2D {
    private double x;
    private double y;
    private double radius;

   public Circle2D(){
        this.x=0;
        this.y=0;
        this.radius=1;
    }
Circle2D(double x,double y,double radius){
        this.x=x;
        this.y=y;
        this.radius=radius;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getRadius() {
        return radius;
    }
public double getArea(){
        return Math.PI*radius*radius;

}
public double getPerimeter(){
        return 2 * Math.PI * radius;
}

public boolean contains(double x,double y){
        if (Math.sqrt(Math.pow(getX()-x,2)+Math.pow(getY()-y,2))>getRadius())
            return false;
        else
            return true;
}
   public  boolean contains(Circle2D circle){
       if (Math.sqrt(Math.pow(getX()-circle.getX(),2)+Math.pow(getY()-circle.getY(),2))>getRadius())
           return false;
       else
           return true;
   }
public boolean overlaps(Circle2D circle){
    if (Math.sqrt(Math.pow(getX()-circle.getX(),2)+Math.pow(getY()-circle.getY(),2))==getRadius())
        return true;
    else
        return false;
}

    public static void main(String[] args) {
        Circle2D c1=new Circle2D(2,2,2.5);
        System.out.println("the area is "+c1.getArea());
        System.out.println("the perimeter is "+c1.getPerimeter());
        System.out.println("c1.contains(3,3) "+c1.contains(3,3));
        System.out.println("c1.contains Circle2D(4,5,10.5)) "+c1.contains(new Circle2D(4,5,10.5)));
        System.out.println("c1.overlaps Circle2D(3,5,2.3)) "+c1.overlaps(new Circle2D(3,5,2.3)));
    }

}
