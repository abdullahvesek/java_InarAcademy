package chapters_06;

import java.util.Scanner;

public class Exercise_36 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("enter number of side: ");
		int s=input.nextInt();
		System.out.println("enter side:  ");
		double side=input.nextDouble();
		
		
		System.out.println("the area is:  "+area(s,side));
		

	}

	public static double area(int n, double side) {
		double area = (n*Math.pow(side, 2))/4*(Math.tan(Math.PI/n));
		return area;
		
	}


}
