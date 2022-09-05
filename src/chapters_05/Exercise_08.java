package chapters_05;

import java.util.Scanner;

public class Exercise_08 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("enter number of students:  ");
	
		
		
		
	double best=0;
	String bestName="";
	
	int number=input.nextInt();
	System.out.println("enter name and score: ");
	while(number>=1) {

		
		String name=input.next();
	double score=input.nextDouble();
	number--;
	
	if (score>best) {
		best=score;
		bestName=name;
		
	}
	}
System.out.println("the higest is : "+bestName+"   "+best);

	}

}
