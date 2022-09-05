package chapters_05;

public class Exercise_06 {

	public static void main(String[] args) {
		System.out.println("miles      kilometers    |  kilometers     miles ");
		
		int count=1;
		int miles=1;
		int kilometers=20;
		double rate=1.6;
		
		while(count<11) {
			
			System.out.printf("%3d%-8s%.2f%-8s%3d%-8s%.2f\n",miles,"          ",miles*rate,"        |   ",kilometers,"       ",kilometers/rate);
			
			miles++;
			kilometers+=5;
			count++;
			
		}

	}

}
