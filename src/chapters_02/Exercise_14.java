package chapters_02;

import java.util.Scanner;

public class Exercise_14 {

	public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
	System.out.print("enter weight and height:  ");
	double weight=input.nextDouble();
	double height=input.nextDouble();
	final double METERS_PER_INCH=0.0254;
	final double KILO_PER_POUNDS=0.45359237;
	weight=weight * KILO_PER_POUNDS;
	height=height * METERS_PER_INCH;
	
	double bmi=(weight) / (Math.pow(height, 2));
	
	System.out.println("BMI İS : "+bmi);
	

	}

}
