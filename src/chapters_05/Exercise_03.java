package chapters_05;

public class Exercise_03 {

	public static void main(String[] args) {
		final double RATE=2.2;
		System.out.println("kilograms       pounds");
		int number=1;
		
		int count=0;
		
		
		while (count<199) {
			System.out.printf("%4d%-8s%.2f \n", number,"         ",(number*RATE));
			number++;
			count++;
			
		}

	}

}
