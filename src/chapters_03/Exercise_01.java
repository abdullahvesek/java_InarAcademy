package chapters_03;

import java.util.Scanner;

public class Exercise_01 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("enter a b c :  ");
		double a =input.nextDouble();
		double b =input.nextDouble();
		double c=input.nextDouble();
		double dis=(Math.pow(b, 2)) - 4 * a * c;
		double root1= (-b +(Math.sqrt(Math.pow(b, 2)- 4 * a * c)));
		double root2=(-b -(Math.sqrt(Math.pow(b, 2)- 4 * a * c)));
		
		if(dis >0 ) {
			System.out.println("the equaition has two roots"+ root1 + root2);
			
		}
		else if(dis==0) {
			System.out.println("has one root: "+root1);
			
		
		}
		else {
			System.out.println("no root");
		}

	}

}
