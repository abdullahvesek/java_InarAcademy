package chapters_04;

import java.util.Scanner;

public class Exercise_02 {

	public static void main(String[] args) {

Scanner input=new Scanner(System.in);
System.out.println("enter x1 y1 and x2 y2:  ");
double x1=input.nextDouble();
double y1=input.nextDouble();
double x2=input.nextDouble();
double y2=input.nextDouble();
 
final double RADIUS=6.3715;

x1=Math.toRadians(x1);
x2=Math.toRadians(x2);
y1=Math.toRadians(y1);
y2=Math.toRadians(y2);

double distance = RADIUS*Math.acos(Math.sin(x1)*Math.sin(x2)+ Math.cos(x1)*Math.cos(x2)*Math.cos(y1-y2));


System.out.println("the distance is  "+distance);



	}

}
