package chapters_02;

import java.util.Scanner;

public class Exercise_12 {
public static void main(String[]args) {
	
Scanner input=new Scanner(System.in);
System.out.print("enter v in meters/seconds and a in meters/seconds squared: ");
double v=input.nextDouble();
double a=input.nextDouble();

double length=(Math.pow(v, 2)) / (2 * a);
System.out.println("minumum lenght is: " + length);


}
	
}

