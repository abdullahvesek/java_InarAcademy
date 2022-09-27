package chapters_05;

import java.util.Scanner;

public class Exercise_17 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("enter an in between 1 and 15:  ");
		int number=input.nextInt();
		

		for(int row=1;row<=number;row++) {
			
			
			for(int k=number-row;k>=1;k--) {
				System.out.print("  ");
			}
		
		for(int a=row;a>=1;a--) {
			System.out.print(a+" ");
		}
		
		for(int s=2;s<=row;s++) {
			System.out.print(s+" ");
		}
		
		System.out.println();
		
		}
			
		}
		
}
		
		