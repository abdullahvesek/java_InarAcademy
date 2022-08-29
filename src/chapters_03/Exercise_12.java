package chapters_03;

import java.util.Scanner;

public class Exercise_12 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("enter three digit integer: ");
		int number = input.nextInt();
		
		int digit1=number%10;
		int digit2=number / 100;
		
		if(digit1==digit2) {
			System.out.println("polindrom");
		}
		else {
			System.out.println("not polindrom");
		}
	}

}
