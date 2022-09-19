package chapters_06;

import java.util.Scanner;

public class Exercise_19 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("enter 3 side:  ");
		double side1=input.nextDouble();
		double side2=input.nextDouble();
		double side3=input.nextDouble();
		
		System.out.printf("%.2f\n",Triangle.area(side1, side2, side3));
		System.out.println(Triangle.isValid(side1, side2, side3));

	}
public class Triangle{
	
	
	public static double area(
			double side1, double side2, double side3) {
		double s = (side1 + side2 + side3) / 2;
		double area = Math.pow(s * (s - side1) * (s - side2) * (s - side3), 0.5);
return area;
	}

	public static boolean isValid(
			double side1, double side2, double side3) {
		
		if(!(side1+side2>side3&&side1+side3>side2&&side2+side3>side1)) {
			return false;
	}

return true;


}

}
}
