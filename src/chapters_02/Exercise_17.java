package chapters_02;

import java.util.Scanner;

public class Exercise_17 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("enter temp and wind speed:  ");
	
		double temp=input.nextDouble();
		double speed=input.nextDouble();
		
		double index=35.74 + (0.6215 * temp) - (35.75 * Math.pow(speed, 0.16))  
				+ (0.4275 * temp * (Math.pow(speed, 0.16)));
		System.out.println("index is :  "+index);
		
				
				
		
				

	}

}
