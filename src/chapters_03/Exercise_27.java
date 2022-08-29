package chapters_03;

import java.util.Scanner;

public class Exercise_27 {

	public static void main(String[] args) {
	
		Scanner input=new Scanner(System.in);
		
				System.out.print("enter x and y :   ");
				double x = input.nextDouble();
				double y = input.nextDouble();

				double interx = (-x * (200 * 100)) / (-y * 200 - x * 100);
				double intery = (-y * (200 * 100)) / (-y * 200 - x * 100);

			
				System.out.println("point " + ((x > interx || y > intery)
					? "is not " : "is " ) + "inside");
			}
		
	
	}


