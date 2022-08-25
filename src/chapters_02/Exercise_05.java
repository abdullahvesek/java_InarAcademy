package chapters_02;

import java.util.Scanner;

public class Exercise_05 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("enter a value for subtotal and gratuıty rate : ");
		double subtotal=input.nextDouble();
		double gratuıtyRate=input.nextDouble();
		
		double gratuity= subtotal * (gratuıtyRate / 100.0);
		
		double total=gratuity + subtotal;
		
		System.out.println("The gartuityis "+gratuity+ "and total is "+total );
		
		
		

	}

}
