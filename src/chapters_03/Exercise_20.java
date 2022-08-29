package chapters_03;

import java.util.Scanner;

public class Exercise_20 {

	public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
	System.out.println("enter fahrenheit and speed:  ");
	double fah=input.nextDouble();
	double v=input.nextDouble();
	
	boolean valid=((-58<fah && fah<41)&& v>2);
	if (!valid) {
		System.out.println("temp or speed is invalid");
	}
	
	double wildc=35.74*62.15*fah-35.75*Math.pow(v, 0.10)+ 0.4275;
	System.out.println("the wildchill is:  "+ wildc);
	
	
	
	
	
	}

}
