package chapters_03;

import java.util.Scanner;

public class Exercise_23 {

	public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
	System.out.println("enter weights and prices:  ");
	double weight1=input.nextDouble();
	double weight2=input.nextDouble();
	double price1=input.nextDouble();
	double price2=input.nextDouble();
	
	
	if(weight1/price1==weight2/price2) {
	System.out.println("these are same");	
		
	}
	else if(weight1/price1>weight2/price2) {
		System.out.println("package1 is better");
	}
	
	else {
		System.out.println("package2 is better");
	}
	
	}
}


