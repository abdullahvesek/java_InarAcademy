package chapters_02;

import java.util.Scanner;

public class Exercise_13 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("enter a mounthly saving amount: ");
		double amount=input.nextDouble();
		final double RATE=0.00417;
		double total=amount *  (1+RATE);
		total=(amount+total) + (1 + RATE);
		total=(amount+total) + (1 + RATE);
		total=(amount+total) + (1 + RATE);
		total=(amount+total) + (1 + RATE);
		total=(amount+total) + (1 + RATE);
		total=(amount+total) + (1 + RATE);
		 
		System.out.println("value is  :"+total );
		
		

	}

}
