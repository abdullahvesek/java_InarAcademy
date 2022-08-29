package chapters_03;

import java.util.Scanner;

public class Exercise_26 {

	public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
	System.out.println("ENTER AN INTEGER:   ");
	int number=input.nextInt();
	
	System.out.println("number "+ (number%6==0 && number%5==0?"can  ":"cannot  ")+ "divisible by5 and 6");
	
	

	System.out.println("number "+ (number%6==0 || number%5==0?"can  ":"cannot  ")+ "divisible by5 or 6");
	
	
	
	
	}

}
