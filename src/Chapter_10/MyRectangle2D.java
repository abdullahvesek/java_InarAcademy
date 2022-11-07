package Chapter_10;

public class MyRectangle2D {
    private double x;
    private double y;
    private double width;
    private double height;

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

MyRectangle2D(){
        this.x=0;
        this.y=0;
        this.width=1;
        this.height=1;
}
MyRectangle2D(double x, double y,double width,double height){
        this.x=x;
        this.y=y;
        this.width=width;
        this.height=height;
}
public double getArea(){
        return getHeight()*getWidth();
}
public double getPerimeter(){
        return (getHeight()+getWidth())*2;

}

public boolean contains(double x, double y){
        if ((Math.abs(getX()-x)<getWidth()/2) && (Math.abs(getY()-y)<getHeight()/2))
            return true;
        else
            return false;
}

public boolean contains(MyRectangle2D r){
    if ((Math.abs(getX()-r.getX())<(getWidth()/2)-(r.getWidth()/2))&&((Math.abs(getY()-r.getY())<(getHeight()/2)-(r.getHeight()/2))))
        return true;
    else
        return false;

}
public boolean overlaps(MyRectangle2D r){
    if ((Math.abs(getX()-r.getX())<(getWidth()/2)+(r.getWidth()/2))&&((Math.abs(getY()-r.getY())<(getHeight()/2)+(r.getHeight()/2))))
        return true;
    else
        return false;
}

    public static void main(String[] args) {
        MyRectangle2D r1=new MyRectangle2D(2,2,4.5,4.9);
        System.out.println("the area of r1 is "+r1.getArea());
         System.out.println("teh perimeter of r1 is "+r1.getPerimeter());
        System.out.println(r1.contains(3,3));
        System.out.println(r1.contains(new MyRectangle2D(4,5,10.5,3.2)));
        System.out.println(r1.overlaps(new MyRectangle2D(3,5,2.3,5.4)));

    }
}
