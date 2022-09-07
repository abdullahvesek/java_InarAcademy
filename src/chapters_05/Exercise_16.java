package chapters_05;

import java.util.Scanner;

public class Exercise_16 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("enter an int:  ");
		int x =input.nextInt();
		
		
		int index=2;
		
		
		while(x/index!=1) {
			
			if(x%index==0) {
				System.out.print(index+"  ");
		        x/=index;
			}
			else
				index++;
			
		}
		System.out.println(x+".");
	
	
	}

}
