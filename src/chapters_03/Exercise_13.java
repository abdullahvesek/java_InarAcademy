package chapters_03;

import java.util.Scanner;

public class Exercise_13 {

	public static void main(String[] args) {
Scanner input=new Scanner(System.in);
System.out.println("enter status and salary :  ");
int statu=input.nextInt();
double income=input.nextDouble();

double tax=0;
switch(statu) {
case 0 : 
	if (income<=8530)
		tax=income * 0.10;
	else if(income<=33950)
		tax=8350*0.10 + (income-8350)*0.15;
	else if(income<=82250)
		tax=8350*0.10 + (33950-8350)*0.15 + (income - 33950)*0.25;
	else if(income<=171500)
		tax=8350*0.10 + (33950-8350)*0.15 + (82250 - 33950)*0.25+ (income-82250)*0.28;
	
}

System.out.println("your tax is:  "+tax);
	}

}
