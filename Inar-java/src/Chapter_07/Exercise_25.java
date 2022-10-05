package Chapter_07;

import java.util.Scanner;

public class Exercise_25 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter a value for a and b and c: ");
        double a=input.nextDouble();
        double b= input.nextDouble();
        double c= input.nextDouble();

        double discriminant=(Math.pow(b,2))-4*a*c;

        if (discriminant > 0)
        {
            double root1 = (-b + Math.pow(discriminant, 0.5)) / (2 * a);
            double root2 = (-b - Math.pow(discriminant, 0.5)) / (2 * a);
            System.out.println("two roots " + root1 + " and " + root2);
        }
        else if (discriminant == 0)
        {
            double root1 = (-b + Math.pow(discriminant, 0.5)) / (2 * a);
            System.out.println("one root " + root1);
        }
        else
            System.out.println("no real roots");

    }
}
