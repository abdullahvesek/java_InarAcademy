package chapters_06;

import java.util.Scanner;

public class Exercise_17 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("enter a int:  ");
		int n=input.nextInt();
		
		printMatrix(n);
		

	}

	
	public static void printMatrix(int n) {
		for(int i=n;i>=1;i--) {
			System.out.println();
			for(int k=1;k<=n;k++) {
				System.out.print((int)(Math.random()*2)+" ");
			}
		
			System.out.println();
		}
	}
}
