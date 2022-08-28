package chapters_03;

import java.util.Scanner;

public class Exercise_09 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("enter 9 digits:  ");
		int d1=input.nextInt();
		int d2=input.nextInt();
		int d3=input.nextInt();
		int d4=input.nextInt();
		int d5=input.nextInt();
		int d6=input.nextInt();
		int d7=input.nextInt();
		int d8=input.nextInt();
		int d9=input.nextInt();
		
		int checkSum=(d1 * 1 + d2 * 2 + d3 * 3 + d4 * 4 + d5 * 5 + d6* 6 + d7 * 7 + d8*8 + d9*9)%11;
		
		
		
		
		System.out.print("the ISBN İS"+d1+ d2+ d3+ d4+ d5+ d6+ d7+ d8+ d9 );
		
 System.out.println((checkSum==10?"X":checkSum));
 
 
 
		
		
		

	}

}
