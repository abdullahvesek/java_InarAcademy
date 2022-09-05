package chapters_05;

public class Exercise_05 {

	public static void main(String[] args) {

		System.out.println("kilograms       pounds       |    pounds      kilograms ");
		int kilo=1;
		int count=0;
		final double RATE=2.2;
		
	int pound=20;
		
		
		while (count<100) {
			System.out.printf("%3d%-8s%.2f%-8s%3d%-8s%.2f\n",kilo,"        ",kilo*RATE,"       |      ",pound,"         " ,(pound/RATE));
			kilo+=2;
			pound+=5;
			count++;
			
		}

	}

}
