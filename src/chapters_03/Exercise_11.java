package chapters_03;

import java.util.Scanner;

public class Exercise_11 {

	public static void main(String[] args) {
Scanner input= new Scanner(System.in);
System.out.println("enter year and month in number:  ");
int year =input.nextInt();
int month=input.nextInt();

boolean leap=(year%4==0 && year%100!=0)|| (year%400==0);

switch (month) {
case 1 : System.out.println("january "+ year+ "has 31 days"  );break;
case 2 :System.out.println("fabruary "+ year+ "has "+((leap)?"29 days":"28 days"));break;
case 3 : System.out.println("march "+ year+ "has 31 days"  );break;
case 4 : System.out.println("april "+ year+ "has 30 days"  );break;
case 5 : System.out.println("mayıs "+ year+ "has 31 days"  );break;
case 6 : System.out.println("june "+ year+ "has 30 days"  );break;
case 7 : System.out.println("july "+ year+ "has 31 days"  );break;
case 8 : System.out.println("august "+ year+ "has 31 days"  );break;
case 9 : System.out.println("september "+ year+ "has 3 days"  );break;
case 10 : System.out.println("october"+ year+ "has 31 days"  );break;
case 11: System.out.println("november"+ year+ "has 30 days"  );break;
case 12: System.out.println("december"+ year+ "has 31 days"  );break;
}
	}

}
