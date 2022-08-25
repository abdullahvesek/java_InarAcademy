package chapters_02;

import java.util.Scanner;

public class Exercise_07 {

	public static void main(String[] args) {
		Scanner input=new Scanner (System.in);
		System.out.print("enter value for minutes: ");
		int minute=input.nextInt();
	
		
		int hours=minute/60;
		int days= hours/24;
		int years=days/365;
		
		System.out.println(minute+ " minutes is approximatally "+years+ " years "+
		" and "+days+" days ");
		
		
		
		
	}

}
