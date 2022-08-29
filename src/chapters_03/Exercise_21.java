package chapters_03;

import java.util.Scanner;

public class Exercise_21 {

	public static void main(String[] args) {
Scanner input=new Scanner(System.in);
System.out.println("enter year and month in digit:  ");
int year=input.nextInt();
int month=input.nextInt();

if(month==1 || month==2) {
	month=(month==1?13:14);
	year--;
	
}
double j=year/100;
double k=year%100;


int dayOfWeek=(int) (month +(26*(month+1)/10+ k+k/4+j/4+(5*j))%7);

System.out.print("the day of week is:  ");

switch(dayOfWeek) {
case 0 :System.out.println("saturday");
case 1 :System.out.println("sunday");
case 2 :System.out.println("monday");
case 3 :System.out.println("tuesday");
case 4 :System.out.println("wednesday");
case 5 :System.out.println("thursday");
case  6:System.out.println("friday");



}
	}

}
