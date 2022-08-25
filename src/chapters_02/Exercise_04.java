package chapters_02;

import java.util.Scanner;

public class Exercise_04 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.println("Enter value for pounds: ");
		double pound =input.nextDouble();
		
	double kilo=pound * 0.445;
	
	System.out.println(pound + " pounds "+ kilo + "kilograms");
	
	

	}

}
