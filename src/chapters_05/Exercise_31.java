package chapters_05;

import java.util.Scanner;

public class Exercise_31 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("enter an amount:  ");
		double amount=input.nextDouble();
		System.out.print("enter annuel rate:  ");
		double rate=input.nextDouble();
		System.out.print("enter number of month:  ");
		double month=input.nextDouble();
	
	
		System.out.println("Month  CD Value");
	
		for (int m = 1; m <= month; m++) {
			amount += amount * (rate / 1200);
			System.out.printf("%-7d%.2f\n", m, amount);
		}
	
	
	}

}
