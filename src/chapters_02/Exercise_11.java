package chapters_02;

import java.util.Scanner;

public class Exercise_11 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("enter a year: ");
		int year=input.nextInt();
		
		int population=312032456 + (((31536000/7)-(31536000/13) + (31536000/45)) *year);
		System.out.println("the population in "+year+"years is"+population);
		
				

	}

}
