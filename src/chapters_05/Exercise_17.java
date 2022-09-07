package chapters_05;

import java.util.Scanner;

public class Exercise_17 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("enter an in between 1 and 15:  ");
		int number=input.nextInt();
		
		
		
		for(int i =1; i<=number ; i++) {
			
			for(int k=number-i; k>=1; k++) {
				System.out.print(" ");
				
			}
			
			
			for (int k=number; k>=2; k--) {
				System.out.print(k+" ");
				
			}
		
		for(int l =1; l<=number; l++) {
			System.out.print(l+" ");
		}
		
		System.out.println();
		}

	}

}
