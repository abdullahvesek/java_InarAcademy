package chapters_05;

import java.util.Scanner;

public class Exercise_45 {

	public static void main(String[] args) {
		double total=0;
		double total2=0;
		
		
		Scanner input=new Scanner(System.in);
		System.out.println("enter 10 number: ");
		for(int i=1; i<11; i++) {
			double x =input.nextDouble();
			total+=x;
		    total2+=x*x;
		    
		
		}
	
	double mean =total/10;
	double deviation=Math.sqrt((total2-(total2/10))/9);
	
	
	System.out.printf("the mean is : %.2f the deviation is: %.2f",mean,deviation);
	
	
	
	
	
	}

}
