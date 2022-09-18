package chapters_06;

import java.util.Scanner;

public class Exercise_02 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("enter a number:  ");
		int number =input.nextInt();
		
		
		
		System.out.println("THE SUM IS : "+sumDigit(number));
		
	}

public static int sumDigit(long n) {
	
	int sum=0;
	
	while (n/10!=0) {
		sum+=n%10;
		n=n/10;
		}

	sum+=n;
	
	return sum;


}

}
