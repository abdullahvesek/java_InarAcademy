package chapters_04;

import java.util.Scanner;

public class Exercise_24 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the first city: ");
		String city1 = input.nextLine();
		System.out.print("Enter the second city: ");
		String city2 = input.nextLine();
		System.out.print("Enter the third city: ");
		String city3 = input.nextLine();

		String temp;
		if ((city2.compareTo(city1) < 0) && (city2.compareTo(city3) < 0)){
			temp = city1;
			city1 = city2;
			city2 = temp;	
		}
		else if ((city3.compareTo(city1) < 0) && (city3.compareTo(city2) < 0)) {
			temp = city1;
			city1 = city3;
			city3 = temp;
			
		}
		if (city3.compareTo(city2) < 0){
			temp = city2;
			city2 = city3;
			city3 = temp;
		}

		// Display cities in ascending order
		System.out.println(" three cities  order are " +
			city1 + " " + city2 + " " + city3);
	}


	}


