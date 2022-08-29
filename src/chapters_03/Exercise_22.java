package chapters_03;

import java.util.Scanner;

public class Exercise_22 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("enter x and y :  ");
		double x =input.nextDouble();
		double y=input.nextDouble();
		
		double distance=Math.pow(Math.pow(x, 2)+Math.pow(y, 2),0.5);
		
		boolean inside=distance<10;
		
		System.out.println("these points "+ (inside?"in circle":"not in circle"));
		

	}

}
