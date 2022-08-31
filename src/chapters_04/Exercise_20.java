package chapters_04;

import java.util.Scanner;

public class Exercise_20 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("enter a string:  ");
		String s=input.nextLine();
		
		int length=s.length();
		char ch=s.charAt(0);
		
		System.out.println("the length is:  "+length+"    "+ "char is  "+ ch);

	}

}
