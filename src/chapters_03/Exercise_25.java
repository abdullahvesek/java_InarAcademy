package chapters_03;

import java.util.Scanner;

public class Exercise_25 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("enter 8 points:  ");
		double x1 =input.nextDouble();
		double y1 =input.nextDouble();
		double x2 =input.nextDouble();
		double y2 =input.nextDouble();
		double x3 =input.nextDouble();
		double y3 =input.nextDouble();
		double x4 =input.nextDouble();
		double y4 =input.nextDouble();

		double a=y2 - y1;
		double b =-1*x1-x2;
		double c =y3-y4;
		double d=-1*x3-x4;
		double e=a*x1+b*y1;
		double f=c*x3+d*y3;
		
		
		if (a*d -b*c==0) {
			System.out.println("paralel");
		}
		else {
			System.out.println("there is inserting point");
		}
	
	
	
	}
	
	

}
