package chapters_05;

import java.util.Scanner;

public class Exercies_41 {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		System.out.print("enter integers 0 end input");
		int count=0;
		int number=1;
		int max=0;
		
		while(number!=0) {
			 number=input.nextInt();
		
			 if(number>max) {
				 max=number;
			 count=0;
			 
			 
			 }
			 
			 if(number==max)
				 count++;
			 
			 
}
		
		
			System.out.println("the biggest is: "+max);
			System.out.println("occurences is : "+count);
			
		}

	}


