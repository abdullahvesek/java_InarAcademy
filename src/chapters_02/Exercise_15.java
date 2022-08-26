package chapters_02;

import java.util.Scanner;

public class Exercise_15 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("enter x1 and y1 00and x2 and y2: ");
		double x1=input.nextDouble();
	double y1=input.nextDouble();
		double x2=input.nextDouble();
		double y2=input.nextDouble();
		double distance=Math.pow((Math.pow(x2-x1,2)) + (Math.pow(y2-y1, 2)),0.5);
		System.out.println("distance is :  "+distance);
		
		
		

	}

}
