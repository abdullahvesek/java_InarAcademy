package chapters_02;

import java.util.Scanner;

public class Exercise_09 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("Enter v0 and v1 and time:  ");
		double v0=input.nextDouble();
		double v1=input.nextDouble();
		double t =input.nextDouble();
		
		double av=(v1-v0) /t;
		
		System.out.println("acceleration is  "+ av);
		

	}

}
