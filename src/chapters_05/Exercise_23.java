package chapters_05;

public class Exercise_23 {

	public static void main(String[] args) {
		
		
		double sum1=0;
		
		for(int i =1; i<5001; i++) {
			sum1+=1/i;
			
		}

		double sum2=0;
		
		for(int i =5000; i>0; i++) {
			sum2+=1/i;
		}
	
		
		if(sum1==sum2)
			System.out.println("same");
		else
			System.out.println("not same");
		
		
		
	}

}
