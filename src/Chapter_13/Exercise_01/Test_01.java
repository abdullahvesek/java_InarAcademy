package Chapter_13.Exercise_01;

import java.util.Scanner;

public class Test_01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the color and filled ");
        String color = input.nextLine();
        Boolean isFilled = input.nextBoolean();

        Triangle t = new Triangle(3, 4, 5);
        t.setFilled(isFilled);
        t.setColor(color);

        System.out.println("the area is " + t.getArea() + "\n the perimeter is " + t.getPerimeter() + "\n is filled " + t.isFilled() + " \n the color is " + t.getColor());
    }
}
