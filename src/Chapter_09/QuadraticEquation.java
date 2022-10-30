package Chapter_09;

import java.util.Scanner;

public class QuadraticEquation {
    private double a;
    private double b;
    private double c;




    public double getA() {

        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

QuadraticEquation(double a, double b,double c){
        this.a=a;
        this.b=b;
        this.c=c;

}

double getDiscriminant(){
        return Math.pow(getB(),2)-(4*getA()*getC());
}
double getRoot1(){

return -getB()+Math.sqrt(getDiscriminant())/2*getA();

    }
    double getRoot2(){

            return -getB()-Math.sqrt(getDiscriminant())/2*getA();

    }

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter for a b c:");
        double a= input.nextDouble();
        double b= input.nextDouble();
        double c= input.nextDouble();
        QuadraticEquation x=new QuadraticEquation(a,b,c);

        if (x.getDiscriminant()>0){
            System.out.println(x.getRoot1()+"  "+ x.getRoot2());
        }
        else if(x.getDiscriminant()==0){
            System.out.println(x.getRoot1());
        }
        else
            System.out.println("the equation has no root");
    }

}
