package chapters_05;

public class Exercise_04 {

	public static void main(String[] args) {
		final double RATE=1.609;
		System.out.println("MILES            KILOMETERS");
		int miles=1;
		int count=0;
		
		while (count<199) {
			
		System.out.printf("%4d%-8s%.2f\n",miles,"        ",miles*RATE);
		
		miles++;
		count++;
		
		
		}

	}

}
