package chapters_06;

import java.util.Scanner;

public class Exercise_37 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("enter number:  ");
		int number=input.nextInt();
		System.out.println("enter format :  ");
		int format=input.nextInt();
		
		
		System.out.println("the formatted number is  "+ format( number,format));
		

	}

	public static String format(int number, int width) {
		String s=number+"";
		
		if(width<=s.length())
			return s;
		
		else {
			String str="";
			
			for(int i=1;i<=width-s.length();i++) {
				str+='0';
				
			}
		str=str+s;
		return str;
		}
			

	
	
	}







}
