package chapters_05;

import java.util.Scanner;

public class Exercise_49 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("enter a string: ");
		String s=input.nextLine();
		
		String str=s.toLowerCase();
		int count=0;
		int count2=0;
		
		for(int i=0; i<str.length() ; i++) {
		
		if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u'&&str.charAt(i)!=' ')
			
		count++;
		
		else if(str.charAt(i)!='a'&&str.charAt(i)!='e'&&str.charAt(i)!='i'&&str.charAt(i)!='o'&&str.charAt(i)!='u'&&str.charAt(i)!=' ')
		count2++;
		
		
		}

	System.out.println("the number of vowels is: "+count+"  consonnant is: "+count2);
	
	
	}

}
