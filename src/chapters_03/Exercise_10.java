package chapters_03;

import java.util.Scanner;

public class Exercise_10 {

	public static void main(String[] args) {
		int number1= (int) (Math.random()*100);
		int number2=(int) (Math.random()*100);
		System.out.println("what is "+ number1 +  "+" + number2);
		
		
		Scanner input=new Scanner(System.in);
	System.out.print("ENTER AN ANSWER:  ");
	int answer=input.nextInt();
	
	
	if(number1 + number2==answer) {
		System.out.println("correct");
	}
	else  {
		System.out.println("wrong baboş malesef the sum is "+ (number1 + number2));
	}
	}

}
