package chapters_04;

import java.util.Scanner;

public class Exercise_05 {

	public static void main(String[] args) {
		
Scanner input=new Scanner(System.in);
System.out.println("enter number of side and  side:  ");
int s=input.nextInt();
int n=input.nextInt();

double area= n* Math.pow(s, 2)/ 4*Math.tan(Math.PI/n);

System.out.println("THE AREA IS:  "+area);

	}

}
