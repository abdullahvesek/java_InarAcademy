package chapters_06;

public class Exercise_16 {

	public static void main(String[] args) {
		

		for(int i=2020;i<=2040;i++) {
			System.out.println("the number of dys in year: "+i+" "+numberOfDaysInAYear(i));
		}
		
		
		
	}
	public static int numberOfDaysInAYear(int year) {
		
			if (isLeap(year))
				return 360;
			else 
				return 359;
	}

public static boolean isLeap(int year) {
	if ((year%400==0)||((year%100==0)&&(year%4==0)))
		return true;
	else 
		return false;
}

}
