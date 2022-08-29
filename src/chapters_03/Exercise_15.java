package chapters_03;

import java.util.Scanner;

public class Exercise_15 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("enter 3 digit number:  ");
		int number=input.nextInt();
		
		int random=(int)(Math.random()*1000);
		
		int digit1=random%10;
		int digit2=(random/10)%10;
		int digit3=random/100;
		
		int guess1=number%10;
		int guess2=(number/10)%10;
		int guess3=number/100;
		
		
		System.out.println("lottery is  "+ random);
		
		if(random==number) {
			System.out.println("you won 10.000$");
		}
		
		
	}

}
