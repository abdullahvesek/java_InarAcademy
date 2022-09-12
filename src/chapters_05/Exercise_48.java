package chapters_05;

import java.util.Scanner;

public class Exercise_48 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("enter a string: ");
		String s=input.nextLine();
		
		
		for(int i =0;i<s.length()-1;i+=2) {
			System.out.print(s.charAt(i));
		}
		
System.out.println();
	}

}
