package chapters_04;

import java.util.Scanner;

public class Exercise_21 {

	public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
	System.out.println("enter a ısbn number:  ");
	String s =input.nextLine();
	
	
	if(s.matches("\\d{3}-\\d{2}-\\d{4}")) {
		System.out.println("valid");
	}
	else
		System.out.println("invalid");
	}

}
