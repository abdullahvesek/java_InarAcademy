package Chapter_09;

public class RegularPolygon {
    private int n=3;

    public int getN() {
        return n;
    }

    public double getSide() {
        return side;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setN(int n) {
        this.n = n;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    private double side=1;
    private double x=0;
    private double y=0;

    RegularPolygon(){

    }
RegularPolygon(int n,double side){
        this.n=n;
        this.side=side;
        this.x=0;
        this.y=0;

}
    RegularPolygon(int n,double side,double x,double y){
        this.n=n;
        this.side=side;
        this.x=x;
        this.y=y;

    }

    double getPerimeter(){
        return getSide()*getN();
    }

    double getArea(){
        return (getN()*Math.pow(getSide(),2))/( 4 * Math.tan(Math.PI/getN()));
    }

    public static void main(String[] args) {
        RegularPolygon r1=new RegularPolygon();
        RegularPolygon r2=new RegularPolygon(6,4);
        RegularPolygon r3=new RegularPolygon(10,4,5.6,7.8);

        System.out.println("the area of r1 is "+r1.getArea()+" the perimeter of r1 is "+r1.getPerimeter());
        System.out.println("the area of r2 is "+r2.getArea()+" the perimeter of r2 is "+r2.getPerimeter());
        System.out.println("the area of r3 is "+r3.getArea()+" the perimeter of r3 is "+r3.getPerimeter());
    }

}
