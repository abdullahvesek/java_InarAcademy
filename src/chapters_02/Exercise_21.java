package chapters_02;

import java.util.Scanner;

public class Exercise_21 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("enter invesment amount and annual interest rate and number of year:   ");
		double amount=input.nextDouble();
		double rate=input.nextDouble();
		int years=input.nextInt();
		double mounthlyRate= rate / 1200;
		double futureValue=amount * (Math.pow(mounthlyRate, years*12));
		System.out.println("future value is:   "+ futureValue);
		
		

	}

}
