package chapters_05;

import java.util.Scanner;

public class Exercise_50 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		
		System.out.print("Enter a string: ");
		String s = input.nextLine();

		
		int count = 0;		
		for (int i = 0; i < s.length(); i++) {
			if (Character.isUpperCase(s.charAt(i)))
				count++;
		}

		
		System.out.println("Tne number of uppercase letters is " + count);

	}

}
