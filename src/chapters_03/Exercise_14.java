package chapters_03;

import java.util.Scanner;

public class Exercise_14 {

	public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
	System.out.println("enter a guess:  ");
	int guess=input.nextInt();
	
	int coin=(int) (Math.random()*2);
	
	if(coin==guess)
		System.out.println("correct");
	else {
		System.out.println("wrong baboş");
	}
		

	}

}
