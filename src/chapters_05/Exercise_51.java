package chapters_05;

import java.util.Scanner;

public class Exercise_51 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("enter s1: ");
		String s1=input.nextLine();
		
		
		System.out.println("enter s2 :");
		
		String s2=input.nextLine();
	
	for(int i=0;i<Math.min(s1.length(),s2.length()); i++) {
		
		if (s1.charAt(i)==s2.charAt(i))
			System.out.print(s1.charAt(i));
		
		else if(s1.charAt(i)!=s2.charAt(i))
			System.exit(1);
	
	
	}
	
	
	
	}

}
