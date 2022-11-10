package Chapter_10;

public class Triangle2D {
    private MyPoint p1;
    private MyPoint p2;
    private MyPoint p3;

    public MyPoint getP1() {
        return p1;
    }

    public void setP1(MyPoint p1) {
        this.p1 = p1;
    }

    public MyPoint getP2() {
        return p2;
    }

    public void setP2(MyPoint p2) {
        this.p2 = p2;
    }

    public MyPoint getP3() {
        return p3;
    }

    public void setP3(MyPoint p3) {
        this.p3 = p3;
    }

Triangle2D(){
    this.p1=new MyPoint(0,0);
    this.p2=new MyPoint(1,1);
    this.p3=new MyPoint(2,5);
    }
Triangle2D(MyPoint p1,MyPoint p2,MyPoint p3){
        this.p1=p1;
        this.p2=p2;
        this.p3=p3;
}
double getArea(){
        return (p1.getX()*p2.getY()+p2.getX()*p3.getY()+p3.getX()*p1.getY())-(p2.getX()*p1.getY()+p3.getX()*p2.getY()+p1.getX()*p3.getY())/2;
}
double getPerimeter(){
        return p1.distance(p2)+p1.distance(p3)+p2.distance(p3);
}
public boolean contains(MyPoint p){
        double bx=this.p2.getX()-this.p1.getX();
    double by=this.p2.getY()-this.p1.getY();
    double cx=this.p3.getX()-this.p1.getX();
    double cy=this.p3.getY()-this.p1.getY();
   double x=p.getX()-this.p1.getX();
   double y=p.getY()-this.p1.getY();
   double d=bx*cy-cx*by;

   double wa=(x*(by-cy)+y*(cx-bx)+bx*cy-cx*by)/d;
   double wb=(x*cy-y*cx)/d;
   double wc=(y*bx-x*by)/d;

   if ((!(wa>=0 && wa<=1))||(!(wb>=0 && wb<=1))||(!(wc>=0 && wc<=1)))
       return false;
   else
       return true;
    }

    public static void main(String[] args) {
        Triangle2D t1=new Triangle2D();
        System.out.println("the point is inside triangle "+t1.contains(new MyPoint(2,2)));
    }

}
