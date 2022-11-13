package Chapter_11.Exercise_01;

import java.util.Scanner;




    public class Triangle extends GeometricObject {
        private double side1=1;
        private double side2=1;
        private double side3=1;

        Triangle(){
            this(1,1,1,"white",false);

        }

        public Triangle(double side1, double side2, double side3,String color,boolean isFilled) {

            super(color,isFilled);
            this.side1 = side1;
            this.side2 = side2;
            this.side3 = side3;
        }

        public double getSide1() {
            return side1;
        }

        public double getSide2() {
            return side2;
        }

        public double getSide3() {
            return side3;
        }

        public double getArea(){

            double u=(side1+side2+side3)/2;
            return Math.sqrt(u*(u-side1)*(u-side2)*(u-side3));
        }
        public double getPerimeter(){
            return side1+side2+side3;
        }
        @Override
        public String toString(){

            return super.toString()+" Triangle : side1= "+side1+" side2 = "+side2+" side3= "+side3;
        }

        public static void main(String[] args) {
            Scanner input =new Scanner(System.in);
            System.out.println("enter 3 side of triangle ");
            double side1= input.nextDouble();
            double side2= input.nextDouble();
            double side3= input.nextDouble();
            System.out.println("enter color and is filled or not");
            String color= input.next();
            boolean isFilled=input.nextBoolean();

            Triangle t1=new Triangle(side1,side2,side3,color,isFilled);
            System.out.println(t1);

        }
    }

