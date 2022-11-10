package Chapter_10;

public class MyPoint {
    private double x;
    private double y;

    MyPoint (){
        this.x=0;
        this.y=0;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
MyPoint(double x,double y){
        this.x=x;
        this.y=y;
}
public  double distance(MyPoint m){
        return Math.sqrt(Math.pow(getX()-m.getX(),2)+Math.pow(getY()-m.getY(),2));

}
public double distance(double p,double l){
        return Math.sqrt(Math.pow(getX()-p,2)+Math.pow(getY()-l,2));
}

public static double distance(MyPoint m,MyPoint l){
    return Math.sqrt(Math.pow(m.getX()-l.getX(),2)+Math.pow(m.getY()-l.getY(),2));
}

    public static void main(String[] args) {
        MyPoint vesek=new MyPoint();
        MyPoint abdullah=new MyPoint(10,30.5);

        System.out.printf("the distance between 2 points is  %.2f",distance(vesek,abdullah));
    }

}
