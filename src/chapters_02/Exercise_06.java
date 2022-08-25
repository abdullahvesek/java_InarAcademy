package chapters_02;

import java.util.Scanner;

public class Exercise_06 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number between 0 and 100 : ");
		int number=input.nextInt();
		
		int firstD =number%10;
		int secondD = (number/10)%10;
		int thirdD =(number/100)%10;
		
		System.out.println("the sum of digits is"+ (firstD + secondD + thirdD));
		

	}

}
