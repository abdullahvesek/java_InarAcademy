package chapters_06;

import java.util.Scanner;

public class Exercise_07 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("enter amount:  ");
		double amount=input.nextDouble();
		System.out.println("enter annual rate: ");
		double rate=input.nextDouble();
		
		double monthly=rate/1200;
		
		
		System.out.println("YEARS         FUTURE VALUE");
		
		for(int i=1; i<31;i++) {
			System.out.printf("%2d%6s%.2f\n",i,"        ",futureValue(amount,monthly,i));
			
		}

	}

	public static double futureValue(
			double amount, double monthly, int years) {
	double y=	amount * Math.pow(1 + monthly, years * 12);
		return y;
		
	}





}
