package chapters_02;

import java.util.Scanner;

public class Exercise_10 {

	public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
	System.out.print("Enter water amount in kg and inital and final temperture:  ");
	double amount=input.nextDouble();
	double inital=input.nextDouble();
	double end=input.nextDouble();
	
	double energy=amount * (end-inital)*4184;
	System.out.println("the energy needs is: " + energy);
	
			
		

	}

}
