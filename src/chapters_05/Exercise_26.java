package chapters_05;

public class Exercise_26 {

	public static void main(String[] args) {
		

	double e=0;
	

	for (double i = 1; i <= 10000; i++) {
				double divisor = i;
				for (double k = i - 1; k >= 1; k--) {
					divisor *= k;
				}
				e += 1 / divisor;  
			}

	
	System.out.println("the value for 10000 is :  "+e);
	
}
}