package chapters_05;

import java.util.Scanner;

public class Exercise_09 {

	public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
	System.out.println("enter number of students:  ");
	int number=input.nextInt();
	System.out.println("enter name and score:  ");
	int best=0;
	String bestName="";
	int second=0;
	String secondN="";
	
	
	for(int i =0; i<number;i++) {
		
		
		System.out.print("student   "+(i+1 )+"   ");
		String name=input.next();
		System.out.print("score:   ");
		int score=input.nextInt();
		
		
		if (i == 0) {
			
			best = score;
			bestName = name;
		}
		else if (i == 1 && score > best) {
			
			second = best;
			best = score;
			secondN = bestName;
			bestName = name;
		}
		else if (i == 1) {
			
			second = score;
			secondN= name;
		}		
		else if (i > 1 && score > best && score > second) {
			
			second = best;
			secondN = bestName;
			best = score;
			bestName= name;
		}
		else if (i > 1 && score > second) {
			
			secondN = name;
			second = score;
		
	}

	}
		
		System.out.println("the higest is "+bestName+"  "+best+"   "+"second is  "+secondN+"   "+second);
	
	
	}
}

