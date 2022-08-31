package chapters_04;

import java.util.Scanner;

public class Exercise_18 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		
		System.out.print("Enter two characters: ");
		String str = input.nextLine();

		
		char a = Character.toUpperCase(str.charAt(0));
		char b = str.charAt(1); 

		
		
		switch(a){
			case 'M': System.out.print("Mathematics "); break;
			case 'C': System.out.print("Computer Science "); break;
			case 'I': System.out.print("Information Technology"); break;
			default : System.out.println("Invalid input");
						 System.exit(1);
		}

		switch(b){
			case '1': System.out.println("Freshman"); break;
			case '2': System.out.println("Sophomore"); break;
			case '3': System.out.println("Junior"); break;
			case '4': System.out.println("Senior"); break;
			default : System.out.println("Invalid input");
		}
	}

	}


