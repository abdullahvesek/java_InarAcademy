package chapters_05;

import java.util.Scanner;

public class Exercise_37 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		
		System.out.print("Enter a decimial interger: ");
		int decimal = input.nextInt();

		
		String binary = "";	
		for (int i = decimal; i > 0; i /= 2) {
			binary = (i % 2) + binary; 
		}

		
			"The binary value of" + decimal + " is: " + binary);
	}

}
