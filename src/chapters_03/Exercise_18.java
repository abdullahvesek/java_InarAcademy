package chapters_03;

import java.util.Scanner;

public class Exercise_18 {

	public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
	System.out.println("enter weight:  ");
	double weight=input.nextDouble();
	
	if (weight<0 || weight>50 ) {
		System.out.println("cannot be shipped or invalid input");
	}
	
	if (weight<1) {
		System.out.println("the cost is:  "+ 3.5);
	}
	else if(weight<3) {
		System.out.println("the cost is:   "+ 5.5);
	}
	
	else if (weight<10) {
		System.out.println("cost is :   "+8.5);
	}
	else if(weight>10 && weight<50) {
		System.out.println("cost is :  "+10.5);
	}
	
	}
	

}
