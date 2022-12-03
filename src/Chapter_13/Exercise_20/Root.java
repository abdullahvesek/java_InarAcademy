package Chapter_13.Exercise_20;

import java.util.Scanner;

public class Root {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter  a b c ");
        double a= input.nextDouble();
        double b=input.nextDouble();
        double c= input.nextDouble();

        double discriminant=Math.pow(b,2)-4*a*c;

        if (discriminant > 0)
        {
            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.println("The roots are " + root1 + " and " + root2);
        }
        else if (discriminant == 0)
        {
            System.out.println("The root is " +
                    (-b + Math.sqrt(discriminant)) / (2 * a));
        }
        else {
            System.out.print("The roots are ");
            Complex root1 = new Complex(-b / (2 * a), Math.sqrt(2 * a));
            Complex root2 = new Complex(-b / (2 * a), -Math.sqrt(2 * a));
            System.out.println(root1 + " and " + root2);
        }


    }
}
