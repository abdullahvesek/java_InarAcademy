package Chapter_09;

public class LinearEquation {
    private double a;;
    private double b;
    private double c;
    private double d;
    private double e;
    private double f;

    LinearEquation(double a,double b,double c,double d,double e,double f){
        this.a=a;
        this.b=b;
        this.c=c;
        this.d=d;
        this.e=e;
        this.f=f;
    }

double getA(){
        return a;
}

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getD() {
        return d;
    }

    public double getE() {
        return e;
    }

    public double getF() {
        return f;
    }

public boolean isSolvable(){
        if(getA()*getD()-getB()*getC()!=0)
            return true;
        else
            return false;
}

public double getX(){
        return (getE()*getD()-getB()*getF())/(getA()*getD()-getB()*getC());
}


    public static void main(String[] args) {
        LinearEquation z=new LinearEquation(1,2,3,4,5,6);
  if (z.isSolvable()==false)
      System.out.println("has no solution");
else
      System.out.println(z.getX());

    }

}
