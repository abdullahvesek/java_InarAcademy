package chapters_02;

import java.util.Scanner;

public class Exercise_02 {

public static void main(String[]args) {
	Scanner input = new Scanner(System.in);
	
	System.out.print("enter a value for radius and length");

	double radius=input.nextDouble();
	double length=input.nextDouble();
	
	final double PI=3;
	
	double area=radius*radius*PI;
	double volume=area * length;
	
	System.out.println("The area is  " + area );
	
	System.out.println("The volume is  "+ volume);
	
	
	
	
}

}
