package weeks.weeks_03;

import java.util.Scanner;

public class Question_02 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("Enter number 1 and number 2 and number 3 : ");
		double number1=input.nextDouble();
		double number2=input.nextDouble();
		double number3=input.nextDouble();
		
		
		if (number1>number2 && number1>number3) {
			if(number2>number3) {
				System.out.println(number3+"  "+"  "+ number2+"  "+"  "+number1+"  ");
			}else{
					
				System.out.println(number3 +"  " +number1+"   "  +number2+"  ");
				
			}
		}
			if  (number2>number3 && number2>number1) {
				if(number1>number3) {
					System.out.println(number3+"  "+number1+"   "+number2+"");
				}else {
						System.out.println(number1  +"  "+number3 +"   "+number2+"");
					}
	}
	if (number3>number2 && number3>number1) {
		if(number2>number1) {
			System.out.println(number1  +"   "+number2 +"   "+number3+"");
		}
		else {
			System.out.println(number2  +"   "+number1  +"    "+number3+"");
		}
	}
	
	}

	}


