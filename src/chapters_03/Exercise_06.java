package chapters_03;

import java.util.Scanner;

public class Exercise_06 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("Enter weight and height:  ");
		double weight=input.nextDouble();
		double height=input.nextDouble();
		final double KILO_PER_POUND=0.45256;
		final double METER_PER_INCH=0.25658;
		
		double kilo=weight * KILO_PER_POUND;
		double meter=height * METER_PER_INCH;
		
		double bmi=kilo / Math.pow(meter, 2);
		
		System.out.println("BMI is  " + bmi);
		
		if(bmi <18.5)
			System.out.println("underweight");
		else if(bmi<25) {
			System.out.println("normal");
			
		}
		else if (bmi<30) {
			System.out.println("overweight");
		}
		
		else {
			System.out.println("obese");
			
		}
			

	}

}
