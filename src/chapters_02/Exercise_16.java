package chapters_02;

import java.util.Scanner;

public class Exercise_16 {

	public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
	System.out.print("enter length: ");
	double side=input.nextDouble();
	double area=((3 *Math.pow(3,0.5)) / 2) * Math.pow(side, 2);
	System.out.println("area is :  "+area);
	

	}

}
