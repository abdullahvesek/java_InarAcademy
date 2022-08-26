package chapters_02;

import java.util.Scanner;

public class Exercise_23 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("enter distance and miles per galon and price per gallon :  ");
		double distance=input.nextDouble();
		double miles=input.nextDouble();
		double price=input.nextDouble();
		double costing=(distance / miles) * price;
		
		System.out.println("the cost is" + costing);
		

	}

}
