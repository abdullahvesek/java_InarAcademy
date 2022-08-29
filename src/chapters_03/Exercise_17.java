package chapters_03;

import java.util.Scanner;

public class Exercise_17 {

	public static void main(String[] args) {
	
		int computer=(int)(Math.random()*3);
		
		Scanner input=new Scanner(System.in);
		
		System.out.println("enter 0 for scissor 1 for rock 2 for paper:  ");
		
		int guess=input.nextInt();
		
		System.out.print("the computer is  ");
		
	
		switch(computer) {
		case 0:System.out.print("scissor ");break;
		case 1:System.out.print("rock ");break; 
		case 2:System.out.print("paper");break;
		}
		
		 System.out.print("you are:  ");
		 
		 switch(guess) {
		 case 0:System.out.print("scissor ");break;
			case 1:System.out.print("rock ");break; 
			case 2:System.out.print("paper");break;
		 }
		
		 if (computer==guess) {
			 System.out.println("draw");
		 }
		
		 
		boolean win=(guess== 0&&computer==2 || guess==1&&computer==0||guess==2&&computer==10);
		
			if (win)
				System.out.println("you won");
			else
				System.out.println("computer won");
		
				

	}

}
