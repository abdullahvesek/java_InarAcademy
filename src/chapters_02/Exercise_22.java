package chapters_02;

import java.util.Scanner;

public class Exercise_22 {
 
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("enter an amount in double:  ");
		double amount=input.nextDouble();
		int remainingAmount= (int) (amount * 100);
		int dollars=remainingAmount / 100;
		remainingAmount=remainingAmount%100;
		int quarters=remainingAmount/25;
		remainingAmount=remainingAmount%25;
		int dimes=remainingAmount / 10;
		remainingAmount=remainingAmount%10;
		int nickels=remainingAmount / 5;
		remainingAmount=remainingAmount%5;
		int penies=remainingAmount;
		System.out.println("your amount consist of  "+ dollars+"dollars  "+ quarters+ "quarters "+
		dimes + "dimes  "+ nickels+ " nickels "+penies+ " penies ");
		

	}

}
