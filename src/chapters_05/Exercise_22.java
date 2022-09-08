package chapters_05;

import java.util.Scanner;

public class Exercise_22 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("enter loan amount: ");
	    double loanAmount=input.nextDouble();
	    System.out.print("enter a year:  ");
	    int year=input.nextInt();
	    System.out.print("enter annual interest rate:  ");
	    int rate=input.nextInt();
	    
	    
	   double monthlyInterest=rate/1200;
	    
	    
	    double monthlyPayment= loanAmount * monthlyInterest / (1
				- 1 / Math.pow(1 + monthlyInterest, year * 12));
	    System.out.printf("%.2fmonthlypayment",monthlyPayment);
	    
	    double total=(monthlyPayment * 12) * year;
	   System.out.printf("%.3ftotalPayment",total);
	   
	   double balance =loanAmount;
	   double principal;
	   double interest;
	   
	   System.out.println("Payment#     Interest     Principal     Balance");
		for (int i = 1; i <= year * 12; i++) {
			interest = monthlyInterest * balance;
			principal = monthlyPayment - interest;
			balance = balance - principal;
			System.out.printf("%-13d%-13.2f%-13.2f%.2f\n", i, interest,
				principal, balance);
		}
	   
	   
	}

}
