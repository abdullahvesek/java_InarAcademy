package chapters_03;

import java.util.Scanner;

public class Exercise_19 {

	public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
	System.out.println("enter x1 x2 y1 y2 x3 y3:  ");
double x1=input.nextDouble();
double y1=input.nextDouble();
double x2=input.nextDouble();
double y2=input.nextDouble();
double x3=input.nextDouble();
double y3=input.nextDouble();
	
	double side1=Math.pow((Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2)),0.5); 
	double side2=Math.pow((Math.pow(x3-x1, 2) + Math.pow(y3-y1, 2)),0.5); 
	double side3=Math.pow((Math.pow(x3-x2, 2) + Math.pow(y3-y2, 2)),0.5); 
	
	if(side1+side2>side3 && side1+side3>side2&& side2+side3>side1) {
	
		System.out.println("perimeter is  "+(side1+side2+side3));
		
		
		
	}
	
	else {
		System.out.println("ınvalid input");
	}
	
	
	
	
	
	
	}

}
