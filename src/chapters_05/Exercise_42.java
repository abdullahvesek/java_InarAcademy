package chapters_05;

import java.util.Scanner;

public class Exercise_42 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double commission = 0.0, salesAmount;

		
		System.out.print("Enter the commission sought: ");
		double commissionSought = input.nextDouble();

		
		for (salesAmount = 0.01; commission < commissionSought; salesAmount += 0.01) {
		 	 commission = 0.0;

			
			if (salesAmount >= 10000.01)
				commission = ( salesAmount - 10000) * 0.12+ 5000*0.10 + 5000*0.8;

			
			if (salesAmount >= 5000.01)
				commission = (salesAmount - 5000) * 0.10 + 5000*0.8;

			
			if (salesAmount >= 0.01)
				commission =salesAmount * 0.08;
			
		}

		
		System.out.printf(
			"Minimum sales to earn $%.0f: $%.0f\n", commissionSought, salesAmount);

	}

}
