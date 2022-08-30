package chapters_04;

import java.util.Scanner;

public class Exercise_04 {

	public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
	System.out.println("enter s for length:  ");
	double s =input.nextDouble();
	
	
	double area=(6*Math.pow(s, 2))/4*Math.tan(Math.PI/6);
	
	System.out.println("the area is :  "+ area);
	
	

	}

}
