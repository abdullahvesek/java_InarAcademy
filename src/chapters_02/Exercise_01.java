package chapters_02;

import java.util.Scanner;

public class Exercise_01 {

	public static void main(String[] args) {
	
		Scanner var = new Scanner(System.in);
	
		System.out.println("Enter a degree in Celcius: ");
	
		double degree =var.nextDouble();
		
		double fahrenheit= (9.0 /5) * degree + 32 ;
		
		System.out.println(degree  +  " Celcius is "  + fahrenheit  +  " Fahrenheit ");
		
	

	}

}
