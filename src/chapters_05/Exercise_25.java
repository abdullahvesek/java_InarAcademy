package chapters_05;

public class Exercise_25 {

	public static void main(String[] args) {
	
		double pi = 0;
		
		for(double i=10000.0; i<=100000.0; i+=10000) {
			
			for(double k=1; i<i+2; i++) {
				
				pi+=4*(Math.pow(-1, i+1)/2*i-1);
				
				}
		
		System.out.println("the pi for  "+ i+"  " + pi);
		
		
		}

	}

}
