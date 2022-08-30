package chapters_04;

import java.util.Scanner;

public class Exercise_03 {

	public static void main(String[] args) {
		
Scanner input=new Scanner(System.in);
System.out.println("enter locations of 4 city:   ");
final double RADIUS=6.3715;
double x1=input.nextDouble();
double y1=input.nextDouble();
double x2=input.nextDouble();
double y2=input.nextDouble();
double x3=input.nextDouble();
double y3=input.nextDouble();



x1=Math.toRadians(x1);
x2=Math.toRadians(x2);
y1=Math.toRadians(y1);
y2=Math.toRadians(y2);
x3=Math.toRadians(x3);
y3=Math.toRadians(y3);

double distance=RADIUS*Math.acos(Math.sin(x1)*Math.sin(x2)+ Math.cos(x1)*Math.cos(x2)*Math.cos(y1-y2))+
RADIUS*Math.acos(Math.sin(x2)*Math.sin(x3)+ Math.cos(x2)*Math.cos(x3)*Math.cos(y2-y3));

System.out.println("the distance is  "+distance);





	}

}
