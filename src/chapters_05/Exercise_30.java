package chapters_05;

import java.util.Scanner;

public class Exercise_30 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("enter an amount:  ");
		double amount=input.nextDouble();
		System.out.print("enter annuel rate:  ");
		double rate=input.nextDouble();
		System.out.print("enter number of month:  ");
		double month=input.nextDouble();
		
		double monthly=rate/12;
		
		double total=0;
		
		for(int i=1; i<=month; i++) {
			
		total=(amount+total)*(monthly+1);
		
		}

	System.out.printf("the total is:%.2f ",total);
	
	}

}
