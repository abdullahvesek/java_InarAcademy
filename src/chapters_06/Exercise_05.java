package chapters_06;

import java.util.Scanner;

public class Exercise_05 {

	public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
	System.out.println("enter 3 int :  ");
	double number1=input.nextDouble();
	double number2=input.nextDouble();
	double number3=input.nextDouble();
	
	
	System.out.print("the sorting is :  ");
	display(number1,number2,number3);
	

	}

	public static void display(
			double num1, double num2, double num3) {
double temp; 
		
		if (num2 < num1 && num2 < num3){
			temp = num1;
			num1 = num2;
			num2 = temp;
		}
		else if (num3 < num1 && num3 < num2) {
			temp = num1; 
			num1 = num3;
			num3 = temp;
		}
		if (num3 < num2) {
			temp = num2;
			num2 = num3;
			num3 = temp;
		}
		
		
		System.out.println(num1 + " " + num2 + " " + num3);
	}
	}






