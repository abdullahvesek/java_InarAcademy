package chapters_03;

import java.util.Scanner;

public class Exercise_07 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter an amount in double");
		double amount=input.nextDouble();
		int remaining=(int) amount*100;
		int dollars=remaining / 100;
		remaining=remaining  % 100;
		int quarters=remaining/25;
		remaining=remaining%25;
		int dimes=remaining / 10;
		remaining=remaining%10;
		int nickels=remaining/5;
		remaining=remaining%5;
		int pennies=remaining;
		
		System.out.println("your amount consist of  " + dollars + "dollars  "+ quarters+ "quarters"+ 
		dimes + "dimes  "+nickels+"nickels  "+ pennies+ "pennies");
		
		

}
}