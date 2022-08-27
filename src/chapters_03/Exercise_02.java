package chapters_03;

import java.util.Scanner;

public class Exercise_02 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);

		
		int digit_01 = (int)(Math.random() * 10);
		int digit_02 = (int)(Math.random() * 10);
		int digit_03 = (int)(Math.random() * 10);

		// Prompt user to enter the sum of three integers
		System.out.print(
			"What is " + digit_01 + " + " + digit_02 + " + " + digit_03 + "? ");
		
		int answer = input.nextInt();
		
		System.out.println(
			digit_01 + " + " + digit_02 + " + " + digit_03 + " = " + answer + " is " +
			(digit_01 + digit_02 + digit_03 == answer));
	}
}


