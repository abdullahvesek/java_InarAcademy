package chapters_06;

import java.util.Scanner;

public class Exercise_23 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("ENTER A STRİNG AND CHAR:  ");
		String s=input.nextLine();
		char ch=s.charAt(0);
		System.out.println("the number of char is: "+count(s,ch));
		
		
		
		

	}

	public static int count(String str, char a) {
		
		int count=0;
		
		for(int i =0;i<=str.length()-1;i++) {
			if(str.charAt(i)==a)
				count++;
			
		}
		return count;
		
		
	}


}
