package chapters_04;

import java.util.Scanner;

public class Exercise_09 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("enter a cahr:  ");
		String s=input.nextLine();
		
		char ch=s.charAt(0);
		
		System.out.println("the code is:  "+   (int)ch);

	}

}
