package weeks.weeks_03;

import java.util.Scanner;

public class Question_03 {

	public static void main(String[] args) {
Scanner input=new Scanner(System.in);
System.out.println("enter 4 digit :  ");
int number=input.nextInt();

System.out.println(number%10 + "  "+ (number/10)%10 + "   "+ (number/100)%10 + "  "+ number/1000 +" ");

	}

}
