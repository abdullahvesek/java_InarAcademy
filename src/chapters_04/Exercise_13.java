package chapters_04;

import java.util.Scanner;

public class Exercise_13 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		
		System.out.print("Enter a letter: ");
		String s = input.nextLine();
		char ch = s.charAt(0);

		if (Character.isLetter(ch))
		{
			switch(Character.toUpperCase(ch)){
				case 'A': System.out.println(ch + " is a vowel"); break;
				case 'E': System.out.println(ch + " is a vowel"); break;
				case 'I': System.out.println(ch + " is a vowel"); break;
				case '0': System.out.println(ch + " is a vowel"); break;
				case 'U': System.out.println(ch + " is a vowel"); break;
				default : System.out.println(ch + " is a consonant"); 
			}
		}
		else
			System.out.println(ch + " is an invalid input");
	}
}

	


