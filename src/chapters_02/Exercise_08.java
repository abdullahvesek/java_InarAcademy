package chapters_02;

import java.util.Scanner;

public class Exercise_08 {

	public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
	System.out.print("Enter the time zone offset: ");
	
	int i =input.nextInt();
	
	
	
	long totalMilliseconds=System.currentTimeMillis();
	long totalSeconds=totalMilliseconds / 1000;
	long currentSeconds = totalSeconds%60;
	long totalMinutes=totalSeconds / 60;
	long currentMinutes= totalMinutes%60;
	long totalHours=totalMinutes / 60;
	long currentHours= totalHours%24;
	currentHours= currentHours + i;
	
	System.out.println("time is "+ currentHours+": "+currentMinutes+ ": "+currentSeconds );
	
	
	

	}

}
