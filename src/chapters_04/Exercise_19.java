package chapters_04;

import java.util.Scanner;

public class Exercise_19 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		
		System.out.print("Enter 9 digit number as a string: ");
		String s = input.nextLine();

		
		int d1 = Integer.parseInt(s.substring(0, 1));
		int d2 = Integer.parseInt(s.substring(1, 2));
		int d3 = Integer.parseInt(s.substring(2, 3));
		int d4 = Integer.parseInt(s.substring(3, 4));
		int d5 = Integer.parseInt(s.substring(4, 5));
		int d6 = Integer.parseInt(s.substring(5, 6));
		int d7 = Integer.parseInt(s.substring(6, 7));
		int d8 = Integer.parseInt(s.substring(7, 8));
		int d9 = Integer.parseInt(s.substring(8));

		
		int d10 = (d1 * 1 + d2 * 2 + d3 * 3 + d4 * 4 + d5 * 5 
				 + d6 * 6 + d7 * 7 + d8 * 8 + d9 * 9) % 11;

		
		System.out.println(
			"The ISBN-10 number is " + s + ((d10 == 10) ? "X" : d10));

	}

}
