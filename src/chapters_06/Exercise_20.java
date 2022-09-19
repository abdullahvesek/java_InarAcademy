package chapters_06;

import java.util.Scanner;

public class Exercise_20 {

	public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
	System.out.println("enter a string:  ");
	String s=input.next();
	
	System.out.println("the count of letters is:  "+countLetters(s));
	

	}
	public static int countLetters(String s) {
		int count=0;
		for(int i=0;i<=s.length()-1;i++) {
			if(Character.isLetter(s.charAt(i))) {
				count++;
			}
		}
	return count;
	
	
	}




}
