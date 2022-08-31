package chapters_04;

import java.util.Scanner;

public class Exercise_23 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		
		System.out.print("Enter employee’s name: ");
		String name = input.nextLine();	
		System.out.print("Enter number of hours worked in a week: ");
		double hoursWorked = input.nextDouble();
		System.out.print("Enter hourly pay rate: ");
		double hourlyPayRate = input.nextDouble();
		System.out.print("Enter federal tax withholding rate: ");
		double federalTaxRate = input.nextDouble();
		System.out.print("Enter state tax withholding rate: ");
		double stateTaxRate = input.nextDouble();

		
		double grossPay= hoursWorked * hourlyPayRate;
		double federal= grossPay * federalTaxRate;
		double state = grossPay * stateTaxRate;	
		double totalDeduction= federal + state;
		
		
		
		System.out.print(
			"Employee Name: " + name + "\nHours Worked: " + hoursWorked +"\nPay Rate: $" + hourlyPayRate +
			"\nGross Pay: $" + grossPay+"\nDeductions:\n   Federal Witholding (20.0%): $" +
					federal  +"\n   State Witholding (9.0%): $" + state +
			"\n   Total Deduction: $" + totalDeduction  +"\nNet Pay: $" + (grossPay - totalDeduction));
	}


	}


