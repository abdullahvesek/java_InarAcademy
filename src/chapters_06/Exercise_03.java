package chapters_06;

import java.util.Scanner;

public class Exercise_03 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("enter an int:  ");
		int number=input.nextInt();
		
		
		if(isPalindrom(reverse(number)))
			System.out.println("the number is palindrom");
		else 
			System.out.println("the number is not palindrom0");
	}


public static int reverse(int x) {
	String reverse = ""; 	

	String n = x + ""; 
	
	for (int i = n.length() - 1; i >= 0; i--) {
		reverse += n.charAt(i);
	}
	return Integer.parseInt(reverse); 
}

public static boolean isPalindrom(int y) {
	return y == reverse(y) ? true : false;
	
}





}
