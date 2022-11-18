package Chapter_12.Exercise_05;

import java.util.Scanner;

public class Test_05 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        boolean okay=true;

        do {
            System.out.println("enter 3 side ");
            double side1= input.nextDouble();
            double side2=input.nextDouble();
            double side3=input.nextDouble();

        try {
            Triangle t=new Triangle(side1,side2,side3);
            System.out.println("the perimeter is "+(side1+side2+side3));
        }catch (IllegalTriangleExeption ex){
            System.out.println(ex.getMessage());
            okay=false;
        }


        }while (okay);
    }
}
