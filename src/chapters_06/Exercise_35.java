package chapters_06;

import java.util.Scanner;

public class Exercise_35 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("ENTER A SIDE: ");
		double side=input.nextDouble();
		
		System.out.println("the area of pentagon is:  "+area(side));
		

	}
	public static double area(double side) {
		double area=(5*Math.pow(side, 2))/(4*Math.tan(Math.PI/5));
		return area;
		
	}
}
