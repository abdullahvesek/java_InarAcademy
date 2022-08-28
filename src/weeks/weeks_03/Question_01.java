package weeks.weeks_03;

import java.util.Scanner;

public class Question_01 {

	public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
	System.out.println("ENTER YOUR SALARY AND SERVİCE YEARS:  ");
	double salary=input.nextDouble();
	double service=input.nextDouble();
	
	if (service>=5) {
		double bonus=salary * 0.05;
		salary=salary + bonus;
		System.out.println("your bonus is : "+ bonus + "new salary is: "+salary);
		
	}
	else {
		System.out.println("there is  no bonus!!!");
	}
		
	}

}
