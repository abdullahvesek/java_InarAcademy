package chapters_06;

import java.util.Scanner;

public class Exercise_31 {

	public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
	System.out.println("enter card number:  ");
	long number=input.nextLong();
	
	System.out.println("the card is : "+(isValid(number)?"valid":"invalid"));
	
	
	
	}

	public static int sumOfDoubleEvenPlace(long number) {
	int sum=0;	
	String s=number+"";
	
	for(int i=s.length()-2;i>=0;i-=2) {
		sum += getDigit(Integer.parseInt(s.charAt(i) + "") * 2);
	}
	return sum;
	
	
	
	}
	
	
	public static int sumOfOddPlace(long number) {
		int sum=0;
		String s=number+"";
		
		for(int i=s.length()-1;i>=0;i-=2) {
			sum+=Integer.parseInt(s.charAt(i)+"");
			
			
		}
	
	return sum;
	
	
	}
	
	
	
	
	public static boolean isValid(long number) {
		if((((sumOfDoubleEvenPlace(number)+sumOfOddPlace(number))/10)==0))
				return true;
		else
			return false;
	}
	
	public static int getDigit(int number) {
		if (number < 9)
			return number;
		else
			return number / 10 + number % 10;
	}


}
