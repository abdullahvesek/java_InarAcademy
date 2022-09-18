package chapters_06;

import java.util.Scanner;

public class Exercise_04 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("enter an int:  ");
		int number=input.nextInt();
		
		System.out.print("the reverse of number is:  ");
		reverse(number);
		
		

	}

	public static void reverse(int number) {
		String n="";
		String a=number+"";
		
		for(int i=a.length()-1;i>=0;i--) {
			n+=a.charAt(i);
			
		}
	
	System.out.println( Integer.parseInt(n));
	
	
	
	
	}


}
