package chapters_06;

import java.util.Scanner;

public class Exercise_25 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("enter a long for milliseconds:  ");
		long millis=input.nextLong();
		
		
		System.out.println("the hour:minute:second  "+ convertMillis( millis));
		

	}

	public static String convertMillis(long millis) {
		millis/=1000;
		
		String result1=millis%60+"";
		
		millis/=60;
		
		String result2=millis%60+"";
		
		millis/=60;
		
		String result3=millis+"";
		
		String str=result3+" : "+result2+" : "+result1;
		
		return str;
		
		
	}




}
