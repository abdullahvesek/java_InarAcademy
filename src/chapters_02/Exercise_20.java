package chapters_02;

import java.util.Scanner;

public class Exercise_20 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("enter balance and interest rate:  ");
		double balance=input.nextDouble();
		double rate=input.nextDouble();
		double interest=balance * (rate / 1200);
		
		System.out.println("the interest rate is :  " + interest);
		

	}

}
