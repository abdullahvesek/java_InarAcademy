package chapters_05;

import java.util.Scanner;

public class Exercise_01 {

	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		System.out.println("enter number if it is 0 input will end:  ");
		
		int number =input.nextInt();
		
		int numberOfPos=0;
		int numberOfNeg=0;
		int total=0;
		int count=0;
		
		while(number!=0) {
			
			if (number>0) 
				numberOfPos++;
				
			
			else if(number<0) 
				numberOfNeg++;
				
			
			total+=number;
			count++;
		
			
			number=input.nextInt();
			
			
		}
		
		double average=total/count;

System.out.println("the average is "+ average +" \n the number of positive " + numberOfPos+ "\n negatives is: "+numberOfNeg);
	}

}
